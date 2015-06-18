/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiones;

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
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos Barrera
 */
public class ConexionGerencial {
    
    
      Connection conexion=null;
     
    public Connection GetConnection()
    {
      
      
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost/dimesa";
            String usuarioDB="root";
            String passwordDB="";
            conexion= DriverManager.getConnection(servidor,usuarioDB,passwordDB);
           

           
             return conexion;
        }
      
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error3 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
 
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

    
    public void InsertEmpleados(List<Empleado> listEmpleado)
    {
         try{
      
            Statement statement = this.conexion.createStatement();
            ResultSet res = null;
        
        
        if(!listEmpleado.isEmpty())
        {
            System.out.println("Cargando Datos para EMPLEADO");
            
            for(Empleado empleado : listEmpleado)
            {
                res  = statement.executeQuery("INSERT INTO EMPLEADO(IdEmpleado,NombreEmpleado,ApellidoEmpleado,Cargo,Costo_hora)"
                        + "VALUES("
                        +empleado.getIdEmpleado()+","
                        +"'"+empleado.getNombreEmpleado()+"',"
                        +"'"+empleado.getApellidoEmpleado()+"',"
                        +"'"+empleado.getCargo()+"',"
                         +""+empleado.getCosto_hora()+","
                        + ");");
            }
            
            
              }
        else
        {
            System.out.println("No encontre nada para EMPLEADO");
        }
        
        }
        
         catch(SQLException e)
    {
        e.printStackTrace();
    }
    }
    
    
    public void InsertCostoEquipo(List<Costo_Equipo> listCosto)
    {
         try{
      
            Statement statement = this.conexion.createStatement();
            ResultSet res = null;
        
        
        if(!listCosto.isEmpty())
        {
            System.out.println("Cargando Datos para COSTO EQUIPO");
            
            for(Costo_Equipo costo : listCosto)
            {
                res  = statement.executeQuery("INSERT INTO COSTO_EQUIPO(Id_costo_equipo,costo)"
                        + "VALUES("
                        +costo.getId_costo_equipo()+","
                        +costo.getCosto()
                        + ");");
            }
            
            
              }
        else
        {
            System.out.println("No encontre nada para COSTO EQUIPO");
        }
        
        }
        
         catch(SQLException e)
    {
        e.printStackTrace();
    }
    }
    
      public void InsertEquipo(List<Equipo> listEquipo)
    {
         try{
      
            Statement statement = this.conexion.createStatement();
            ResultSet res = null;
        
        
        if(!listEquipo.isEmpty())
        {
            System.out.println("Cargando Datos para EQUIPO");
            
            for(Equipo equipo : listEquipo)
            {
                res  = statement.executeQuery("INSERT INTO COSTO_EQUIPO(Pla_dimesa,Num_serie,Marca_modelo,Modelo_equipo,Nomb_equipo,Observ_eq,Empresa_responsable,fecha_registro)"
                        + "VALUES("
                        +equipo.getPla_dimesa()+","
                        +"'"+equipo.getNum_serie()+"',"
                        +"'"+equipo.getMarca_modelo()+"',"
                        +"'"+equipo.getModelo_equipo()+"',"
                        +"'"+equipo.getNomb_equipo()+"',"
                        +"'"+equipo.getObserv_eq()+"',"
                        +"'"+equipo.getEmpresa_responsable()+"',"
                        +"'"+equipo.getFecha_registro()+"',"
                        + ");");
            }
            
            
              }
        else
        {
            System.out.println("No encontre nada para EQUIPO");
        }
        
        }
        
         catch(SQLException e)
    {
        e.printStackTrace();
    }
    }
      
      
         public void InsertEvento(List<Evento> listEvento)
    {
         try{
      
            Statement statement = this.conexion.createStatement();
            ResultSet res = null;
        
        
        if(!listEvento.isEmpty())
        {
            System.out.println("Cargando Datos para Evento");
            
            for(Evento evento : listEvento)
            {
                res  = statement.executeQuery("INSERT INTO Evento(num_dimesa,Pla_dimesa,Id_costo_equipo,Tbl_equipo_pla_dimesa,Servicio,Fecha_inicio,Fecha_fin,Unidad,Falla)"
                        + "VALUES("
                        +evento.getNum_dimesa()+","
                        +evento.getPla_dimesa()+","
                        +evento.getId_costo_equipo()+","
                        +"'"+evento.getTbl_equipo_pla_dimesa()+"',"
                        +"'"+evento.getServicio()+"',"
                        +"'"+evento.getFecha_inicio()+"',"
                        +"'"+evento.getFecha_fin()+"',"
                        +"'"+evento.getUnidad()+"',"
                        +"'"+evento.getFalla()+"',"
                        + ");");
            }
            
            
              }
        else
        {
            System.out.println("No encontre nada para EQUIPO");
        }
        
        }
        
         catch(SQLException e)
    {
        e.printStackTrace();
    }
    }
     
         
            public void InsertSupervisor(List<Supervisor> listSupervisor)
    {
         try{
      
            Statement statement = this.conexion.createStatement();
            ResultSet res = null;
        
        
        if(!listSupervisor.isEmpty())
        {
            System.out.println("Cargando Datos para Supervisor");
            
            for(Supervisor supervisor : listSupervisor)
            {
                res  = statement.executeQuery("INSERT INTO Supervisor(Id_supervisor,IdEmpleado,nombre,apellido)"
                        + "VALUES("
                        +supervisor.getIdEmpleado()+","
                        +supervisor.getIdEmpleado()+","
                        +"'"+supervisor.getNombre()+"',"
                        +"'"+supervisor.getApellido()+"',"
                        + ");");
            }
            
            
              }
        else
        {
            System.out.println("No encontre nada para Supervisor");
        }
        
        }
        
         catch(SQLException e)
    {
        e.printStackTrace();
    }
    }
            
             public void InsertServicio(List<Servicio> listServicio)
    {
         try{
      
            Statement statement = this.conexion.createStatement();
            ResultSet res = null;
        
        
        if(!listServicio.isEmpty())
        {
            System.out.println("Cargando Datos para Servicio");
            
            for(Servicio servicio : listServicio)
            {
                res  = statement.executeQuery("INSERT INTO Servicio(id_servicios,nombre)"
                        + "VALUES("
                        +servicio.getId_servicios()+","
                        +"'"+servicio.getNombre()+"',"
                        + ");");
            }
            
            
              }
        else
        {
            System.out.println("No encontre nada para SERVICIO");
        }
        
        }
        
         catch(SQLException e)
    {
        e.printStackTrace();
    }
    }
         
   

   
    
   
    
}
