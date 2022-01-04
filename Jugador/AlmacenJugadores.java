package Jugador;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;


public class AlmacenJugadores implements Serializable {
    private final ArrayList<Jugador> jugadores; // HashSet
    
    public AlmacenJugadores() {
        this.jugadores = new ArrayList<>();
        this.jugadores.add(new Jugador());
    }
    
    public ArrayList<Jugador> getJugadores() {
        return this.jugadores;
    }
    
    public Jugador jugadorConNombre(String nombre) {
        Jugador jugador = null;
        boolean encontrado = false;
        Iterator<Jugador> it = this.jugadores.iterator();
        while (!encontrado && it.hasNext()) {
            jugador = it.next();
            encontrado = jugador.getNombre().equalsIgnoreCase(nombre);
        }
        if (encontrado) {
            return jugador;
        } else {
            return null;
        }
    }
    
    public boolean contieneJugadorConNombre(String nombre) {
        boolean encontrado = false;
        Iterator<Jugador> it = this.jugadores.iterator();
        while (!encontrado && it.hasNext()) {
            Jugador usuario = it.next();
            encontrado = usuario.getNombre().equalsIgnoreCase(nombre);
        }
        return encontrado;
    }
    
        
    
    public Jugador getJugador(String nombre, char [] clave){
        
        Jugador jugador = null;
        
        boolean encontrado = false;
        Iterator<Jugador> it = getJugadores().iterator();
        while (!encontrado && it.hasNext()) {
            jugador = it.next();
            encontrado = jugador.esLoginCorrecto(nombre, clave);
        }
        
        if (!encontrado) {
            jugador = null;
        }
        
        return jugador;
    }
    
    public Jugador agregarJugador(String nombre, char [] clave) {
        Jugador jugador = null;
        if (!contieneJugadorConNombre(nombre)) {
            jugador = new Jugador(nombre, clave);
            this.jugadores.add(jugador);
        }
        return jugador;
    }
}
