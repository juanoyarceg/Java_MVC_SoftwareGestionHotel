
package Controlador;

import Modelo.Habitacion;
import Modelo.PasajeroTitular;
import Modelo.Reserva;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class CStock {
    
  private static final Conexion cone= Conexion.verificarConexion();
   Statement stmt = null;
   int resultado = 0;
  
   public List<Modelo.Stock> mostrarProductos(){
         ArrayList<Modelo.Stock> stock = new ArrayList<>();
             
             
        try {
            stmt = cone.getCon().createStatement();
             String query1 = "select*from stock";
   
             ResultSet r = stmt.executeQuery(query1);
             
              while (r.next()) 
                  {
                     int idStock= (int) r.getObject("idStock");
                     String NombreProducto = (String) r.getObject("NombreProducto");
                     int StockProducto= (int) r.getObject("StockProducto");
                     int Preciojornada= (int) r.getObject("Preciounitario");
                      
                     
                     
                     
                     
                     stock.add(new Modelo.Stock(idStock,NombreProducto,StockProducto,Preciojornada));
                     resultado=1;
                  }
              
           
                 
                 if (resultado==1){
                   
                     
                      
                 }
             
             else{
                 
                
                 
                   
                 
                 
             }
         } catch (SQLException ex) {
             Logger.getLogger(CPasajero.class.getName()).log(Level.SEVERE, null, ex);
         }
         return stock;
    }
     public boolean RegistrarProducto (Modelo.Consumos dts){
      
     //String subSQL="select IdPasajeroTitular from `hotelopm`.`pasajerotitular` order by IdPasajeroTitular desc limit 1";
    
      //int idPasajeroTitular = Integer.valueOf(subSQL); //.parseInt(subSQL);
    
      String SQL="insert into consumos (Cantidad_Producto,Stock_idStock,Reserva_idReservaHabitacion)" +
               "values (?,?,?)";   
    
    // String SQL2="UPDATE habitaciones SET Disponibilidad = 'Ocupada' Where NombreHab = 'Amorlila'"; 
     
     
    try {
           
           PreparedStatement pst=cone.getCon().prepareStatement(SQL);
          // PreparedStatement pst2=cone.getCon().prepareStatement(SQL2);
          // pst2=cone.getCon().prepareStatement(SQL3);
         //  pst2=cone.getCon().prepareStatement(SQL4);
           
           
           pst.setInt(1, dts.getCantidad_Producto());
           pst.setInt(2, dts.getStock_idStock());
           pst.setInt(3, dts.getReserva_idReservaHabitacion());
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
    public List<Modelo.Consumos> mostrarcodigoHabitacion(){
         ArrayList<Modelo.Consumos> codigo = new ArrayList<>();
             
             
        try {
            stmt = cone.getCon().createStatement();
             String query1 = "select IdReservaHabitacion from `hotelopm`.`reserva` order by IdReservaHabitacion desc limit 1";
   
             ResultSet r = stmt.executeQuery(query1);
             
              if (r.next()) 
                  {
                     Object IdReservaHabitacion=   r.getObject("IdReservaHabitacion");
                     
                     
                     codigo.add(new Modelo.Consumos( IdReservaHabitacion));
                     resultado=1;
                  }
              
           
                 
                 if (resultado==1){
                   
                     
                      
                 }
             
             else{
               
                 
             }
         } catch (SQLException ex) {
             Logger.getLogger(CPasajero.class.getName()).log(Level.SEVERE, null, ex);
         }
         return codigo;
    }
    
 public List<Modelo.Consumos> mostrarRegistros(){
         ArrayList<Modelo.Consumos> consumos = new ArrayList<>();
             
             
        try {
            stmt = cone.getCon().createStatement();
             String query1 = "select*from consumos";
   
             ResultSet r = stmt.executeQuery(query1);
             
              while (r.next()) 
                  {
                      int Cantidad_Producto= (int) r.getObject("Cantidad_Producto");
                      int Stock_idStock= (int) r.getObject("Stock_idStock");
                      int Reserva_idReservaHabitacion= (int) r.getObject("Reserva_idReservaHabitacion");
                      
                      
                     consumos.add(new Modelo.Consumos(Cantidad_Producto,Stock_idStock,Reserva_idReservaHabitacion));
                     resultado=1;
                  }
              
           
                 
                 if (resultado==1){
                   
                     
                      
                 }
             
             else{
                 
                
                 
                   
                 
                 
             }
         } catch (SQLException ex) {
             Logger.getLogger(CPasajero.class.getName()).log(Level.SEVERE, null, ex);
         }
         return consumos;
    }
   
   
}
