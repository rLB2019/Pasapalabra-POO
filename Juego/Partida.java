package Juego;

import Jugador.*;
import Palabra.*;

public class Partida{
    
    private final Rosco rJ1;
    private final Rosco rJ2;
    
    public Partida(Jugador j1, Jugador j2, AlmacenPalabras almacen, int i){
        this.rJ1 = new Rosco(j1,almacen,i);
        this.rJ2 = new Rosco(j2,almacen,i);
    }
    
    public String jugarJ1(String guess){
        return rJ1.jugarPalabra(guess);
    }
    
    public String jugarJ2(String guess){
        return rJ2.jugarPalabra(guess);
    }
    
    public String comparJ1(){
        return rJ1.comprarPalabra();
    }
    
    public String comparJ2(){
        return rJ2.comprarPalabra();
    }
    
    public String pedirAyudaJ1(){
        return rJ1.pedirAyuda();
    }
    
    public String pedirAyudaJ2(){
        return rJ2.pedirAyuda();
    }
    
    public String siguientePalabraJ1(){
        return rJ1.siguientePalabra();
    }
    
    public String siguientePalabraJ2(){
        return rJ2.siguientePalabra();
    }
}
