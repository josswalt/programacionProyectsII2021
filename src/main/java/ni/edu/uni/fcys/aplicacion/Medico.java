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
public class Medico {
    
    private String especialidad;
    private String servicio;
    private int numConsultorio;

    public Medico() {
    }

    public Medico(String especialidad, String servicio, int numConsultorio) {
        this.especialidad = especialidad;
        this.servicio = servicio;
        this.numConsultorio = numConsultorio;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public int getNumConsultorio() {
        return numConsultorio;
    }

    public void setNumConsultorio(int numConsultorio) {
        this.numConsultorio = numConsultorio;
    }

    @Override
    public String toString() {
        return "Medico{" + "especialidad=" + especialidad + ", servicio=" + servicio + ", numConsultorio=" + numConsultorio + '}';
    }
    
    
    
}
