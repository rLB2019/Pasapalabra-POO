package Palabra;

public class Definicion {
    private final String definicion;
    
    public Definicion(String d){
        this.definicion = d;
    }
    
    public Definicion(){
        this.definicion = null;
    }
    
    public String getDefinicion(){
        return definicion;
    }
}