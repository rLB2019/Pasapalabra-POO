/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Palabra;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MrKanoa
 */
public class AlmacenPalabras implements Serializable {

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
    private static String fichero;

    private void CargarFichero() {
        try {
            //Al crear el objeto cargamos las palabras automaticamente
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));
            AlmacenPalabras aux = (AlmacenPalabras) ois.readObject();
            //Copiamos las palabras al objeto
            this.palabrasA = aux.getPalabras('a');
            this.palabrasB = aux.getPalabras('b');
            this.palabrasC = aux.getPalabras('c');
            this.palabrasD = aux.getPalabras('d');
            this.palabrasE = aux.getPalabras('e');
            this.palabrasF = aux.getPalabras('f');
            this.palabrasG = aux.getPalabras('g');
            this.palabrasH = aux.getPalabras('h');
            this.palabrasI = aux.getPalabras('i');
            this.palabrasJ = aux.getPalabras('j');
            this.palabrasL = aux.getPalabras('l');
            this.palabrasM = aux.getPalabras('m');
            this.palabrasN = aux.getPalabras('n');
            this.palabrasO = aux.getPalabras('o');
            this.palabrasP = aux.getPalabras('p');
            this.palabrasQ = aux.getPalabras('q');
            this.palabrasR = aux.getPalabras('r');
            this.palabrasS = aux.getPalabras('s');
            this.palabrasT = aux.getPalabras('t');
            this.palabrasU = aux.getPalabras('u');
            this.palabrasV = aux.getPalabras('v');
            this.palabrasX = aux.getPalabras('x');
            this.palabrasY = aux.getPalabras('y');
            this.palabrasZ = aux.getPalabras('z');
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(AlmacenPalabras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void GuardarFichero() {
        //Guardamos el fichero despues de añadir una palabra nueva
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero));
            oos.writeObject(this);
            oos.reset();
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(AlmacenPalabras.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    public ArrayList<Palabra> getPalabras(char letra) {
        ArrayList<Palabra> resultado = new ArrayList<>();
        switch (letra) {
            case 'a' ->
                resultado = (ArrayList<Palabra>) palabrasA.clone();
            case 'b' ->
                resultado = (ArrayList<Palabra>) palabrasB.clone();
            case 'c' ->
                resultado = (ArrayList<Palabra>) palabrasC.clone();
            case 'd' ->
                resultado = (ArrayList<Palabra>) palabrasD.clone();
            case 'e' ->
                resultado = (ArrayList<Palabra>) palabrasE.clone();
            case 'f' ->
                resultado = (ArrayList<Palabra>) palabrasF.clone();
            case 'g' ->
                resultado = (ArrayList<Palabra>) palabrasG.clone();
            case 'h' ->
                resultado = (ArrayList<Palabra>) palabrasH.clone();
            case 'i' ->
                resultado = (ArrayList<Palabra>) palabrasI.clone();
            case 'j' ->
                resultado = (ArrayList<Palabra>) palabrasJ.clone();
            case 'l' ->
                resultado = (ArrayList<Palabra>) palabrasL.clone();
            case 'm' ->
                resultado = (ArrayList<Palabra>) palabrasM.clone();
            case 'n' ->
                resultado = (ArrayList<Palabra>) palabrasN.clone();
            case 'o' ->
                resultado = (ArrayList<Palabra>) palabrasO.clone();
            case 'p' ->
                resultado = (ArrayList<Palabra>) palabrasP.clone();
            case 'q' ->
                resultado = (ArrayList<Palabra>) palabrasQ.clone();
            case 'r' ->
                resultado = (ArrayList<Palabra>) palabrasR.clone();
            case 's' ->
                resultado = (ArrayList<Palabra>) palabrasS.clone();
            case 't' ->
                resultado = (ArrayList<Palabra>) palabrasT.clone();
            case 'u' ->
                resultado = (ArrayList<Palabra>) palabrasU.clone();
            case 'v' ->
                resultado = (ArrayList<Palabra>) palabrasV.clone();
            case 'x' ->
                resultado = (ArrayList<Palabra>) palabrasX.clone();
            case 'y' ->
                resultado = (ArrayList<Palabra>) palabrasY.clone();
            case 'z' ->
                resultado = (ArrayList<Palabra>) palabrasZ.clone();
            default -> {
            }
        }
        return resultado;
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

    public AlmacenPalabras(boolean inicial) {
        if (!inicial) {
            CargarFichero();
        } else {
            this.palabrasA = new ArrayList<>();
            this.palabrasB = new ArrayList<>();
            this.palabrasC = new ArrayList<>();
            this.palabrasD = new ArrayList<>();
            this.palabrasE = new ArrayList<>();
            this.palabrasF = new ArrayList<>();
            this.palabrasG = new ArrayList<>();
            this.palabrasH = new ArrayList<>();
            this.palabrasI = new ArrayList<>();
            this.palabrasJ = new ArrayList<>();
            this.palabrasL = new ArrayList<>();
            this.palabrasM = new ArrayList<>();
            this.palabrasN = new ArrayList<>();
            this.palabrasO = new ArrayList<>();
            this.palabrasP = new ArrayList<>();
            this.palabrasQ = new ArrayList<>();
            this.palabrasR = new ArrayList<>();
            this.palabrasS = new ArrayList<>();
            this.palabrasT = new ArrayList<>();
            this.palabrasU = new ArrayList<>();
            this.palabrasV = new ArrayList<>();
            this.palabrasX = new ArrayList<>();
            this.palabrasY = new ArrayList<>();
            this.palabrasZ = new ArrayList<>();
        }
    }
}
