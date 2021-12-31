/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import Jugador.*;
import java.util.Comparator;

public class PartidasGanadasComparador implements Comparator<Jugador> {
    @Override
    public int compare(Jugador jugador1, Jugador jugador2) {
        if (jugador1.partidas_ganadas() < jugador2.partidas_ganadas()) {
            return -1;
        } else if (jugador1.partidas_ganadas() > jugador2.partidas_ganadas()) {
            return 1;
        }
        return 0;
    }
}
