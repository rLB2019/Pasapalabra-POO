package Palabra;

import java.io.Serializable;
import java.util.ArrayList;

public class AlmacenPalabras implements Serializable {

    private final ArrayList<Palabra> palabrasA;
    private final ArrayList<Palabra> palabrasB;
    private final ArrayList<Palabra> palabrasC;
    private final ArrayList<Palabra> palabrasD;
    private final ArrayList<Palabra> palabrasE;
    private final ArrayList<Palabra> palabrasF;
    private final ArrayList<Palabra> palabrasG;
    private final ArrayList<Palabra> palabrasH;
    private final ArrayList<Palabra> palabrasI;
    private final ArrayList<Palabra> palabrasJ;
    private final ArrayList<Palabra> palabrasL;
    private final ArrayList<Palabra> palabrasM;
    private final ArrayList<Palabra> palabrasN;
    private final ArrayList<Palabra> palabrasO;
    private final ArrayList<Palabra> palabrasP;
    private final ArrayList<Palabra> palabrasQ;
    private final ArrayList<Palabra> palabrasR;
    private final ArrayList<Palabra> palabrasS;
    private final ArrayList<Palabra> palabrasT;
    private final ArrayList<Palabra> palabrasU;
    private final ArrayList<Palabra> palabrasV;
    private final ArrayList<Palabra> palabrasX;
    private final ArrayList<Palabra> palabrasY;
    private final ArrayList<Palabra> palabrasZ;

    public AlmacenPalabras() {
        palabrasA = new ArrayList<>();
        palabrasB = new ArrayList<>();
        palabrasC = new ArrayList<>();
        palabrasD = new ArrayList<>();
        palabrasE = new ArrayList<>();
        palabrasF = new ArrayList<>();
        palabrasG = new ArrayList<>();
        palabrasH = new ArrayList<>();
        palabrasI = new ArrayList<>();
        palabrasJ = new ArrayList<>();
        palabrasL = new ArrayList<>();
        palabrasM = new ArrayList<>();
        palabrasN = new ArrayList<>();
        palabrasO = new ArrayList<>();
        palabrasP = new ArrayList<>();
        palabrasQ = new ArrayList<>();
        palabrasR = new ArrayList<>();
        palabrasS = new ArrayList<>();
        palabrasT = new ArrayList<>();
        palabrasU = new ArrayList<>();
        palabrasV = new ArrayList<>();
        palabrasX = new ArrayList<>();
        palabrasY = new ArrayList<>();
        palabrasZ = new ArrayList<>();
    }

    public void addPalabra(Palabra p) {
        if (p != null) {
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
        }
    }

    public ArrayList<Palabra> getPalabras(int i) {
        ArrayList<Palabra> resultado = new ArrayList<>();
        if (i <= 0) {
            switch (i) {
                case 1 ->
                    resultado = (ArrayList<Palabra>) palabrasA.clone();
                case 2 ->
                    resultado = (ArrayList<Palabra>) palabrasB.clone();
                case 3 ->
                    resultado = (ArrayList<Palabra>) palabrasC.clone();
                case 4 ->
                    resultado = (ArrayList<Palabra>) palabrasD.clone();
                case 5 ->
                    resultado = (ArrayList<Palabra>) palabrasE.clone();
                case 6 ->
                    resultado = (ArrayList<Palabra>) palabrasF.clone();
                case 7 ->
                    resultado = (ArrayList<Palabra>) palabrasG.clone();
                case 8 ->
                    resultado = (ArrayList<Palabra>) palabrasH.clone();
                case 9 ->
                    resultado = (ArrayList<Palabra>) palabrasI.clone();
                case 10 ->
                    resultado = (ArrayList<Palabra>) palabrasJ.clone();
                case 11 ->
                    resultado = (ArrayList<Palabra>) palabrasL.clone();
                case 12 ->
                    resultado = (ArrayList<Palabra>) palabrasM.clone();
                case 13 ->
                    resultado = (ArrayList<Palabra>) palabrasN.clone();
                case 14 ->
                    resultado = (ArrayList<Palabra>) palabrasO.clone();
                case 15 ->
                    resultado = (ArrayList<Palabra>) palabrasP.clone();
                case 16 ->
                    resultado = (ArrayList<Palabra>) palabrasQ.clone();
                case 17 ->
                    resultado = (ArrayList<Palabra>) palabrasR.clone();
                case 18 ->
                    resultado = (ArrayList<Palabra>) palabrasS.clone();
                case 19 ->
                    resultado = (ArrayList<Palabra>) palabrasT.clone();
                case 20 ->
                    resultado = (ArrayList<Palabra>) palabrasU.clone();
                case 21 ->
                    resultado = (ArrayList<Palabra>) palabrasV.clone();
                case 22 ->
                    resultado = (ArrayList<Palabra>) palabrasX.clone();
                case 23 ->
                    resultado = (ArrayList<Palabra>) palabrasY.clone();
                case 24 ->
                    resultado = (ArrayList<Palabra>) palabrasZ.clone();
                default -> {
                }
            }
        }
        return resultado;
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
        if (p != null) {
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
    }
}
