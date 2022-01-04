package Juego;

import Jugador.*;
import Palabra.*;
import static java.lang.Math.random;
import java.util.ArrayList;

public class Rosco {

    private final Jugador jugador;
    private ArrayList<Palabra> palabras;
    private int palabrasAcertadas;
    private int palabrasFalladas;
    private int palabrasAplazadas;
    private int ronda;
    private int letra;

    public Rosco(Jugador j, AlmacenPalabras almacen, int nLetras) {
        this.jugador = j;

        //Inicializamos las palabras de forma aleatoria;
        for (int i = 0; i < nLetras; i++) {
            ArrayList<Palabra> palabrasConLetra = almacen.getPalabras(i);
            palabras.add(palabrasConLetra.get((int) (random() * palabrasConLetra.size())));
        }
        ronda = 0;
        letra = 0;
        palabrasAcertadas = 0;
        palabrasFalladas = 0;
        palabrasAplazadas = 0;
    }

    public String jugarPalabra(String guess) {
        String salida = "";
        if (guess == null) {
            if (palabras.get(letra).getEstado() != 0) {
                palabrasAplazadas++;
                palabras.get(letra).setEstado(0);
            }
        }
        if (palabras.get(letra).comparaPalabra(guess)) { // comparaPalabra() me pone el estado de acertado o fallado
            palabrasAcertadas++;
        } else {
            palabrasFalladas++;
        }

        letra++;

        //Comprobamos si hemos acabado la primera ronda
        if (ronda <= 0 && letra == Letras.N - 1) {
            letra = 0;
            ronda++;
            salida = salida.concat("Has acabado la primera vuelta al rosco!");
        }

        //Comprobamos si hemos acabado la partida
        if (ronda >= 1 && letra >= Letras.N) {
            salida = acabarPartida();
        }
        return salida;
    }

    public String siguientePalabra() {
        Palabra p = palabras.get(letra);
        return p.getLetra() + "";
    }

    private String acabarPartida() {
        String salida = "Has acabado la partida!!!\n";
        salida = salida.concat("Has acertado " + palabrasAcertadas + "\n");
        salida = salida.concat("Has fallado " + palabrasFalladas + "\n");
        salida = salida.concat("Has dejado " + palabrasAplazadas + " sin resolver\n");

        return salida;
    }

    public String pedirAyuda() {
        return palabras.get(letra).pedirAyuda(jugador);
    }

    public String comprarPalabra() {
        return palabras.get(letra).comprarPalabra(jugador);
    }
    
    public Jugador getJugador(){
        return this.jugador;
    }
}
