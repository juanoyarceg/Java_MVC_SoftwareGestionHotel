
package Modelo;


public class Stock {
  private int idStock;
  private String NombreProducto;
  private int StockProducto;
  private int PrecioUnitario;
  
    public Stock() {
    }

    public Stock(int idStock, String NombreProducto, int StockProducto, int PrecioUnitario) {
        this.idStock = idStock;
        this.NombreProducto = NombreProducto;
        this.StockProducto = StockProducto;
        this.PrecioUnitario = PrecioUnitario;
    }

    public int getIdStock() {
        return idStock;
    }

    public void setIdStock(int idStock) {
        this.idStock = idStock;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public int getStockProducto() {
        return StockProducto;
    }

    public void setStockProducto(int StockProducto) {
        this.StockProducto = StockProducto;
    }

    public int getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(int PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }
    
    
    
}

    