package Juego;

import java.io.Serializable;
import java.util.ArrayList;


public class AlmacenPartidas implements Serializable {
    private final ArrayList<Partida> partidas; // HashSet
    
    public AlmacenPartidas() {
        this.partidas = new ArrayList<>();
        this.partidas.add(new Partida());
    }
    
    public ArrayList<Partida> getPartidas() {
        return this.partidas;
    }
    
    public void agregarPartida(Partida nuevaPartida) {
        partidas.add(nuevaPartida);
    }
    
    public Partida editarPartida(Partida p){
        
    }
}
