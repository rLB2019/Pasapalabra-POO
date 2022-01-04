package Juego;

import java.io.Serializable;
import java.util.ArrayList;


public class AlmacenPartidas implements Serializable {
    private final ArrayList<Partida> partidas; // HashSet
    
    public AlmacenPartidas() {
        this.partidas = new ArrayList<>();
    }
    
    public ArrayList<Partida> getPartidas() {
        return this.partidas;
    }
    
    public void agregarPartida(Partida nuevaPartida) {
        partidas.add(nuevaPartida);
    }
    
    public Partida editarPartida(Partida p){
        //No se que hay que editar aqui sin ningun parametro :c
        return p;
    }
}
