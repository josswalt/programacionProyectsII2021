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
public class Persona {
    
    private int cedula;
    private String name;
    private String apellido;
    private int fechaNac;
    private String direccion;
    private String  ciudadDeProcedencia;

    public Persona(int cedula, String name, String apellido, int fechaNac, String direccion, String ciudadDeProcedencia) {
        this.cedula = cedula;
        this.name = name;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
        this.ciudadDeProcedencia = ciudadDeProcedencia;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(int fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudadDeProcedencia() {
        return ciudadDeProcedencia;
    }

    public void setCiudadDeProcedencia(String ciudadDeProcedencia) {
        this.ciudadDeProcedencia = ciudadDeProcedencia;
    }

    @Override
    public String toString() {
        return "Registro{" + "cedula=" + cedula + ", name=" + name + ", apellido=" + apellido + ", fechaNac=" + fechaNac + ", direccion=" + direccion + ", ciudadDeProcedencia=" + ciudadDeProcedencia + '}';
    }
    
    
    
    
}
