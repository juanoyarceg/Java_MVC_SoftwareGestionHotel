
package Modelo;

import static java.util.Calendar.DATE;
import java.sql.Date;


public class Pasajero {
    
  private int idPersona;
  private int Rut;
  private String Nombre;
  private String APaterno;
  private String AMaterno;
  private String Nacionalidad;
  private String Sexo;
  private String Telefono;
  private Date Fecha_Nacimiento; // AVERIGUAR EL TIPO DE DATE
  private String Direccion;
  private String Varchar;

    public Pasajero() {
    }

    public Pasajero(int idPersona, int Rut) {
        this.idPersona = idPersona;
        this.Rut = Rut;
    }

    public Pasajero(int idPersona, int Rut, String Nombre, String APaterno, String AMaterno, String Nacionalidad, String Sexo,Date Fecha_Nacimiento, String Direccion) {
        this.idPersona = idPersona;
        this.Rut = Rut;
        this.Nombre = Nombre;
        this.APaterno = APaterno;
        this.AMaterno = AMaterno;
        this.Nacionalidad = Nacionalidad;
        this.Sexo = Sexo;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
       
    }

    public Pasajero(int Rut, String Nombre, String APaterno, String AMaterno, String Nacionalidad, String Sexo) {
        this.Rut = Rut;
        this.Nombre = Nombre;
        this.APaterno = APaterno;
        this.AMaterno = AMaterno;
        this.Nacionalidad = Nacionalidad;
        this.Sexo = Sexo;
    }
    
     public Pasajero(String Nombre, String APaterno, String AMaterno, String Nacionalidad,String Sexo, Date Fecha_Nacimiento) {
       
        this.Nombre = Nombre;
        this.APaterno = APaterno;
        this.AMaterno = AMaterno;
        this.Nacionalidad = Nacionalidad;
        this.Sexo = Sexo;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
       
    }

   

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAPaterno() {
        return APaterno;
    }

    public void setAPaterno(String APaterno) {
        this.APaterno = APaterno;
    }

    public String getAMaterno() {
        return AMaterno;
    }

    public void setAMaterno(String AMaterno) {
        this.AMaterno = AMaterno;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }


    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getVarchar() {
        return Varchar;
    }

    public void setVarchar(String Varchar) {
        this.Varchar = Varchar;
    }

  
    
}
