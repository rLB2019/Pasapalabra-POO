package Juego;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import Jugador.*;

public class Clasificacion {
    private final ArrayList<Jugador> jugadores;
    
    public Clasificacion(){
        this.jugadores = new ArrayList<>();
    }
    
    public Clasificacion(ArrayList<Jugador> usuarios) {
        this.jugadores = new ArrayList<>(usuarios);
        Collections.sort(this.jugadores);
        Collections.reverse(this.jugadores); // Collections.sort(this.users, Collections.reverseOrder());
    }

    @Override
    public String toString() {
        String resultado = "";
        for (Jugador player: this.jugadores) {
            resultado += "***** " + player + " *****\n" + player.estadisticas() + "\n";
        }
        return resultado;
    }
    
    public void ordenarPorcentajeVictorias() {
        Collections.sort(this.jugadores);
        Collections.reverse(jugadores);
    }
    
    public void ordenarPartidasGanadas() {
        Collections.sort(this.jugadores, new PartidasGanadasComparador());
        Collections.reverse(this.jugadores);
    }
    
    public boolean volcarATxt(File fichero) {
        boolean ok = true;
        
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        
        try {
            fw = new FileWriter(fichero);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            
            for (Jugador player: this.jugadores) {
                pw.println(player);
            }
            pw.flush();
        } catch (IOException ex) {
            ok = false;
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
                if (bw != null) {
                    bw.close();
                }
                if (pw != null) {
                    pw.close();
                }
            } catch (IOException ex) {
                ok = false;
            }
        }
        return ok;
    }
}
