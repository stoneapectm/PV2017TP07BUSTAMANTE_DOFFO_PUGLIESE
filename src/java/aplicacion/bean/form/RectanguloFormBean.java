/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.bean.form;

import aplicacion.modelo.dominio.Punto;
import aplicacion.modelo.dominio.Rectangulo;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Familia
 */
@ManagedBean
@SessionScoped
public class RectanguloFormBean {
    private double x1;
    private double y1;
    private double base;
    private double altura;
    private ArrayList<Punto> puntosEncontrados;
    private Rectangulo unRectangulo;

    public RectanguloFormBean(double x1, double y1, double base, double altura, ArrayList<Punto> puntosEncontrados, Rectangulo unRectangulo) {
        this.x1 = x1;
        this.y1 = y1;
        this.base = base;
        this.altura = altura;
        this.puntosEncontrados = puntosEncontrados;
        this.unRectangulo = unRectangulo;
    }
     

    public RectanguloFormBean() {
    }
    public void calcularOtrosPuntos(){
        Punto unPuntoA=new Punto (getX1(),getY1());
        Rectangulo rectangulo= new Rectangulo();
        setPuntosEncontrados(rectangulo.encontrarNuevoPunto(unPuntoA,getBase(),getAltura()));
        unRectangulo=new Rectangulo(puntosEncontrados.get(1),puntosEncontrados.get(2),puntosEncontrados.get(3));
        
        
    }

    
    
    
    
    
    
    
    public RectanguloFormBean(double x1, double y1, double base, double altura) {
        this.x1 = x1;
        this.y1 = y1;
        this.base = base;
        this.altura = altura;
    }
    

    public double getX1() {
        return x1;
    }

    /**
     * @param x1 the x1 to set
     */
    public void setX1(double x1) {
        this.x1 = x1;
    }

    /**
     * @return the y1
     */
    public double getY1() {
        return y1;
    }

    /**
     * @param y1 the y1 to set
     */
    public void setY1(double y1) {
        this.y1 = y1;
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the puntosEncontrados
     */
    public ArrayList<Punto> getPuntosEncontrados() {
        return puntosEncontrados;
    }

    /**
     * @param puntosEncontrados the puntosEncontrados to set
     */
    public void setPuntosEncontrados(ArrayList<Punto> puntosEncontrados) {
        this.puntosEncontrados = puntosEncontrados;
    }

    /**
     * @return the unRectangulo
     */
    public Rectangulo getUnRectangulo() {
        return unRectangulo;
    }

    /**
     * @param unRectangulo the unRectangulo to set
     */
    public void setUnRectangulo(Rectangulo unRectangulo) {
        this.unRectangulo = unRectangulo;
    }
    
}