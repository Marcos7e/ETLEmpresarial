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
public class Costo_Equipo {
    
    private int Id_costo_equipo;
    private float costo;

    public Costo_Equipo(int Id_costo_equipo, float costo) {
        this.Id_costo_equipo = Id_costo_equipo;
        this.costo = costo;
    }

    public Costo_Equipo() {
    }

    public int getId_costo_equipo() {
        return Id_costo_equipo;
    }

    public void setId_costo_equipo(int Id_costo_equipo) {
        this.Id_costo_equipo = Id_costo_equipo;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
    
    
}
