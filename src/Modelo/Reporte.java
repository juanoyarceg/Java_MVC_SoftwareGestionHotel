 
package Modelo;

import java.sql.Date;

 
public class Reporte {
    
    
    int idPersona;     
    int Rut;   
    String Nombre;  
    String APaterno;  
    String AMaterno;  
    String Nacionalidad;
    String Sexo; 
    Date Fecha_Nacimiento; 
    String Tipo_Cliente;  
    int Reserva_idReserva;
    Date Fecha_Pago;
    int Total_Pago; 
    String  Nombre_Habitacion;
    int Rut_Pasajero;
        
    public Reporte() {
    }

    public Reporte(String Nombre_Habitacion) {
        this.Nombre_Habitacion = Nombre_Habitacion;
    }
    
    
    
    public Reporte(int Reserva_idReserva, Date Fecha_Pago, int Total_Pago, String Nombre_Habitacion, int Rut_Pasajero) {
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

    public int getRut_Pasajero() {
        return Rut_Pasajero;
    }

    public void setRut_Pasajero(int Rut_Pasajero) {
        this.Rut_Pasajero = Rut_Pasajero;
    }
    
    
    
    public Reporte(int idPersona, int Rut, String Nombre, String APaterno, String AMaterno, String Nacionalidad, String Sexo, Date Fecha_Nacimiento, String Tipo_Cliente) {
        this.idPersona = idPersona;
        this.Rut = Rut;
        this.Nombre = Nombre;
        this.APaterno = APaterno;
        this.AMaterno = AMaterno;
        this.Nacionalidad = Nacionalidad;
        this.Sexo = Sexo;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Tipo_Cliente = Tipo_Cliente;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public Reporte(int idPersona, String Nombre, String APaterno, String Tipo_Cliente) {
        this.idPersona = idPersona;
        this.Nombre = Nombre;
        this.APaterno = APaterno;
        this.Tipo_Cliente = Tipo_Cliente;
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

    public String getTipo_Cliente() {
        return Tipo_Cliente;
    }

    public void setTipo_Cliente(String Tipo_Cliente) {
        this.Tipo_Cliente = Tipo_Cliente;
    }
    



}

