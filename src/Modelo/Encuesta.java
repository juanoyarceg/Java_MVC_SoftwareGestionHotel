
package Modelo;


public class Encuesta {
  
private int idEncuesta;
private int Atencion_del_personal;
private int Higiene_del_Recinto;
private int Precios_Producto_Servicio;
private int Modalidad_horarios;
private int Estado_Mobiliario;
private int Diseño_Habitaciones;
private int Calidad_Productos;
private int Privacidad;
private int Accesibilidad;
private int Experiencia_General;
private String Recomendaria_Hotel;
private int Reserva_idReserva;
private int Reserva_Habitacion_idHabitacion;
private int Reserva_Cliente_idPersona;
private int Reserva_Trabajador_idPersona;

    public Encuesta() {
    }

    public Encuesta(int idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public Encuesta(int idEncuesta, int Atencion_del_personal, int Higiene_del_Recinto, int Precios_Producto_Servicio, int Modalidad_horarios, int Estado_Mobiliario, int Diseño_Habitaciones, int Calidad_Productos, int Privacidad, int Accesibilidad, int Experiencia_General, String Recomendaria_Hotel, int Reserva_idReserva, int Reserva_Habitacion_idHabitacion, int Reserva_Cliente_idPersona, int Reserva_Trabajador_idPersona) {
        this.idEncuesta = idEncuesta;
        this.Atencion_del_personal = Atencion_del_personal;
        this.Higiene_del_Recinto = Higiene_del_Recinto;
        this.Precios_Producto_Servicio = Precios_Producto_Servicio;
        this.Modalidad_horarios = Modalidad_horarios;
        this.Estado_Mobiliario = Estado_Mobiliario;
        this.Diseño_Habitaciones = Diseño_Habitaciones;
        this.Calidad_Productos = Calidad_Productos;
        this.Privacidad = Privacidad;
        this.Accesibilidad = Accesibilidad;
        this.Experiencia_General = Experiencia_General;
        this.Recomendaria_Hotel = Recomendaria_Hotel;
        this.Reserva_idReserva = Reserva_idReserva;
        this.Reserva_Habitacion_idHabitacion = Reserva_Habitacion_idHabitacion;
        this.Reserva_Cliente_idPersona = Reserva_Cliente_idPersona;
        this.Reserva_Trabajador_idPersona = Reserva_Trabajador_idPersona;
    }

    public int getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(int idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public int getAtencion_del_personal() {
        return Atencion_del_personal;
    }

    public void setAtencion_del_personal(int Atencion_del_personal) {
        this.Atencion_del_personal = Atencion_del_personal;
    }

    public int getHigiene_del_Recinto() {
        return Higiene_del_Recinto;
    }

    public void setHigiene_del_Recinto(int Higiene_del_Recinto) {
        this.Higiene_del_Recinto = Higiene_del_Recinto;
    }

    public int getPrecios_Producto_Servicio() {
        return Precios_Producto_Servicio;
    }

    public void setPrecios_Producto_Servicio(int Precios_Producto_Servicio) {
        this.Precios_Producto_Servicio = Precios_Producto_Servicio;
    }

    public int getModalidad_horarios() {
        return Modalidad_horarios;
    }

    public void setModalidad_horarios(int Modalidad_horarios) {
        this.Modalidad_horarios = Modalidad_horarios;
    }

    public int getEstado_Mobiliario() {
        return Estado_Mobiliario;
    }

    public void setEstado_Mobiliario(int Estado_Mobiliario) {
        this.Estado_Mobiliario = Estado_Mobiliario;
    }

    public int getDiseño_Habitaciones() {
        return Diseño_Habitaciones;
    }

    public void setDiseño_Habitaciones(int Diseño_Habitaciones) {
        this.Diseño_Habitaciones = Diseño_Habitaciones;
    }

    public int getCalidad_Productos() {
        return Calidad_Productos;
    }

    public void setCalidad_Productos(int Calidad_Productos) {
        this.Calidad_Productos = Calidad_Productos;
    }

    public int getPrivacidad() {
        return Privacidad;
    }

    public void setPrivacidad(int Privacidad) {
        this.Privacidad = Privacidad;
    }

    public int getAccesibilidad() {
        return Accesibilidad;
    }

    public void setAccesibilidad(int Accesibilidad) {
        this.Accesibilidad = Accesibilidad;
    }

    public int getExperiencia_General() {
        return Experiencia_General;
    }

    public void setExperiencia_General(int Experiencia_General) {
        this.Experiencia_General = Experiencia_General;
    }

    public String getRecomendaria_Hotel() {
        return Recomendaria_Hotel;
    }

    public void setRecomendaria_Hotel(String Recomendaria_Hotel) {
        this.Recomendaria_Hotel = Recomendaria_Hotel;
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
