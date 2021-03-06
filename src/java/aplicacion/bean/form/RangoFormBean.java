/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.bean.form;

import aplicacion.modelo.dominio.Rango;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Franco
 */
@ManagedBean
@SessionScoped
public class RangoFormBean {

    /**
     * Creates a new instance of RangoFormBean
     */
    public RangoFormBean() {
    }
    private int a;
    private int b;
    private int primos;
    private int pares;
    private int impares;
    
    public void calcularCantNum(){
        System.out.println("valores"+a+b);
        Rango unRango= new Rango(getA(),getB());
        setImpares(unRango.calcularImpar(getA(),getB()));
        setPares(unRango.calcularPar());
        setPrimos(unRango.calcularPrimos(getA(), getB()));
    }
    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return the primos
     */
    public int getPrimos() {
        return primos;
    }

    /**
     * @param primos the primos to set
     */
    public void setPrimos(int primos) {
        this.primos = primos;
    }

    /**
     * @return the pares
     */
    public int getPares() {
        return pares;
    }

    /**
     * @param pares the pares to set
     */
    public void setPares(int pares) {
        this.pares = pares;
    }

    /**
     * @return the impares
     */
    public int getImpares() {
        return impares;
    }

    /**
     * @param impares the impares to set
     */
    public void setImpares(int impares) {
        this.impares = impares;
    }
    
}
