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
public class Evento {
    
    
    private int num_dimesa;
    private int Pla_dimesa;
    private int Id_costo_equipo;
    private String Tbl_equipo_pla_dimesa;
    private String Servicio;
    private String Fecha_inicio;
    private String Fecha_fin;
    private String Unidad;
    private String Falla;

    public Evento() {
    }

    public int getNum_dimesa() {
        return num_dimesa;
    }

    public void setNum_dimesa(int num_dimesa) {
        this.num_dimesa = num_dimesa;
    }

    public int getPla_dimesa() {
        return Pla_dimesa;
    }

    public void setPla_dimesa(int Pla_dimesa) {
        this.Pla_dimesa = Pla_dimesa;
    }

    public int getId_costo_equipo() {
        return Id_costo_equipo;
    }

    public void setId_costo_equipo(int Id_costo_equipo) {
        this.Id_costo_equipo = Id_costo_equipo;
    }

    public String getTbl_equipo_pla_dimesa() {
        return Tbl_equipo_pla_dimesa;
    }

    public void setTbl_equipo_pla_dimesa(String Tbl_equipo_pla_dimesa) {
        this.Tbl_equipo_pla_dimesa = Tbl_equipo_pla_dimesa;
    }

    public String getServicio() {
        return Servicio;
    }

    public void setServicio(String Servicio) {
        this.Servicio = Servicio;
    }

    public String getFecha_inicio() {
        return Fecha_inicio;
    }

    public void setFecha_inicio(String Fecha_inicio) {
        this.Fecha_inicio = Fecha_inicio;
    }

    public String getFecha_fin() {
        return Fecha_fin;
    }

    public void setFecha_fin(String Fecha_fin) {
        this.Fecha_fin = Fecha_fin;
    }

    public String getUnidad() {
        return Unidad;
    }

    public void setUnidad(String Unidad) {
        this.Unidad = Unidad;
    }

    public String getFalla() {
        return Falla;
    }

    public void setFalla(String Falla) {
        this.Falla = Falla;
    }
    
    
    
    
}
