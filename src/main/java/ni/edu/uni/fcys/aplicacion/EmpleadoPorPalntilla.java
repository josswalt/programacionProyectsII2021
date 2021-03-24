/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.aplicacion;

/**
 *
 * @author WTorres
 */
public class EmpleadoPorPalntilla {
    
    private int salarioMensual;
    private int porcAdicXHrsExtras;

    public EmpleadoPorPalntilla() {
    }

    public EmpleadoPorPalntilla(int salarioMensual, int porcAdicXHrsExtras) {
        this.salarioMensual = salarioMensual;
        this.porcAdicXHrsExtras = porcAdicXHrsExtras;
    }

    public int getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(int salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public int getPorcAdicXHrsExtras() {
        return porcAdicXHrsExtras;
    }

    public void setPorcAdicXHrsExtras(int porcAdicXHrsExtras) {
        this.porcAdicXHrsExtras = porcAdicXHrsExtras;
    }

    @Override
    public String toString() {
        return "EmpleadoPorPalntilla{" + "salarioMensual=" + salarioMensual + ", porcAdicXHrsExtras=" + porcAdicXHrsExtras + '}';
    }
    
    
    
    
}
