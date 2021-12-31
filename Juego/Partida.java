/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

import Jugador.*;
import Palabra.*;

/**
 *
 * @author MrKanoa
 */
public class Partida extends Entrenamiento{
    
    private final Rosco rJ1;
    private final Rosco rJ2;
    
    public Partida(Jugador j1, Jugador j2, AlmacenPalabras almacen){
        rJ1 = new Rosco(j1,almacen);
        rJ2 = new Rosco(j2,almacen);
    }
    
}
