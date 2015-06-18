/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author RAUL
 */
public class Equipo {
    
    public int Pla_dimesa;
    public String Num_serie;
    public String Marca_modelo;
    public String Modelo_equipo;
    public String Nomb_equipo;
    public String Observ_eq;
    public String Empresa_responsable;
    public byte Imagen;
    public String fecha_registro;

    public Equipo() {
    }

    public int getPla_dimesa() {
        return Pla_dimesa;
    }

    public void setPla_dimesa(int Pla_dimesa) {
        this.Pla_dimesa = Pla_dimesa;
    }

    public String getNum_serie() {
        return Num_serie;
    }

    public void setNum_serie(String Num_serie) {
        this.Num_serie = Num_serie;
    }

    public String getMarca_modelo() {
        return Marca_modelo;
    }

    public void setMarca_modelo(String Marca_modelo) {
        this.Marca_modelo = Marca_modelo;
    }

    public String getModelo_equipo() {
        return Modelo_equipo;
    }

    public void setModelo_equipo(String Modelo_equipo) {
        this.Modelo_equipo = Modelo_equipo;
    }

    public String getNomb_equipo() {
        return Nomb_equipo;
    }

    public void setNomb_equipo(String Nomb_equipo) {
        this.Nomb_equipo = Nomb_equipo;
    }

    public String getObserv_eq() {
        return Observ_eq;
    }

    public void setObserv_eq(String Observ_eq) {
        this.Observ_eq = Observ_eq;
    }

    public String getEmpresa_responsable() {
        return Empresa_responsable;
    }

    public void setEmpresa_responsable(String Empresa_responsable) {
        this.Empresa_responsable = Empresa_responsable;
    }

    public byte getImagen() {
        return Imagen;
    }

    public void setImagen(byte Imagen) {
        this.Imagen = Imagen;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
    
     
    
}
