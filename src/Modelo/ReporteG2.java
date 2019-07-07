
package Modelo;


public class ReporteG2 {
  
    String NombreHabitacion;   
    long count;

    public ReporteG2() {
    }
    
    public ReporteG2(String NombreHabitacion, long count) {
        this.NombreHabitacion = NombreHabitacion;
        this.count = count;
    }

    public String getNombreHabitacion() {
        return NombreHabitacion;
    }

    public void setNombreHabitacion(String NombreHabitacion) {
        this.NombreHabitacion = NombreHabitacion;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    }