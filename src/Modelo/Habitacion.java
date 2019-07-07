
package Modelo;


public class Habitacion {
  
  private String NombreHab;
  private int Precio_Momento;
  private int Precio_Jornada;
  private String Disponibilidad;

    public Habitacion() {
    }

    public Habitacion(String NombreHab, int Precio_Momento, int Precio_Jornada, String Disponibilidad) {
        this.NombreHab = NombreHab;
        this.Precio_Momento = Precio_Momento;
        this.Precio_Jornada = Precio_Jornada;
        this.Disponibilidad = Disponibilidad;
    }

    public String getNombreHab() {
        return NombreHab;
    }

    public void setNombreHab(String NombreHab) {
        this.NombreHab = NombreHab;
    }

    public int getPrecio_Momento() {
        return Precio_Momento;
    }

    public void setPrecio_Momento(int Precio_Momento) {
        this.Precio_Momento = Precio_Momento;
    }

    public int getPrecio_Jornada() {
        return Precio_Jornada;
    }

    public void setPrecio_Jornada(int Precio_Jornada) {
        this.Precio_Jornada = Precio_Jornada;
    }

    public String getDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(String Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }

    
}
