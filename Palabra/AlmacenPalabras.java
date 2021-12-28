/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Palabra;

import java.util.ArrayList;

/**
 *
 * @author Rodrigo
 */
public class AlmacenPalabras {

    private ArrayList<Palabra> palabrasA;
    private ArrayList<Palabra> palabrasB;
    private ArrayList<Palabra> palabrasC;
    private ArrayList<Palabra> palabrasD;
    private ArrayList<Palabra> palabrasE;
    private ArrayList<Palabra> palabrasF;
    private ArrayList<Palabra> palabrasG;
    private ArrayList<Palabra> palabrasH;
    private ArrayList<Palabra> palabrasI;
    private ArrayList<Palabra> palabrasJ;
    private ArrayList<Palabra> palabrasL;
    private ArrayList<Palabra> palabrasM;
    private ArrayList<Palabra> palabrasN;
    private ArrayList<Palabra> palabrasO;
    private ArrayList<Palabra> palabrasP;
    private ArrayList<Palabra> palabrasQ;
    private ArrayList<Palabra> palabrasR;
    private ArrayList<Palabra> palabrasS;
    private ArrayList<Palabra> palabrasT;
    private ArrayList<Palabra> palabrasU;
    private ArrayList<Palabra> palabrasV;
    private ArrayList<Palabra> palabrasX;
    private ArrayList<Palabra> palabrasY;
    private ArrayList<Palabra> palabrasZ;

    private CargarFichero() {
        //Al crear el objeto cargamos las palabras automaticamente
    }

    private GuardarFichero() {
        //Guardamos el fichero despues de añadir una palabra nueva
    }

    public void addPalabra(Palabra p) {
        switch (p.getLetra()) {
            case 'a' ->
                palabrasA.add(p);
            case 'b' ->
                palabrasB.add(p);
            case 'c' ->
                palabrasC.add(p);
            case 'd' ->
                palabrasD.add(p);
            case 'e' ->
                palabrasE.add(p);
            case 'f' ->
                palabrasF.add(p);
            case 'g' ->
                palabrasG.add(p);
            case 'h' ->
                palabrasH.add(p);
            case 'i' ->
                palabrasI.add(p);
            case 'j' ->
                palabrasJ.add(p);
            case 'l' ->
                palabrasL.add(p);
            case 'm' ->
                palabrasM.add(p);
            case 'n' ->
                palabrasN.add(p);
            case 'o' ->
                palabrasO.add(p);
            case 'p' ->
                palabrasP.add(p);
            case 'q' ->
                palabrasQ.add(p);
            case 'r' ->
                palabrasR.add(p);
            case 's' ->
                palabrasS.add(p);
            case 't' ->
                palabrasT.add(p);
            case 'u' ->
                palabrasU.add(p);
            case 'v' ->
                palabrasV.add(p);
            case 'x' ->
                palabrasX.add(p);
            case 'y' ->
                palabrasY.add(p);
            case 'z' ->
                palabrasZ.add(p);
            default -> {
            }
        }
        GuardarFichero();
    }

    public void BorrarPalabra(Palabra p) {
        switch (p.getLetra()) {
            case 'a' ->
                palabrasA.remove(p);
            case 'b' ->
                palabrasB.remove(p);
            case 'c' ->
                palabrasC.remove(p);
            case 'd' ->
                palabrasD.remove(p);
            case 'e' ->
                palabrasE.remove(p);
            case 'f' ->
                palabrasF.remove(p);
            case 'g' ->
                palabrasG.remove(p);
            case 'h' ->
                palabrasH.remove(p);
            case 'i' ->
                palabrasI.remove(p);
            case 'j' ->
                palabrasJ.remove(p);
            case 'l' ->
                palabrasL.remove(p);
            case 'm' ->
                palabrasM.remove(p);
            case 'n' ->
                palabrasN.remove(p);
            case 'o' ->
                palabrasO.remove(p);
            case 'p' ->
                palabrasP.remove(p);
            case 'q' ->
                palabrasQ.remove(p);
            case 'r' ->
                palabrasR.remove(p);
            case 's' ->
                palabrasS.remove(p);
            case 't' ->
                palabrasT.remove(p);
            case 'u' ->
                palabrasU.remove(p);
            case 'v' ->
                palabrasV.remove(p);
            case 'x' ->
                palabrasX.remove(p);
            case 'y' ->
                palabrasY.remove(p);
            case 'z' ->
                palabrasZ.remove(p);
            default -> {
            }
        }
    }

    public AlmacenPalabras() {
        CargarFichero();
    }
}
