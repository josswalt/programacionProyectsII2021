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
public class Paciente {
    
    private int numHistorialClinico;
    private String sexo;
    private String grupoSanguineo;
    private String ListMedAlergica;

    public Paciente() {
    }

    public Paciente(int numHistorialClinico, String sexo, String grupoSanguineo, String ListMedAlergica) {
        this.numHistorialClinico = numHistorialClinico;
        this.sexo = sexo;
        this.grupoSanguineo = grupoSanguineo;
        this.ListMedAlergica = ListMedAlergica;
    }

    public int getNumHistorialClinico() {
        return numHistorialClinico;
    }

    public void setNumHistorialClinico(int numHistorialClinico) {
        this.numHistorialClinico = numHistorialClinico;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getListMedAlergica() {
        return ListMedAlergica;
    }

    public void setListMedAlergica(String ListMedAlergica) {
        this.ListMedAlergica = ListMedAlergica;
    }

    @Override
    public String toString() {
        return "Paciente{" + "numHistorialClinico=" + numHistorialClinico + ", sexo=" + sexo + ", grupoSanguineo=" + grupoSanguineo + ", ListMedAlergica=" + ListMedAlergica + '}';
    }
    
    
    
    
}
