
package Controlador;

import Modelo.PasajeroTitular;
import Modelo.Pasajero;
import Vista.InicioSesionUser;
import Vista.Menu;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class CPasajero {
     private static final Conexion cone= Conexion.verificarConexion();
        Statement stmt = null;
        int resultado = 0;
        Vista.Pasajero pa= new Vista.Pasajero();
        
    public List<Pasajero> verificarPasajero(int Rut){
         ArrayList<Pasajero> pasajero = new ArrayList<>();
             
             
        try {
            stmt = cone.getCon().createStatement();
             String query1 = "Select * from `hotelopm`.`persona`  where `Rut` = '" +Rut+ "'";
   
             ResultSet r = stmt.executeQuery(query1);
             
              if (r.next()) 
                  {
                     
                     
                     String Nombre = (String) r.getObject("Nombre");
                     String APaterno = (String) r.getObject("APaterno");
                     String AMaterno = (String) r.getObject("AMaterno");
                     String Nacionalidad = (String) r.getObject("Nacionalidad");
                     String Sexo = (String) r.getObject("Sexo");
                     Date Fecha_Nacimiento= (Date) r.getObject("Fecha_Nacimiento");
                     
                     
                     pasajero.add(new Pasajero(Nombre,APaterno,AMaterno,Nacionalidad,Sexo,Fecha_Nacimiento));
                     resultado=1;
                  }
              
           
                 
                 if (resultado==1){
                     JOptionPane.showMessageDialog(null,"El Rut "  +Rut+ " ya se encuentra registrado");
                     
                      
                 }
             
             else{
                 
                 JOptionPane.showMessageDialog(null, "El Rut"  +Rut+  " no se encuentra registrado, registrelo\"");
                 
                   
                 
                 
             }
         } catch (SQLException ex) {
             Logger.getLogger(CPasajero.class.getName()).log(Level.SEVERE, null, ex);
         }
         return pasajero;
    }
     
     
     
    
    
    
    
    public boolean ingresarPasajeroTitular(Pasajero dts ){
    String SQL = "insert into `hotelopm`.`persona`(Rut,Nombre,APaterno,AMaterno,Nacionalidad,Sexo,Fecha_Nacimiento)"
                + "values (?,?,?,?,?,?,?)";
    String SQL2 = "insert`hotelopm`.`pasajerotitular` (Persona_idPersona)"
                + "values ((select idPersona from `hotelopm`.`persona` order by idPersona desc limit 1))";
     
        try {

            PreparedStatement pst = cone.getCon().prepareStatement(SQL);
            PreparedStatement pst2 = cone.getCon().prepareStatement(SQL2);
            
            
            
            
            pst.setInt(1, dts.getRut());
            pst.setString(2, dts.getNombre());
            pst.setString(3, dts.getAPaterno());
            pst.setString(4, dts.getAMaterno());
            pst.setString(5, dts.getNacionalidad());
            pst.setString(6, dts.getSexo());
            pst.setDate(7, dts.getFecha_Nacimiento());
            

          //  pst2.setString(1, c.getTipo_Cliente());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;

                } else {
                    return false;
                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
        public boolean ingresarPasajeroAcompañante(Pasajero dts ){
    String SQL = "insert into `hotelopm`.`persona`(Rut,Nombre,APaterno,AMaterno,Nacionalidad,Sexo,Fecha_Nacimiento)"
                + "values (?,?,?,?,?,?,?)";
    String SQL2 = "insert`hotelopm`.`pasajeroacompañante` (Persona_idPersona)"
                + "values ((select idPersona from `hotelopm`.`persona` order by idPersona desc limit 1))";
     
        try {

            PreparedStatement pst = cone.getCon().prepareStatement(SQL);
            PreparedStatement pst2 = cone.getCon().prepareStatement(SQL2);
            
            
            
            
            pst.setInt(1, dts.getRut());
            pst.setString(2, dts.getNombre());
            pst.setString(3, dts.getAPaterno());
            pst.setString(4, dts.getAMaterno());
            pst.setString(5, dts.getNacionalidad());
            pst.setString(6, dts.getSexo());
            pst.setDate(7, dts.getFecha_Nacimiento());
            

          //  pst2.setString(1, c.getTipo_Cliente());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;

                } else {
                    return false;
                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
        
         public List<Pasajero> mostrarPasajeroTitular(){
         ArrayList<Pasajero> pasajero = new ArrayList<>();
             
             
        try {
            stmt = cone.getCon().createStatement();
             String query1 = "Select Rut, Nombre, APaterno, AMaterno, Nacionalidad, Sexo from persona,pasajerotitular\n" +
"where persona.idPersona = pasajerotitular.Persona_idPersona  order by Persona_idPersona desc limit 1";
   
             ResultSet r = stmt.executeQuery(query1);
             
              if (r.next()) 
                  {
                     
                     int Rut= (int) r.getObject("Rut");
                     String Nombre = (String) r.getObject("Nombre");
                     String APaterno = (String) r.getObject("APaterno");
                     String AMaterno = (String) r.getObject("AMaterno");
                     String Nacionalidad = (String) r.getObject("Nacionalidad");
                     String Sexo = (String) r.getObject("Sexo");
                     
                     
                     
                     pasajero.add(new Pasajero(Rut,Nombre,APaterno,AMaterno,Nacionalidad,Sexo));
                     resultado=1;
                  }
              
           
                 
                 if (resultado==1){
                   
                     
                      
                 }
             
             else{
                 
                
                 
                   
                 
                 
             }
         } catch (SQLException ex) {
             Logger.getLogger(CPasajero.class.getName()).log(Level.SEVERE, null, ex);
         }
         return pasajero;
    }
         
    public List<Pasajero> mostrarPasajeroAcompañante(){
         ArrayList<Pasajero> pasajero = new ArrayList<>();
             
             
        try {
            stmt = cone.getCon().createStatement();
             String query1 = "Select Rut, Nombre, APaterno, AMaterno, Nacionalidad, Sexo from persona,pasajeroacompañante where persona.idPersona = pasajeroacompañante.Persona_idPersona  order by Persona_idPersona desc limit 1";

   
             ResultSet r = stmt.executeQuery(query1);
             
              while (r.next()) 
                  {
                     
                     int Rut= (int) r.getObject("Rut");
                     String Nombre = (String) r.getObject("Nombre");
                     String APaterno = (String) r.getObject("APaterno");
                     String AMaterno = (String) r.getObject("AMaterno");
                     String Nacionalidad = (String) r.getObject("Nacionalidad");
                     String Sexo = (String) r.getObject("Sexo");
                     
                     
                     
                     pasajero.add(new Pasajero(Rut,Nombre,APaterno,AMaterno,Nacionalidad,Sexo));
                     resultado=1;
                  }
              
           
                 
                 if (resultado==1){
                   
                     
                      
                 }
             
             else{
                 
                
                 
                   
                 
                 
             }
         } catch (SQLException ex) {
             Logger.getLogger(CPasajero.class.getName()).log(Level.SEVERE, null, ex);
         }
         return pasajero;
    }
    }




        
       