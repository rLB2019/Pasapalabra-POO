package Juego;

import Jugador.*;
import Palabra.*;

public class Entrenamiento {

    private final Rosco rosco;

    
    //Creamos el objeto con un jugador un almacen de palabras y el numero de letras que queremos jugar
    public Entrenamiento(Jugador jugador, AlmacenPalabras almacen, int i) {
        rosco = new Rosco(jugador, almacen, i);
        if (jugador.getPuntos() <= 0) {
            jugador.sumarPuntos(5);
        }
    }

    
    //Devuelve un string que indica el estado de la partida, si se ha dado la primera vuelta al rosco
    //o si se ha acabado la partida
    public String jugarPalabra(String guess) {
        return rosco.jugarPalabra(guess);
    }
    
    //Devuelve la solucion de la palabra para mostrarla por pantalla
    public String comprarPalabra() {
        rosco.getJugador().sumarPuntos(20);//En el entrenamiento las ayudas son gratis
        return rosco.comprarPalabra();
    }

    //Devuelve un string con la ayuda para mostrarla por pantalla
    public String pedirAyuda() {
        rosco.getJugador().sumarPuntos(5);//En el entrenamiento las ayudas son gratis
        return rosco.pedirAyuda();
    }

    //Devuelve la siguiente palabra
    public Palabra siguientePalabra() {
        return rosco.siguientePalabra();
    }
}
