
package Modelo;

import java.sql.Date;


public class Reserva {
    
  private int idReservaHabitacion;
  private Object IdPasajeroTitular;
  private String Modalidad;
  private Date Fecha_Ingreso;
  private Date Fecha_Egreso;
  private int PasajeroTitular_IdPasajeroTitular;
  private String Habitaciones_NombreHab;
 

    public Reserva() {
    }

    public Reserva(Object IdPasajeroTitular) {
        this.IdPasajeroTitular = IdPasajeroTitular;
    }

    public Object getIdPasajeroTitular() {
        return IdPasajeroTitular;
    }

    public void setIdPasajeroTitular(Object IdPasajeroTitular) {
        this.IdPasajeroTitular = IdPasajeroTitular;
    }

   

    public Reserva(int idReservaHabitacion, String Modalidad, Date Fecha_Ingreso, Date Fecha_Egreso, String Habitaciones_NombreHab) {
        this.idReservaHabitacion = idReservaHabitacion;
        this.Modalidad = Modalidad;
        this.Fecha_Ingreso = Fecha_Ingreso;
        this.Fecha_Egreso = Fecha_Egreso;
        this.Habitaciones_NombreHab = Habitaciones_NombreHab;
    }

    public Reserva(String Modalidad, Date Fecha_Ingreso, Date Fecha_Egreso, int PasajeroTitular_IdPasajeroTitular, String Habitaciones_NombreHab) {
        this.Modalidad = Modalidad;
        this.Fecha_Ingreso = Fecha_Ingreso;
        this.Fecha_Egreso = Fecha_Egreso;
        this.PasajeroTitular_IdPasajeroTitular = PasajeroTitular_IdPasajeroTitular;
        this.Habitaciones_NombreHab = Habitaciones_NombreHab;
    }

    public int getIdReservaHabitacion() {
        return idReservaHabitacion;
    }

    public void setIdReservaHabitacion(int idReservaHabitacion) {
        this.idReservaHabitacion = idReservaHabitacion;
    }

    public String getModalidad() {
        return Modalidad;
    }

    public void setModalidad(String Modalidad) {
        this.Modalidad = Modalidad;
    }

    public Date getFecha_Ingreso() {
        return Fecha_Ingreso;
    }

    public void setFecha_Ingreso(Date Fecha_Ingreso) {
        this.Fecha_Ingreso = Fecha_Ingreso;
    }

    public Date getFecha_Egreso() {
        return Fecha_Egreso;
    }

    public void setFecha_Egreso(Date Fecha_Egreso) {
        this.Fecha_Egreso = Fecha_Egreso;
    }

    public int getPasajeroTitular_IdPasajeroTitular() {
        return PasajeroTitular_IdPasajeroTitular;
    }

    public void setPasajeroTitular_IdPasajeroTitular(int PasajeroTitular_IdPasajeroTitular) {
        this.PasajeroTitular_IdPasajeroTitular = PasajeroTitular_IdPasajeroTitular;
    }

    public String getHabitaciones_NombreHab() {
        return Habitaciones_NombreHab;
    }

    public void setHabitaciones_NombreHab(String Habitaciones_NombreHab) {
        this.Habitaciones_NombreHab = Habitaciones_NombreHab;
    }

    public void getHabitaciones_NombreHab(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getModalidad(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}

    