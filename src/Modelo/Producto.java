
package Modelo;


public class Producto {
 
    private int  idProducto;
    private String Nombre;
    private String Categoria;
    private int Precio_Venta;
    private int Inventario_idProducto;

    public Producto() {
    }

    public Producto(int idProducto, int Inventario_idProducto) {
        this.idProducto = idProducto;
        this.Inventario_idProducto = Inventario_idProducto;
    }

    public Producto(int idProducto, String Nombre, String Categoria, int Precio_Venta, int Inventario_idProducto) {
        this.idProducto = idProducto;
        this.Nombre = Nombre;
        this.Categoria = Categoria;
        this.Precio_Venta = Precio_Venta;
        this.Inventario_idProducto = Inventario_idProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public int getPrecio_Venta() {
        return Precio_Venta;
    }

    public void setPrecio_Venta(int Precio_Venta) {
        this.Precio_Venta = Precio_Venta;
    }

    public int getInventario_idProducto() {
        return Inventario_idProducto;
    }

    public void setInventario_idProducto(int Inventario_idProducto) {
        this.Inventario_idProducto = Inventario_idProducto;
    }
    
    
    
}
