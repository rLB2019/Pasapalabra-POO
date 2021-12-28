/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Palabra;

/**
 *
 * @author alvaro
 */
public class Definicion {
    private String definicion;
    
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
