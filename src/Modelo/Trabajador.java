
package Modelo;


public class Trabajador {
    
 private int idPersona;
 private String Login;
 private int Password;

    public Trabajador() {
    }

    public Trabajador(int idPersona) {
        this.idPersona = idPersona;
    }

    public Trabajador(int idPersona, String Login, int Password) {
        this.idPersona = idPersona;
        this.Login = Login;
        this.Password = Password;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public int getPassword() {
        return Password;
    }

    public void setPassword(int Password) {
        this.Password = Password;
    }
 
    
    
}
