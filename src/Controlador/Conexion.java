
package Controlador;
// patron Singleton 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    public static Conexion instance;
    private Connection con;
    private Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/hotelopm";
            String user = "root";
            String pass = "";
            con = DriverManager.getConnection(url,user,pass);
            System.out.println("base de datos conectada");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public synchronized static Conexion verificarConexion(){
    
    if (instance == null){
    instance = new Conexion();
    
    }
    return instance;
    }
    
    public Connection getCon(){
    return con;
    }
}