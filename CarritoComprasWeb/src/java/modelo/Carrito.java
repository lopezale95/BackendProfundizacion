package modelo;


public class Carrito {
    int item;
    int idproducto;
    String nombre;
    String descripcion;
    double preciocompra;
    int cantidad;
    double subTotal;
    
    public Carrito(){
        
    }

    public Carrito(int item, int idproducto, String nombre, String descripcion, double preciocompra, int cantidad, double subTotal) {
        this.item = item;
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.preciocompra = preciocompra;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPreciocompra() {
        return preciocompra;
    }

    public void setPreciocompra(double preciocompra) {
        this.preciocompra = preciocompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    
}