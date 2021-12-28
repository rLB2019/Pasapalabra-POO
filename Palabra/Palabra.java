package Palabra;

import java.util.ArrayList;

/**
 *
 * @author alvaro
 */
public class Palabra {
    private final char inicial;
    private final String palabra;
    private boolean acertada;
    private boolean fallada;
    private boolean aplazada;
    private ArrayList<Definicion> definiciones;
    
    public Palabra(char i, String p, boolean acertada, boolean f, boolean aplazada, Definicion definicion){
        this.inicial = i;
        this.palabra = p;
        this.acertada = acertada;
        this.fallada = f;
        this.aplazada = aplazada;
        definiciones.add(definicion);
    }
    
    public String getPalabra(){
        return palabra;
    }
    
    public char getLetra(){
        return inicial;
    }
    
    public int getEstado(){
        //Devolvemos si la letra esta acertada = 1, fallada = -1; o aplazada = 0;
        if(acertada){
            return 1;
        }else if(fallada){
            return -1;
        }else{
            return 0;
        }
    }
    
    public void setEstado(int i){
        switch(i){
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
    
    public void agregarDef(Definicion d){
        definiciones.add(d);
    }
    
    public void borrarDef(Definicion d){
        definiciones.remove(d);
    }
    
    public void cambiarDef(String d){
         definiciones.clear();
         definiciones.add(d);
    }
}
