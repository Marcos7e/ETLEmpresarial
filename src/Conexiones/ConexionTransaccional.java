/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiones;

/**
 *
 * @author Marcos Barrera
 */

import Modelos.Costo_Equipo;
import Modelos.Empleado;
import Modelos.Equipo;
import Modelos.Evento;
import Modelos.Servicio;
import Modelos.Supervisor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;

public  class ConexionTransaccional {
    
     
    public Connection conexion=null;
    public Statement statement;
    public  ResultSet res;
    
       public List<Empleado> listEmpleado = null;
    public Empleado empleado = null;
    
     
    public Connection GetConnection()
    {
      
      
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost/bd_dimesa";
            String usuarioDB="root";
            String passwordDB="";
            conexion= DriverManager.getConnection(servidor,usuarioDB,passwordDB);
        }
      
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error3 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }
        finally
        {
            return conexion;
        }
    }
    
    public  void Close(){
        
        try{
         if(conexion.getSchema()!= "")
         {
          conexion.close();
         }}
        catch(SQLException e)
        {e.printStackTrace();}
    
        
         
    }
    
     public List<Empleado> Empleado(){
     
        try{
      
            Statement statement = this.conexion.createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM EMPLEADO");
        
        
        if(res!= null)
        {
            System.out.println("Extrayendo y Transformando Datos para EMPLEADO");
               while(res.next())
               {
                  empleado.setIdEmpleado(res.getInt(1));
                  empleado.setNombreEmpleado(res.getString(2));
                  empleado.setApellidoEmpleado(res.getString(3));
                  empleado.setCargo(res.getString(4));
                  empleado.setCosto_hora(res.getFloat(5));
                  
                  listEmpleado.add(empleado);
        }
        
        return listEmpleado;
        
        }
        else
        {
            System.out.println("No encontre nada para EMPLEADO");
            return null;
        }
        
        }
        
         catch(SQLException e)
    {
        e.printStackTrace();
        return null;
    }}
     
       public List<Supervisor> listSupervisor = null;
    public Supervisor supervisor = null;
    
    public List<Supervisor> Supervisor(){
    
        
        try{
      
        
        statement = this.conexion.createStatement();
        res = statement.executeQuery("SELECT * FROM SUPERVISOR");
        
        
        if(res!= null)
        {
            System.out.println("Extrayendo y Transformando Datos para SUPERVISOR");
               while(res.next())
               {
                   
                   supervisor.setId_supervisor(res.getInt(0));
                   supervisor.setIdEmpleado(res.getInt(1));
                   supervisor.setNombre((res.getString(2)));
                   supervisor.setApellido(res.getString(3));
                   
                   listSupervisor.add(supervisor);
        
        }
        
        return listSupervisor;
        }
        else
        {
            System.out.println("No encontre nada para SUPERVISOR");
            return null;
        }
        }
        

    catch(SQLException e)
    {
        e.printStackTrace();
        return null;
    }}
    
    
  public List<Equipo> listEquipo = null;
    public Equipo equipo = null;
    public SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    
    
    
     public List<Equipo> Equipo(){
    
    try{
      
        
        statement = this.conexion.createStatement();
        res = statement.executeQuery("SELECT * FROM EQUIPO");
        
        
        if(res!= null)
        {
            System.out.println("Extrayendo y Transformando Datos para EQUIPO");
               while(res.next())
               {
                   
                   equipo.setPla_dimesa(res.getInt(0));
                   equipo.setNum_serie(res.getString(1));
                   equipo.setMarca_modelo(res.getString(2));
                   equipo.setModelo_equipo(res.getString(3));
                   equipo.setNomb_equipo(res.getString(4));
                   equipo.setObserv_eq(res.getString(5));
                   equipo.setEmpresa_responsable(res.getString(6));
                   equipo.setImagen(Byte.parseByte("100"));
                   equipo.setFecha_registro(formatter.format(res.getDate(8)));
                   
                   listEquipo.add(equipo);
          
               }
               
               
               return listEquipo;
        
        }
        else
        {
            System.out.println("No encontre nada para EQUIPO");
            return null;
        }
        
      
}
    
    catch(SQLException e)
    {
        e.printStackTrace();
        return null;
    }}
     
     public List<Evento> listEvento = null;
     public Evento evento = null;
     
      public List<Evento> Evento(){
    
    try{
      
        
        statement = this.conexion.createStatement();
        res = statement.executeQuery("SELECT * FROM EVENTO");
        
        
        if(res!= null)
        {
            System.out.println("Extrayendo y Transformando Datos para EVENTO");
               while(res.next())
               {
                   
                   evento.setPla_dimesa(res.getInt(0));
                   evento.setPla_dimesa(res.getInt(1));
                   evento.setId_costo_equipo(res.getInt(2));
                   evento.setTbl_equipo_pla_dimesa(res.getString(3));
                   evento.setServicio(res.getString(4));
                   evento.setFecha_inicio(res.getString(5));
                   evento.setFecha_fin(res.getString(6));
                   evento.setUnidad(res.getString(7));
                   evento.setFalla(res.getString(8));
                   
                   listEvento.add(evento);
          
               }
               
               return listEvento;
        
        }
        else
        {
            System.out.println("No encontre nada para Evento");
            return null;
        }
        
      
}
    
    catch(SQLException e)
    {
        e.printStackTrace();
        return null;
    }}
     
        public List<Servicio> listServicio = null;
    public Servicio servicio = null;
    
    public List<Costo_Equipo> listCosto= null;
    public Costo_Equipo costo = null;
    
    public List<Costo_Equipo> CostoEquipo(){
      try{
      
        
        statement = this.conexion.createStatement();
        res = statement.executeQuery("SELECT * FROM costo_equipo");
        
        
        if(res!= null)
        {
            System.out.println("Extrayendo y Transformando Datos para Costo de Equipo");
               while(res.next())
               {
                   costo.setId_costo_equipo(res.getInt(0));
                   costo.setCosto(res.getFloat(1));

                   listCosto.add(costo);
                   
                  
      
        }
         return listCosto;}
        else
        {
            System.out.println("No encontre nada para Costo de Equipo");
            return null;
        }
        }
        

    catch(SQLException e)
    {
        e.printStackTrace();
        return null;
    }}
    
    
    
    
    
    
    
    
    
    public List<Servicio> Servicio(){
    
        
        try{
      
        
        statement = this.conexion.createStatement();
        res = statement.executeQuery("SELECT * FROM SERVICIO");
        
        
        if(res!= null)
        {
            System.out.println("Extrayendo y Transformando Datos para Costo de SERVICIO");
               while(res.next())
               {
                   servicio.setId_servicios(res.getInt(0));
                   servicio.setNombre(res.getString(1));

                   listServicio.add(servicio);
      
        }
        
        return listServicio;
        }
        else
        {
            System.out.println("No encontre nada para Costo de SERVICIO");
            return null;
        }
        }
        

    catch(SQLException e)
    {
        e.printStackTrace();
        return null;
    }}
     
    
   
        
    
    
}
     

    
