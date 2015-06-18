/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etldimesa;

import Conexiones.ConexionGerencial;
import Conexiones.ConexionTransaccional;
import Modelos.Costo_Equipo;
import Modelos.Empleado;
import Modelos.Equipo;
import Modelos.Evento;
import Modelos.Servicio;
import Modelos.Supervisor;
import java.util.List;


/**
 *
 * @author RAUL
 */
public class ETLDimesa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conexiones.ConexionGerencial cg = new ConexionGerencial();
        Conexiones.ConexionTransaccional ct = new ConexionTransaccional();
        
        List<Costo_Equipo> listCosto = null;
        List<Empleado> listEmpleado = null;
        List<Equipo> listEquipo = null;
        List<Evento> listEvento = null;
        List<Servicio> listServicio = null;
        List<Supervisor> listSupervisor = null;
        
       ct.GetConnection();
       
      listCosto =  ct.CostoEquipo();
      listEmpleado = ct.Empleado();
      listEquipo = ct.Equipo();
      listEvento =  ct.Evento();
      listServicio =  ct.Servicio();
      listSupervisor = ct.Supervisor();
       
       ct.Close();
       
       
       cg.GetConnection();
       
       cg.InsertCostoEquipo(listCosto);
       cg.InsertEmpleados(listEmpleado);
       cg.InsertEquipo(listEquipo);
       cg.InsertEvento(listEvento);
       cg.InsertServicio(listServicio);
       cg.InsertSupervisor(listSupervisor);
       
       cg.Close();
       
       
        
        
    }
    
}
