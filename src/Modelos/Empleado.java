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
public class Empleado {
    
    private int IdEmpleado;
    private String NombreEmpleado;
    private String ApellidoEmpleado;
    private String Cargo;
    private float Costo_hora;

    public Empleado() {
    }

    public Empleado(int IdEmpleado, String NombreEmpleado, String ApellidoEmpleado, String Cargo, float Costo_hora) {
        this.IdEmpleado = IdEmpleado;
        this.NombreEmpleado = NombreEmpleado;
        this.ApellidoEmpleado = ApellidoEmpleado;
        this.Cargo = Cargo;
        this.Costo_hora = Costo_hora;
    }

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public String getNombreEmpleado() {
        return NombreEmpleado;
    }

    public void setNombreEmpleado(String NombreEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return ApellidoEmpleado;
    }

    public void setApellidoEmpleado(String ApellidoEmpleado) {
        this.ApellidoEmpleado = ApellidoEmpleado;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public float getCosto_hora() {
        return Costo_hora;
    }

    public void setCosto_hora(float Costo_hora) {
        this.Costo_hora = Costo_hora;
    }
    
    
    
    
}
