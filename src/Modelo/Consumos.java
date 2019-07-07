package Modelo;

public class Consumos {

    private int idConsumos;
    private int Cantidad_Producto;
    private int Stock_idStock;
    private int  Reserva_idReservaHabitacion;
    private Object IdReservaHabitacion;
    public Consumos() {
    }

    public Consumos(Object IdReservaHabitacion) {
        this.IdReservaHabitacion = IdReservaHabitacion;
    }

    public Consumos(int Reserva_idReservaHabitacion) {
        this.Reserva_idReservaHabitacion = Reserva_idReservaHabitacion;
    }

    public int getReserva_idReservaHabitacion() {
        return Reserva_idReservaHabitacion;
    }

    public void setReserva_idReservaHabitacion(int Reserva_idReservaHabitacion) {
        this.Reserva_idReservaHabitacion = Reserva_idReservaHabitacion;
    }

    public Object getIdReservaHabitacion() {
        return IdReservaHabitacion;
    }

    public void setIdReservaHabitacion(Object IdReservaHabitacion) {
        this.IdReservaHabitacion = IdReservaHabitacion;
    }

   

    

    public Consumos(int Cantidad_Producto, int Stock_idStock, int Reserva_idReservaHabitacion) {
        this.Cantidad_Producto = Cantidad_Producto;
        this.Stock_idStock = Stock_idStock;
        this.Reserva_idReservaHabitacion = Reserva_idReservaHabitacion;
    }

   

 

    public int getCantidad_Producto() {
        return Cantidad_Producto;
    }

    public void setCantidad_Producto(int Cantidad_Producto) {
        this.Cantidad_Producto = Cantidad_Producto;
    }

    public int getStock_idStock() {
        return Stock_idStock;
    }

    public void setStock_idStock(int Stock_idStock) {
        this.Stock_idStock = Stock_idStock;
    }

 
    }

    


