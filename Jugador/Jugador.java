/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

import java.util.ArrayList;
import Juego.*;

/**
 *
 * @author alvaro
 */
public class Jugador {

    private static final String NOMBRE_ADMIN = "admin";
    private static final String CLAVE_ADMIN = "admin";
    private static final int PUNTOS_INICIALES = 50;

    private final String nombre;
    private final String clave;
    private int puntos;
    private ArrayList<Partida> partidas;

    private int partidas_jugadas;
    private int partidas_ganadas;
    private int partidas_empatadas;
    private int partidas_perdidas;

    private boolean esAdministrador;

    public Jugador() {
        this.nombre = NOMBRE_ADMIN;
        this.clave = CLAVE_ADMIN;
        this.esAdministrador = true;
        partidas = new ArrayList<>();
        this.partidas_jugadas = 0;
        this.partidas_ganadas = 0;
        this.partidas_empatadas = 0;
        this.partidas_perdidas = 0;
        this.puntos = 1000000;
    }

    public Jugador(String n, String c) {
        this.nombre = n;
        this.clave = c;
        this.partidas = new ArrayList<>();
        this.partidas_jugadas = 0;
        this.partidas_ganadas = 0;
        this.partidas_empatadas = 0;
        this.partidas_perdidas = 0;
        this.puntos = PUNTOS_INICIALES;//Podemos cambiar los puntos iniciales
    }

    public String getNombre() {
        return this.nombre;
    }

    public int partidas_jugadas() {
        return this.partidas_jugadas;
    }

    public int partidas_ganadas() {
        return this.partidas_ganadas;
    }

    public int partidas_empatadas() {
        return this.partidas_empatadas;
    }

    public int partidas_perdidas() {
        return this.partidas_perdidas;
    }

    public boolean esAdministrador() {
        return this.esAdministrador;
    }

    public ArrayList<Partida> getPartidas() {
        return this.partidas;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Jugador otroJugador = (Jugador) obj;
        return this.nombre.equalsIgnoreCase(otroJugador.nombre);
    }

    public void agregarPartida(Partida partida) {
        this.partidas.add(partida);
        this.partidas_jugadas++;
    }

    public boolean esLoginCorrecto(String n, String c) {
        return this.nombre.equalsIgnoreCase(n) && this.clave.equalsIgnoreCase(c);
    }

    public void incrementarPartidasGanadas() {
        this.partidas_ganadas++;
    }

    public void incrementarPartidasEmpatadas() {
        this.partidas_empatadas++;
    }

    public void incrementarPartidasPerdidas() {
        this.partidas_perdidas++;
    }

    public void setPuntos(int p) {
        this.puntos = p;
    }

    public void sumarPuntos(int p) {
        this.puntos += p;
    }

    public void restarPuntos(int p) {
        this.puntos -= p;
    }

    public String Estadisticas() {
        String resultado = "";
        resultado += "Partidas Jugadas: " + this.partidas_jugadas + "\n";
        resultado += "Partidas ganadas: " + this.partidas_ganadas + "\n";
        resultado += "Partidas Empatadas: " + this.partidas_empatadas + "\n";
        resultado += "Partidas Perdidas: " + this.partidas_perdidas + "\n";
        resultado += "Puntos: " + this.puntos + "\n";
        return resultado;
    }

    public void mostrarHistorial() {
        //Hay que mostrar el arraylist de partidas del usuario.
    }
}
