package Juego;

import Jugador.*;
import Palabra.*;

public class Partida extends Entrenamiento{
    
    private final Rosco rJ1;
    private final Rosco rJ2;
    
    public Partida(Jugador j1, Jugador j2, AlmacenPalabras almacen){
        rJ1 = new Rosco(j1,almacen);
        rJ2 = new Rosco(j2,almacen);
    }
    
    public Partida(){
        
    }
    
}
