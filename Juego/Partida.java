package Juego;

import Jugador.*;
import Palabra.*;

public class Partida{
    
    private final Rosco rJ1;
    private final Rosco rJ2;
    
    public Partida(Jugador j1, Jugador j2, AlmacenPalabras almacen, int i){
        rJ1 = new Rosco(j1,almacen,i);
        rJ2 = new Rosco(j2,almacen,i);
    }    
}
