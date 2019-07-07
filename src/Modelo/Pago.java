
package Modelo;

import java.util.Date;

public class Pago {
 private int idPago;
 private String Medio_de_Pago;
 private int Total_Pago;
 private Date Fecha_Pago;
 private int Reserva_idReserva;
 private int Reserva_Habitacion_idHabitacion;
 private int Reserva_Cliente_idPersona;
 private int Reserva_Trabajador_idPersona;

    public Pago() {
    }

    public Pago(int idPago, int Reserva_idReserva, int Reserva_Habitacion_idHabitacion, int Reserva_Cliente_idPersona, int Reserva_Trabajador_idPersona) {
        this.idPago = idPago;
        this.Reserva_idReserva = Reserva_idReserva;
        this.Reserva_Habitacion_idHabitacion = Reserva_Habitacion_idHabitacion;
        this.Reserva_Cliente_idPersona = Reserva_Cliente_idPersona;
        this.Reserva_Trabajador_idPersona = Reserva_Trabajador_idPersona;
    }

    public Pago(int idPago, String Medio_de_Pago, int Total_Pago, Date Fecha_Pago, int Reserva_idReserva, int Reserva_Habitacion_idHabitacion, int Reserva_Cliente_idPersona, int Reserva_Trabajador_idPersona) {
        this.idPago = idPago;
        this.Medio_de_Pago = Medio_de_Pago;
        this.Total_Pago = Total_Pago;
        this.Fecha_Pago = Fecha_Pago;
        this.Reserva_idReserva = Reserva_idReserva;
        this.Reserva_Habitacion_idHabitacion = Reserva_Habitacion_idHabitacion;
        this.Reserva_Cliente_idPersona = Reserva_Cliente_idPersona;
        this.Reserva_Trabajador_idPersona = Reserva_Trabajador_idPersona;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getMedio_de_Pago() {
        return Medio_de_Pago;
    }

    public void setMedio_de_Pago(String Medio_de_Pago) {
        this.Medio_de_Pago = Medio_de_Pago;
    }

    public int getTotal_Pago() {
        return Total_Pago;
    }

    public void setTotal_Pago(int Total_Pago) {
        this.Total_Pago = Total_Pago;
    }

    public Date getFecha_Pago() {
        return Fecha_Pago;
    }

    public void setFecha_Pago(Date Fecha_Pago) {
        this.Fecha_Pago = Fecha_Pago;
    }

    public int getReserva_idReserva() {
        return Reserva_idReserva;
    }

    public void setReserva_idReserva(int Reserva_idReserva) {
        this.Reserva_idReserva = Reserva_idReserva;
    }

    public int getReserva_Habitacion_idHabitacion() {
        return Reserva_Habitacion_idHabitacion;
    }

    public void setReserva_Habitacion_idHabitacion(int Reserva_Habitacion_idHabitacion) {
        this.Reserva_Habitacion_idHabitacion = Reserva_Habitacion_idHabitacion;
    }

    public int getReserva_Cliente_idPersona() {
        return Reserva_Cliente_idPersona;
    }

    public void setReserva_Cliente_idPersona(int Reserva_Cliente_idPersona) {
        this.Reserva_Cliente_idPersona = Reserva_Cliente_idPersona;
    }

    public int getReserva_Trabajador_idPersona() {
        return Reserva_Trabajador_idPersona;
    }

    public void setReserva_Trabajador_idPersona(int Reserva_Trabajador_idPersona) {
        this.Reserva_Trabajador_idPersona = Reserva_Trabajador_idPersona;
    }
 
 
}
