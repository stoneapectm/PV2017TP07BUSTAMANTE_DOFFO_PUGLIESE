/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Familia
 */
public class Superficie implements Serializable {
    private double sup;

    public double calcularSuperficie(Rectangulo A){
        sup=(A.getAlturaRec()*A.getBaseRec());
        return sup;
    }
    
    
    
    public double getSup() {
        return sup;
    }

    /**
     * @param sup the sup to set
     */
    public void setSup(double sup) {
        this.sup = sup;
    }
    
}

