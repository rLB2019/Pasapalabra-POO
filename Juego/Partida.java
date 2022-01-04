package Juego;

import Jugador.*;
import Palabra.*;
import java.util.Date;

public class Partida{
    
    private static final int PRECIO = 5;
    private final Rosco rJ1;
    private final Rosco rJ2;
    private final Date fecha;
    
    public Partida(Jugador j1, Jugador j2, AlmacenPalabras almacen, int nLetras){
        j1.restarPuntos(PRECIO);
        j2.restarPuntos(PRECIO);
        this.rJ1 = new Rosco(j1,almacen,nLetras);
        this.rJ2 = new Rosco(j2,almacen,nLetras);
        this.fecha = new Date();
    }
    
    //Devuelve un string que indica el estado de la partida, si se ha dado la primera vuelta al rosco
    //o si se ha acabado la partida para el jugador 1
    public String jugarJ1(String guess){
        if(!rJ2.isGanada()){
            return rJ1.jugarPalabra(guess);
        }
        return "Has perdido";
    }
    
    //Devuelve un string que indica el estado de la partida, si se ha dado la primera vuelta al rosco
    //o si se ha acabado la partida para el jugador 2
    public String jugarJ2(String guess){
        if(!rJ1.isGanada()){
            return rJ2.jugarPalabra(guess);
        }
        return "Has perdido";
    }
    
    //Devuelve la solucion de la palabra para mostrarla por pantalla
    public String comparJ1(){
        return rJ1.comprarPalabra();
    }
    
    //Devuelve la solucion de la palabra para mostrarla por pantalla
    public String comparJ2(){
        return rJ2.comprarPalabra();
    }
    
    //Devuelve un string con la ayuda para mostrarla por pantalla
    public String pedirAyudaJ1(){
        return rJ1.pedirAyuda();
    }
    
    //Devuelve un string con la ayuda para mostrarla por pantalla
    public String pedirAyudaJ2(){
        return rJ2.pedirAyuda();
    }
    
    //Devuelve la siguiente palabra del jugador 1
    public Palabra siguientePalabraJ1(){
        return rJ1.siguientePalabra();
    }
    
    //Devuelve la siguiente palabra del jugador 2
    public Palabra siguientePalabraJ2(){
        return rJ2.siguientePalabra();
    }
    
    //Devuelve el jugador que ha ganado o null si hay empate
    public Jugador getGanador(){
        if(rJ1.getPalabrasAcertadas() > rJ2.getPalabrasAcertadas()){
            return rJ1.getJugador();
        }else if(rJ1.getPalabrasAcertadas() < rJ2.getPalabrasAcertadas()){
            return rJ2.getJugador();
        }else{
            return null;
        }
    }
    
    @Override
    public String toString(){
        String resultado = "";
        resultado = resultado.concat("Jugador 1:");
        resultado = resultado.concat(rJ1.getJugador().getNombre());
        resultado = resultado.concat("\tPalabras Acertadas: "+rJ1.getPalabrasAcertadas());
        resultado = resultado.concat("\tPalabras Falladas: "+rJ1.getPalabrasFalladas());
        resultado = resultado.concat("\nJugador 2:");
        resultado = resultado.concat(rJ2.getJugador().getNombre());
        resultado = resultado.concat("\tPalabras Acertadas: "+rJ2.getPalabrasAcertadas());
        resultado = resultado.concat("\tPalabras Falladas: "+rJ2.getPalabrasFalladas());
        resultado = resultado.concat("\nEl ganador es:");
        resultado = resultado.concat(getGanador().getNombre());
        resultado = resultado.concat("\nFecha: " + fecha.toString());
        return resultado;
    }
    
    public Date getFecha(){
        return fecha;
    }
}
