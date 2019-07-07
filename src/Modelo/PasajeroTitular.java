package Modelo;

public class PasajeroTitular {

    private int idPasajeroTItular;
    private int Cuenta_idCuenta;
    private int Encuesta_idEncuesta;
    private int Reserva_idReservaHabitacion;
    private int Reserva_Habitaciones_idHabitaciones;
    private int Persona_Rut;

    public PasajeroTitular(int idPasajeroTItular, int Cuenta_idCuenta, int Encuesta_idEncuesta, int Reserva_idReservaHabitacion, int Reserva_Habitaciones_idHabitaciones, int Persona_Rut) {
        this.idPasajeroTItular = idPasajeroTItular;
        this.Cuenta_idCuenta = Cuenta_idCuenta;
        this.Encuesta_idEncuesta = Encuesta_idEncuesta;
        this.Reserva_idReservaHabitacion = Reserva_idReservaHabitacion;
        this.Reserva_Habitaciones_idHabitaciones = Reserva_Habitaciones_idHabitaciones;
        this.Persona_Rut = Persona_Rut;
    }

    public PasajeroTitular() {
    }

    public PasajeroTitular(int Cuenta_idCuenta, int Encuesta_idEncuesta, int Reserva_idReservaHabitacion, int Reserva_Habitaciones_idHabitaciones, int Persona_Rut) {
        this.Cuenta_idCuenta = Cuenta_idCuenta;
        this.Encuesta_idEncuesta = Encuesta_idEncuesta;
        this.Reserva_idReservaHabitacion = Reserva_idReservaHabitacion;
        this.Reserva_Habitaciones_idHabitaciones = Reserva_Habitaciones_idHabitaciones;
        this.Persona_Rut = Persona_Rut;
    }

    public int getIdPasajeroTItular() {
        return idPasajeroTItular;
    }

    public void setIdPasajeroTItular(int idPasajeroTItular) {
        this.idPasajeroTItular = idPasajeroTItular;
    }

    public int getCuenta_idCuenta() {
        return Cuenta_idCuenta;
    }

    public void setCuenta_idCuenta(int Cuenta_idCuenta) {
        this.Cuenta_idCuenta = Cuenta_idCuenta;
    }

    public int getEncuesta_idEncuesta() {
        return Encuesta_idEncuesta;
    }

    public void setEncuesta_idEncuesta(int Encuesta_idEncuesta) {
        this.Encuesta_idEncuesta = Encuesta_idEncuesta;
    }

    public int getReserva_idReservaHabitacion() {
        return Reserva_idReservaHabitacion;
    }

    public void setReserva_idReservaHabitacion(int Reserva_idReservaHabitacion) {
        this.Reserva_idReservaHabitacion = Reserva_idReservaHabitacion;
    }

    public int getReserva_Habitaciones_idHabitaciones() {
        return Reserva_Habitaciones_idHabitaciones;
    }

    public void setReserva_Habitaciones_idHabitaciones(int Reserva_Habitaciones_idHabitaciones) {
        this.Reserva_Habitaciones_idHabitaciones = Reserva_Habitaciones_idHabitaciones;
    }

    public int getPersona_Rut() {
        return Persona_Rut;
    }

    public void setPersona_Rut(int Persona_Rut) {
        this.Persona_Rut = Persona_Rut;
    }

}
