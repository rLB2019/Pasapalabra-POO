package Juego;

import Jugador.*;
import Palabra.*;

public class Entrenamiento {

    private final Rosco rosco;

    public Entrenamiento(Jugador jugador, AlmacenPalabras almacen, int i) {
        rosco = new Rosco(jugador, almacen, i);
        if (jugador.getPuntos() <= 0) {
            jugador.sumarPuntos(5);
        }
    }

    public String jugarPalabra(String guess) {
        return rosco.jugarPalabra(guess);
    }

    public String comprarPalabra() {
        rosco.getJugador().sumarPuntos(20);
        return rosco.comprarPalabra();
    }

    public String pedirAyuda() {
        rosco.getJugador().sumarPuntos(5);
        return rosco.pedirAyuda();
    }

    public String siguientePalabra() {
        return rosco.siguientePalabra();
    }
}
