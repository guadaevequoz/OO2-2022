package ej4;

public class ItemCarrito {
	private Producto producto;
    private int cantidad;
        
    public Producto getProducto() {
        return this.producto;
    }
    
    public int getCantidad() {
        return this.cantidad;
    }
    
    public double totalItem() {
    	return this.producto.getPrecio() * this.getCantidad();
    }

}
