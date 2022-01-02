/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jugador;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author MrKanoa
 */
public class BackupJugadores {

    private AlmacenJugadores almacen;

    public BackupJugadores() {
        this.almacen = new AlmacenJugadores();
    }

    public BackupJugadores(AlmacenJugadores nuevoAlmacen) {
        this.almacen = nuevoAlmacen;
    }

    public AlmacenJugadores getAlmacen() {
        return this.almacen;
    }

    public boolean guardarBackup(File fichero) {
        boolean ok = true;

        FileOutputStream salidaFichero = null;
        BufferedOutputStream bufferSalida = null;
        ObjectOutputStream salidaObjeto = null;

        try {
            salidaFichero = new FileOutputStream(fichero);
            bufferSalida = new BufferedOutputStream(salidaFichero);
            salidaObjeto = new ObjectOutputStream(bufferSalida);

            salidaObjeto.writeObject(this.almacen);
            salidaObjeto.flush();
        } catch (IOException ex) {
            ok = false;
        } finally {
            try {
                if (salidaFichero != null) {
                    salidaFichero.close();
                }

                if (bufferSalida != null) {
                    bufferSalida.close();
                }

                if (salidaObjeto != null) {
                    salidaObjeto.close();
                }
            } catch (IOException ex) {
                ok = false;
            }
        }

        return ok;
    }

    public boolean cargarBackup(File fichero) {
        boolean ok = true;

        FileInputStream entradaFichero = null;
        BufferedInputStream bufferEntrada = null;
        ObjectInputStream entradaObjetos = null;

        try {
            entradaFichero = new FileInputStream(fichero);
            bufferEntrada = new BufferedInputStream(entradaFichero);
            entradaObjetos = new ObjectInputStream(bufferEntrada);

            this.almacen = (AlmacenJugadores) entradaObjetos.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ok = false;
        } finally {
            try {
                if (entradaFichero != null) {
                    entradaFichero.close();
                }

                if (bufferEntrada != null) {
                    bufferEntrada.close();
                }

                if (entradaObjetos != null) {
                    entradaObjetos.close();
                }
            } catch (IOException ex) {
                ok = false;
            }
        }

        return ok;
    }
}
