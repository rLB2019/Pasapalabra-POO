package Jugador;

import Juego.*;

public class Administrador extends Jugador {

    public Administrador() {
        super();
        setPuntos(1000000);
    }

    public Administrador(String nombre, char [] clave) {
        super(nombre, clave);
        setPuntos(10000000);
    }

    public String informacionPartida(Partida p) {
        return p.toString();
    }

    public void verClasificacion() {
        //Ver la clasificacion y poder ordenarla por partidas ganadas, puntos conseguidos
        //Se podrá exportar a un txt
    }

}
