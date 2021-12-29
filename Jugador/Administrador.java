/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jugador;

import Juego.*;

/**
 *
 * @author MrKanoa
 */
public class Administrador extends Jugador {

    public Administrador() {
        super();
        setPuntos(1000000);
    }

    public Administrador(String nombre, String clave) {
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
