 
package Controlador;
 
import Modelo.PasajeroTitular;
import Modelo.Habitacion;
import Modelo.Pasajero;
import Modelo.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CHabitacion {
   private static final Conexion cone= Conexion.verificarConexion();
   Statement stmt = null;
   int resultado = 0;
   Vista.Habitacion ha= new Vista.Habitacion();   
   
   public Integer totalregistros;
    
    public List<Habitacion> mostrarHabitaciones(){
         ArrayList<Habitacion> habitacion = new ArrayList<>();
             
             
        try {
            stmt = cone.getCon().createStatement();
             String query1 = "select*from habitaciones";
   
             ResultSet r = stmt.executeQuery(query1);
             
              while (r.next()) 
                  {
                     
                     String NombreHab = (String) r.getObject("NombreHab");
                     int Preciomomento= (int) r.getObject("Preciomomento");
                     int Preciojornada= (int) r.getObject("Preciojornada");
                     String Disponibilidad = (String) r.getObject("Disponibilidad");
                     
                     
                     
                     
                     habitacion.add(new Habitacion(NombreHab,Preciomomento,Preciojornada,Disponibilidad));
                     resultado=1;
                  }
              
           
                 
                 if (resultado==1){
                   
                     
                      
                 }
             
             else{
                 
                
                 
                   
                 
                 
             }
         } catch (SQLException ex) {
             Logger.getLogger(CPasajero.class.getName()).log(Level.SEVERE, null, ex);
         }
         return habitacion;
    }
    
    
   
    
    public boolean Reservar(Reserva dts){
      
     //String subSQL="select IdPasajeroTitular from `hotelopm`.`pasajerotitular` order by IdPasajeroTitular desc limit 1";
    
      //int idPasajeroTitular = Integer.valueOf(subSQL); //.parseInt(subSQL);
    
      String SQL="insert into reserva (Modalidad,Fecha_Ingreso,Fecha_Egreso,PasajeroTitular_IdPasajeroTitular,Habitaciones_NombreHab)" +
               "values (?,?,?,?,?)";   
    
    // String SQL2="UPDATE habitaciones SET Disponibilidad = 'Ocupada' Where NombreHab = 'Amorlila'"; 
     //String SQL3="UPDATE habitaciones SET Disponibilidad = 'Ocupada' Where NombreHab = 'Gradocinco'";
    // String SQL4="UPDATE habitaciones SET Disponibilidad = 'Ocupada' Where NombreHab = 'Oasisdeplacer'";
     
     
    try {
           
           PreparedStatement pst=cone.getCon().prepareStatement(SQL);
          // PreparedStatement pst2=cone.getCon().prepareStatement(SQL2);
          // pst2=cone.getCon().prepareStatement(SQL3);
         //  pst2=cone.getCon().prepareStatement(SQL4);
           
           pst.setString(1,dts.getModalidad());
           pst.setDate(2, dts.getFecha_Ingreso());
           pst.setDate(3, dts.getFecha_Egreso());
           pst.setInt(4, dts.getPasajeroTitular_IdPasajeroTitular());
           pst.setString(5,dts.getHabitaciones_NombreHab());
           
            int n = pst.executeUpdate();

             

            if (n != 0) {
                

               
                    return true;

                

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        } 
        
    }
    public List<Reserva> mostraridPasTitular(){
         ArrayList<Reserva> titular = new ArrayList<>();
             
             
        try {
            stmt = cone.getCon().createStatement();
             String query1 = "select IdPasajeroTitular from `hotelopm`.`pasajerotitular` order by IdPasajeroTitular desc limit 1";
   
             ResultSet r = stmt.executeQuery(query1);
             
              if (r.next()) 
                  {
                     Object IdPasajeroTitular=   r.getObject("IdPasajeroTitular");
                     
                     
                     titular.add(new Reserva(IdPasajeroTitular));
                     resultado=1;
                  }
              
           
                 
                 if (resultado==1){
                   
                     
                      
                 }
             
             else{
               
                 
             }
         } catch (SQLException ex) {
             Logger.getLogger(CPasajero.class.getName()).log(Level.SEVERE, null, ex);
         }
         return titular;
    }
    
    public List<Reserva> mostrarReserva(){
         ArrayList<Reserva> reserva = new ArrayList<>();
             
             
        try {
            stmt = cone.getCon().createStatement();
             String query1 = "select*from reserva";
   
             ResultSet r = stmt.executeQuery(query1);
             
              if (r.next()) 
                  {
                     int idReservaHabitacion= (int) r.getObject("idReservaHabitacion");
                     String Modalidad = (String) r.getObject("Modalidad");
                     Date Fecha_Ingreso= (Date) r.getObject("Fecha_Ingreso");
                     Date Fecha_Egreso= (Date) r.getObject("Fecha_Egreso");
                     String Habitaciones_NombreHab = (String) r.getObject("Habitaciones_NombreHab");
                     
                     reserva.add(new Reserva(idReservaHabitacion,Modalidad,Fecha_Ingreso,Fecha_Egreso,Habitaciones_NombreHab));
                     resultado=1;
                  }
              
           
                 
                 if (resultado==1){
                   
                     
                      
                 }
             
             else{
                 
                
                 
                   
                 
                 
             }
         } catch (SQLException ex) {
             Logger.getLogger(CPasajero.class.getName()).log(Level.SEVERE, null, ex);
         }
         return reserva;
    }
}

 