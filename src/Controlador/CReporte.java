

package Controlador;
import Modelo.PasajeroTitular;
import Modelo.Habitacion;
import Modelo.Pasajero;
import Modelo.Reporte;
import Modelo.Clienteamor;
import Modelo.ConsultaHabitacion;
import Modelo.ReporteG1;
import Modelo.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Date;
import javax.swing.JOptionPane;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import Modelo.ReporteG2;
import Modelo.ReporteG3;
import Modelo.ReporteG4;
import static java.lang.Integer.sum;
import static org.eclipse.persistence.expressions.ExpressionOperator.Count;
import static org.eclipse.persistence.expressions.ExpressionOperator.Sum;

public class CReporte {
      private static final Conexion cone= Conexion.verificarConexion();
        CallableStatement stmt = null;
      
        // ESTE METODO SE USA PARA MOSTRAR RESULTADOS DE TABLAS 
    public List <Reporte> ConsultaReporte1(int ingrese_Rut){
    ArrayList<Reporte> reporte = new ArrayList <>();  
          
        
          try {
           
              String SQL= "{call hotelopenmind.ProcedimientoExtra3(?)}";
              stmt = cone.getCon().prepareCall(SQL);
              stmt.setInt(1, ingrese_Rut);
              ResultSet rs= stmt.executeQuery();
             while (rs.next()){
              
              //String report1= rs.getString(1).toString();
              int idPersona = (int) rs.getObject("idPersona");        
              int Rut  = (int) rs.getObject("Rut"); 
              String Nombre = (String) rs.getObject("Nombre");
              String APaterno = (String) rs.getObject("APaterno");
              String AMaterno = (String) rs.getObject("AMaterno");
              String Nacionalidad = (String) rs.getObject("Nacionalidad");
              String Sexo = (String) rs.getObject("Sexo");
              Date Fecha_Nacimiento= (Date)rs.getObject("Fecha_Nacimiento");
              String Tipo_Cliente = (String) rs.getObject("Tipo_Cliente");
              
                
          reporte.add(new Reporte(idPersona,Rut,Nombre,APaterno,AMaterno,Nacionalidad,Sexo,Fecha_Nacimiento,Tipo_Cliente));
              } 
              rs.close();
              
          } catch (SQLException ex) {
              Logger.getLogger(CReporte.class.getName()).log(Level.SEVERE, null, ex);
          }
          return reporte;
    
        
        
    
    } 
    
    // ESTE METODO SE USA PARA MOSTRAR RESULTADOS DE TABLAS ACOTADAS, ES DECIR SOLAMENTE LO QUE QUIERO QUE MUESTRE
     public List <Reporte> ConsultaReporte2(int ingrese_Rut){
    ArrayList<Reporte> reporte = new ArrayList <>();  
          
        
          try {
           
              String SQL= "{call hotelopenmind.ProcedimientoExtra3(?)}";
              stmt = cone.getCon().prepareCall(SQL);
              stmt.setInt(1, ingrese_Rut);
              ResultSet rs= stmt.executeQuery();
             while (rs.next()){
                 
                 // SOLO SE MOSTRARAN LOS CAMPOS ACTIVADOS
              
              //String report1= rs.getString(1).toString();
              int idPersona = (int) rs.getObject("idPersona");        
             // int Rut  = (int) rs.getObject("Rut"); 
              String Nombre = (String) rs.getObject("Nombre");
              String APaterno = (String) rs.getObject("APaterno");
             // String AMaterno = (String) rs.getObject("AMaterno");
             // String Nacionalidad = (String) rs.getObject("Nacionalidad");
             // String Sexo = (String) rs.getObject("Sexo");
             // Date Fecha_Nacimiento= (Date)rs.getObject("Fecha_Nacimiento");
              String Tipo_Cliente = (String) rs.getObject("Tipo_Cliente");
              
                // EN LA CLASE MODELO SE DEBE CREAR UN CONSTRUCTOR CON LOS PARAMETROS DESEADOS
          reporte.add(new Reporte(idPersona,Nombre,APaterno,Tipo_Cliente));
              } 
              rs.close();
              
          } catch (SQLException ex) {
              Logger.getLogger(CReporte.class.getName()).log(Level.SEVERE, null, ex);
          }
          return reporte;
          
          }
     public List <Clienteamor> ClientedelAmor(){
    ArrayList<Clienteamor> reporte = new ArrayList <>();  
                  
          try {
           
              String SQL= "{call hotelopenmind.ClienteDelAmor()}";
              stmt = cone.getCon().prepareCall(SQL);
          
              ResultSet rs= stmt.executeQuery();
             while (rs.next()){
              
                 int Rut  = (int) rs.getObject("Rut");  
                long count = (long) rs.getObject("count(*)");        
             
              
                // EN LA CLASE MODELO SE DEBE CREAR UN CONSTRUCTOR CON LOS PARAMETROS DESEADOS
         
              reporte.add(new Clienteamor(Rut,count));
              } 
              rs.close();
              
          } catch (SQLException ex) {
              Logger.getLogger(CReporte.class.getName()).log(Level.SEVERE, null, ex);
          }
          return reporte;
          
          }
     
