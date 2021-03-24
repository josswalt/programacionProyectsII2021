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
public class Empleado {
    
    private int codDeEmpleado;
    private int hrsExtras;
    private int fechaDeIngreso;
    private String area;
    private String cargo;

    public Empleado() {
    }

    public Empleado(int codDeEmpleado, int hrsExtras, int fechaDeIngreso, String area, String cargo) {
        this.codDeEmpleado = codDeEmpleado;
        this.hrsExtras = hrsExtras;
        this.fechaDeIngreso = fechaDeIngreso;
        this.area = area;
        this.cargo = cargo;
    }

    public int getCodDeEmpleado() {
        return codDeEmpleado;
    }

    public void setCodDeEmpleado(int codDeEmpleado) {
        this.codDeEmpleado = codDeEmpleado;
    }

    public int getHrsExtras() {
        return hrsExtras;
    }

    public void setHrsExtras(int hrsExtras) {
        this.hrsExtras = hrsExtras;
    }

    public int getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(int fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "codDeEmpleado=" + codDeEmpleado + ", hrsExtras=" + hrsExtras + ", fechaDeIngreso=" + fechaDeIngreso + ", area=" + area + ", cargo=" + cargo + '}';
    }
    
    
    
    
}
