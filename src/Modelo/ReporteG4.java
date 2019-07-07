
package Modelo;


public class ReporteG4 {
  
    String Nombre;   
    //long count;
    //long Cantidad;
    Object Cantidad;
    
    public ReporteG4() {
    }

    public ReporteG4(String Nombre, Object Cantidad) {
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Object getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Object Cantidad) {
        this.Cantidad = Cantidad;
    }

    
    
    }

    
    
  