     public List <ConsultaHabitacion> ConsultaHabitaciones(){
    ArrayList<ConsultaHabitacion> reporte = new ArrayList <>();  
           
         try {
           
              String SQL= "{call hotelopenmind.ConsultaPorHabitacion()}";
              stmt = cone.getCon().prepareCall(SQL);
              
              ResultSet rs= stmt.executeQuery();
             while (rs.next()){
                 
                 // SOLO SE MOSTRARAN LOS CAMPOS ACTIVADOS
              
              //String report1= rs.getString(1).toString();
              int Reserva_idReserva  = (int) rs.getObject("Reserva_idReserva"); 
              Date Fecha_Pago= (Date)rs.getObject("Fecha_Pago");
              int Total_Pago  = (int) rs.getObject("Total_Pago"); 
              String Nombre_Habitacion = (String) rs.getObject("Nombre_Habitacion");
                  Object Rut_Pasajero =   rs.getObject("Rut_Pasajero");
              
              //String APaterno = (String) rs.getObject("APaterno");
              
             // String AMaterno = (String) rs.getObject("AMaterno");
             // String Nacionalidad = (String) rs.getObject("Nacionalidad");
             // String Sexo = (String) rs.getObject("Sexo");
           
              //String Tipo_Cliente = (String) rs.getObject("Tipo_Cliente");
              
                // EN LA CLASE MODELO SE DEBE CREAR UN CONSTRUCTOR CON LOS PARAMETROS DESEADOS
          reporte.add(new ConsultaHabitacion(Reserva_idReserva,Fecha_Pago,Total_Pago, Nombre_Habitacion, Rut_Pasajero));
              } 
              rs.close();
              
          } catch (SQLException ex) {
              Logger.getLogger(CReporte.class.getName()).log(Level.SEVERE, null, ex);
          }
          return reporte;
          
          }
     
     public List <ReporteG1> ReporteGeneral_1(){
    ArrayList<ReporteG1> reporte = new ArrayList <>();  
                  
          try {
           
              String SQL= "{call hotelopenmind.ProcedimientoRG1()}";
              stmt = cone.getCon().prepareCall(SQL);
          
              ResultSet rs= stmt.executeQuery();
             while (rs.next()){
              
                 String NombreHabitacion  = (String) rs.getObject("NombreHabitacion");  
                long count = (long) rs.getObject("count(*)");        
             
              
                // EN LA CLASE MODELO SE DEBE CREAR UN CONSTRUCTOR CON LOS PARAMETROS DESEADOS
         
                   reporte.add(new ReporteG1 (NombreHabitacion,count));
              } 
              rs.close();
              
          } catch (SQLException ex) {
              Logger.getLogger(CReporte.class.getName()).log(Level.SEVERE, null, ex);
          }
          return reporte;
          
          }
     
     public List <ReporteG2> ReporteGeneral_2(){
    ArrayList<ReporteG2> reporte = new ArrayList <>();  
                  
          try {
           
              String SQL= "{call hotelopenmind.ProcedimientoRG2()}";
              stmt = cone.getCon().prepareCall(SQL);
          
              ResultSet rs= stmt.executeQuery();
             while (rs.next()){
              
                 String NombreHabitacion  = (String) rs.getObject("NombreHabitacion");  
                long count = (long) rs.getObject("count(*)");        
             
              
                // EN LA CLASE MODELO SE DEBE CREAR UN CONSTRUCTOR CON LOS PARAMETROS DESEADOS
         
                   reporte.add(new ReporteG2(NombreHabitacion,count));
              } 
              rs.close();
              
          } catch (SQLException ex) {
              Logger.getLogger(CReporte.class.getName()).log(Level.SEVERE, null, ex);
          }
          return reporte;
          
          }
     
     public List <ReporteG3> ReporteGeneral_3(){
    ArrayList<ReporteG3> reporte = new ArrayList <>();  
                  
          try {
           
              String SQL= "{call hotelopenmind.ProcedimientoRG3()}";
              stmt = cone.getCon().prepareCall(SQL);
          
              ResultSet rs= stmt.executeQuery();
              
              while (rs.next()){
              
                 String Nombre  = (String) rs.getObject("Nombre");  
                //long count = (long) rs.getObject("count(*)");        
                Object Cantidad=  rs.getObject("Cantidad");
                //int Cantidad  = (int) rs.getObject("Cantidad_Vendida"); 
                // EN LA CLASE MODELO SE DEBE CREAR UN CONSTRUCTOR CON LOS PARAMETROS DESEADOS
                 //Object Cantidad_Vendida =   rs.getObject("Cantidad_Vendida");
                 
                   reporte.add(new ReporteG3(Nombre,Cantidad));
              } 
              rs.close();
              
          } catch (SQLException ex) {
              Logger.getLogger(CReporte.class.getName()).log(Level.SEVERE, null, ex);
          }
          return reporte;
          
          }
     
     
     public List <ReporteG4> ReporteGeneral_4(){
    ArrayList<ReporteG4> reporte = new ArrayList <>();  
                  
          try {
           
              String SQL= "{call hotelopenmind.ProcedimientoRG4()}";
              stmt = cone.getCon().prepareCall(SQL);
          
              ResultSet rs= stmt.executeQuery();
             while (rs.next()){
              
                 String Nombre  = (String) rs.getObject("Nombre");  
                Object Cantidad= rs.getObject("Cantidad");        
                // int Cantidad_Vendida = (int) rs.getObject("Cantidad_Vendida");
                //int Cantidad  = (int) rs.getObject("Cantidad_Vendida"); 
                // EN LA CLASE MODELO SE DEBE CREAR UN CONSTRUCTOR CON LOS PARAMETROS DESEADOS
                 //Object Cantidad_Vendida =   rs.getObject("Cantidad_Vendida");
                 
                   reporte.add(new ReporteG4(Nombre, Cantidad));
              } 
              rs.close();
              
          } catch (SQLException ex) {
              Logger.getLogger(CReporte.class.getName()).log(Level.SEVERE, null, ex);
          }
          return reporte;
          
          }
}
    
    
