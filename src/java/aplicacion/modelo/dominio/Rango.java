 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

/**
 *
 * @author Franco
 */
public class Rango {

    public Rango() {
    }
    private int a;
    private int b;
    private int primos;
    private int pares;
    private int impares;

    public Rango(int a, int b) {
        this.a = a;
        this.b = b;
        
    }
   
    
    
    
    public int calcularImpar(int a, int b){
   
        int aux=a;
        setImpares(0);
        while(aux<b){
            if (aux%2!=0){
               setImpares(getImpares()+1); 
               aux=aux+1;
            }
        }
        return getImpares();
    }
    
    public int calcularPar(){
        int aux=a;
        setPares(0);
        while(aux<b){
            if (aux%2==0){
                setPares(getPares()+1);
                aux=aux+1;
            }
        }
        return getPares();
    }
    
    private int calcularPrimos(int a, int b){
        int i,j,c;
        c=0;
        
        setPrimos(0);
        for(i=a;i<=b;i++){
            j=i;
            while(j<=b){
                if(i%j==0){
                c++;    
               }
            j++;
            if(c==2){
                setPrimos(getPrimos()+1);
            }
            }
        }
        return getPrimos();
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
