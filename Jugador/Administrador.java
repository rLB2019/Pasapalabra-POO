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

    public void informacionPartida(Partida p) {
        //Sacamos la info de partida
        //Como aun no tenemos partida no podemos hacer esto
        //Hay que sacar jugadores, marcador y detalle de los roscos(letras palabras y pistas usadas)
    }

    public void verClasificacion() {
        //Ver la clasificacion y poder ordenarla por partidas ganadas, puntos conseguidos
        //Se podrá exportar a un txt
    }

}
