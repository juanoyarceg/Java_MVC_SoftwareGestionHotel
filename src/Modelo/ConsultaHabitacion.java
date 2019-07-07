
package Modelo;

 
import java.sql.Date;

public class ConsultaHabitacion {
    int Reserva_idReserva;
    Date Fecha_Pago;
    int Total_Pago; 
    String  Nombre_Habitacion;
    Object Rut_Pasajero;

    public ConsultaHabitacion() {
    }

    public ConsultaHabitacion(int Reserva_idReserva, Date Fecha_Pago, int Total_Pago, String Nombre_Habitacion,Object Rut_Pasajero) {
        this.Reserva_idReserva = Reserva_idReserva;
        this.Fecha_Pago = Fecha_Pago;
        this.Total_Pago = Total_Pago;
        this.Nombre_Habitacion = Nombre_Habitacion;
        this.Rut_Pasajero = Rut_Pasajero;
    }

    public int getReserva_idReserva() {
        return Reserva_idReserva;
    }

    public void setReserva_idReserva(int Reserva_idReserva) {
        this.Reserva_idReserva = Reserva_idReserva;
    }

    public Date getFecha_Pago() {
        return Fecha_Pago;
    }

    public void setFecha_Pago(Date Fecha_Pago) {
        this.Fecha_Pago = Fecha_Pago;
    }

    public int getTotal_Pago() {
        return Total_Pago;
    }

    public void setTotal_Pago(int Total_Pago) {
        this.Total_Pago = Total_Pago;
    }

    public String getNombre_Habitacion() {
        return Nombre_Habitacion;
    }

    public void setNombre_Habitacion(String Nombre_Habitacion) {
        this.Nombre_Habitacion = Nombre_Habitacion;
    }

    public Object getRut_Pasajero() {
        return Rut_Pasajero;
    }

    public void setRut_Pasajero(Object Rut_Pasajero) {
        this.Rut_Pasajero = Rut_Pasajero;
    }

}
