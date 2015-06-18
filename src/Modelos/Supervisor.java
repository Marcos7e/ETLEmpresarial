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
public class Supervisor {
    
    private int Id_supervisor;
    private int IdEmpleado;
    private String nombre;
    private String apellido;

    public Supervisor() {
    }

    public int getId_supervisor() {
        return Id_supervisor;
    }

    public void setId_supervisor(int Id_supervisor) {
        this.Id_supervisor = Id_supervisor;
    }

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
}
