/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.util.ArrayList;

/**
 *
 * @author Franco
 */
public class Rectangulo {
    private double baseRec;
    private double alturaRec;
    private Punto unPuntoOrigen;
    private Punto unPuntoB;
    private Punto unPuntoC;
    private Punto unPuntoD;

    public Rectangulo() {
    }

    public Rectangulo(Punto unPuntoOrigen, Punto unPuntoB, Punto unPuntoC, Punto unPuntoD) {
        this.unPuntoOrigen = unPuntoOrigen;
        this.unPuntoB = unPuntoB;
        this.unPuntoC = unPuntoC;
        this.unPuntoD = unPuntoD;
    }
    public ArrayList<Punto> encontrarNuevoPunto (Punto A, double base, double alt) {
        setUnPuntoOrigen(A);
        setBaseRec(base);
        setAlturaRec(alt);
        
        ArrayList<Punto> puntos = new ArrayList();
        
        setUnPuntoB(new Punto
        (getUnPuntoOrigen().getX()+getBaseRec(),getUnPuntoOrigen().getY()));
        
        setUnPuntoC(new Punto
        (getUnPuntoOrigen().getX()+getBaseRec(),getUnPuntoOrigen().getY()+getAlturaRec()));
        
        setUnPuntoD(new Punto
        (getUnPuntoOrigen().getX(),getUnPuntoOrigen().getY()+getAlturaRec()));
        
        puntos.add(unPuntoOrigen);
        puntos.add(unPuntoB);
        puntos.add(unPuntoC);
        puntos.add(unPuntoD);
        
        return puntos;
    }
    /**
     * @return the baseRec
     */
    public double getBaseRec() {
        return baseRec;
    }

    /**
     * @param baseRec the baseRec to set
     */
    public void setBaseRec(double baseRec) {
        this.baseRec = baseRec;
    }

    /**
     * @return the alturaRec
     */
    public double getAlturaRec() {
        return alturaRec;
    }

    /**
     * @param alturaRec the alturaRec to set
     */
    public void setAlturaRec(double alturaRec) {
        this.alturaRec = alturaRec;
    }

    /**
     * @return the unPuntoOrigen
     */
    public Punto getUnPuntoOrigen() {
        return unPuntoOrigen;
    }

    /**
     * @param unPuntoOrigen the unPuntoOrigen to set
     */
    public void setUnPuntoOrigen(Punto unPuntoOrigen) {
        this.unPuntoOrigen = unPuntoOrigen;
    }

    /**
     * @return the unPuntoB
     */
    public Punto getUnPuntoB() {
        return unPuntoB;
    }

    /**
     * @param unPuntoB the unPuntoB to set
     */
    public void setUnPuntoB(Punto unPuntoB) {
        this.unPuntoB = unPuntoB;
    }

    /**
     * @return the unPuntoC
     */
    public Punto getUnPuntoC() {
        return unPuntoC;
    }

    /**
     * @param unPuntoC the unPuntoC to set
     */
    public void setUnPuntoC(Punto unPuntoC) {
        this.unPuntoC = unPuntoC;
    }

    /**
     * @return the unPuntoD
     */
    public Punto getUnPuntoD() {
        return unPuntoD;
    }

    /**
     * @param unPuntoD the unPuntoD to set
     */
    public void setUnPuntoD(Punto unPuntoD) {
        this.unPuntoD = unPuntoD;
    }
}
