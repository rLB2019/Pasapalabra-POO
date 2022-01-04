package Juego;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BackupClasificacion {
    
    private Clasificacion clasificacion;
    
    public BackupClasificacion(){
        this.clasificacion = new Clasificacion();
    }
    
    public BackupClasificacion(Clasificacion nuevaClasificacion){
        this.clasificacion = nuevaClasificacion;
    }
    
    public Clasificacion getClasificacion(){
        return this.clasificacion;
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

            salidaObjeto.writeObject(this.clasificacion);
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

            this.clasificacion = (Clasificacion) entradaObjetos.readObject();
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
