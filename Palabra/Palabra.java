package Palabra;

import java.io.Serializable;
import java.util.ArrayList;
import Jugador.*;
import static java.lang.Math.random;

public class Palabra implements Serializable {

    private final char inicial;
    private final String palabra;
    private boolean acertada;
    private boolean fallada;
    private boolean aplazada;
    private ArrayList<Definicion> definiciones;

    public Palabra(char i, String p, boolean acertada, boolean f, boolean aplazada, Definicion definicion) {
        this.inicial = i;
        this.palabra = p;
        this.acertada = acertada;
        this.fallada = f;
        this.aplazada = aplazada;
        definiciones.add(definicion);
    }

    public String getPalabra() {
        return palabra;
    }

    public char getLetra() {
        return inicial;
    }

    public int getEstado() {
        //Devolvemos si la letra esta acertada = 1, fallada = -1; o aplazada = 0;
        if (acertada) {
            return 1;
        } else if (fallada) {
            return -1;
        } else if (aplazada) {
            return 0;
        }
        return 0;
    }

    public void setEstado(int i) {
        switch (i) {
            case 1:
                acertada = true;
                fallada = false;
            case -1:
                acertada = false;
                fallada = true;
            default:
                acertada = false;
                fallada = false;
                aplazada = true;
        }
    }

    public void agregarDef(Definicion d) {
        definiciones.add(d);
    }

    public void borrarDef(Definicion d) {
        definiciones.remove(d);
    }

    public void cambiarDef(Definicion d) {
        definiciones.clear();
        definiciones.add(d);
    }

    public Definicion getDefinicion(int i) {
        if (i < definiciones.size() && i > 0) {
            return definiciones.get(i);
        }
        return null;
    }

    public String pedirAyuda(Jugador j) {
        String pista = new String();
        if (definiciones.size() >= 1) {
            //Mostrar segunda definicion
            pista = pista.concat("Otra Definicion: ");
            pista = pista.concat(getDefinicion(1).getDefinicion());
        } else {
            //Mostrar letras
            pista = pista.concat("La palabra contiene: ");
            int size = palabra.length();
            size = size / 3;
            for (int i = 0; i < size; i++) {
                pista = pista + palabra.charAt((int) (random() * palabra.length()));
                pista = pista.concat("\t");
            }
        }
        j.restarPuntos(5);
        return pista;
    }

    public String comprarPalabra(Jugador j) {
        String solucion = "La palabra es: " + this.palabra;
        j.restarPuntos(20);
        return solucion;
    }

    public boolean comparaPalabra(String p) {
        if (this.palabra.equals(p)) {
            setEstado(1);
            return true;
        } else {
            setEstado(-1);
            return false;
        }
    }
}
