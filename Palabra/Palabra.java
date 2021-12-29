package Palabra;

import java.io.Serializable;
import java.util.ArrayList;
import Jugador.*;

/**
 *
 * @author alvaro
 */
public class Palabra implements Serializable {

    private final char inicial;
    private final String palabra;
    private boolean acertada;
    private boolean fallada;
    private boolean aplazada;
    private boolean pistaDefinicion;
    private boolean pistaLetras;
    private ArrayList<Definicion> definiciones;

    public Palabra(char i, String p, boolean acertada, boolean f, boolean aplazada, Definicion definicion) {
        this.inicial = i;
        this.palabra = p;
        this.acertada = acertada;
        this.fallada = f;
        this.aplazada = aplazada;
        this.definiciones.add(definicion);
        this.pistaDefinicion = false;
        this.pistaLetras = false;
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
        } else {
            return 0;
        }
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
    
    public int hayPista(){
        if(pistaDefiniciones && pistaLetras) return 2;
        if(pistaDefiniciones || pistaLetras) return 1;

    public String pedirAyuda(int tipo, Jugador j) {
        if (tipo == 1) {//Damos la definicion 2
            pistaDefinicion = true;
            return definiciones.get(1).getDefinicion();
        } else if (tipo == 0) {//Damos letras desordenadas de la palabra
            //Hay que crear un metodo para crear la pista
            pistaLetras = true;
            //return X; //Devolvemos las letras en String
        }
        j.restarPuntos(5);
    }
    
    public String comprarPalabra(Jugador j){
        j.restarPuntos(10);
        return palabra;
    }    
}
