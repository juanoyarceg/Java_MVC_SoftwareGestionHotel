 
package Controlador;
  
import Vista.InicioSesionUser;
import Vista.Menu;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Ctrabajador {
   private static final Conexion cone= Conexion.verificarConexion();
        Statement stmt = null;
        InicioSesionUser us = new InicioSesionUser();
        
    /**
     * Creates new form InicioSesionUser
     */
         public void validarAcceso(String login, String password){   
     
        int resultado = 0;
      
    try {
        stmt = cone.getCon().createStatement();
        String SQL_LOGIN= "SELECT * from `hotelopm`.`usuarios` where `Login`='"+login+"' and `Password`='"+password+"' ";
        ResultSet rs= stmt.executeQuery(SQL_LOGIN);
        if (rs.next()){
            
            resultado =1;
            
           
            if (resultado==1){
                JOptionPane.showMessageDialog(null,"Bienvenido " +login+ " al Sistema de Administración"
                        + " Hotel Open Mind");
                Menu menu= new Menu();
                menu.setVisible(true);
                this.us.dispose();
            } 
            }
            else{
                
                JOptionPane.showMessageDialog(null, "Usuario/Contraseña incorrecta, pruebe nuevamente");
            }
            
            
            
        
    } catch (Exception e) {
        
           JOptionPane.showConfirmDialog(null, e.getMessage());
    }
            
        }  
     
     } 

