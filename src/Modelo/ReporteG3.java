
package Modelo;


public class ReporteG3 {
  
    String Nombre;   
    //long count;
    //long Cantidad;
    Object Cantidad;
    
    public ReporteG3() {
    }

    public ReporteG3(String Nombre, Object Cantidad) {
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