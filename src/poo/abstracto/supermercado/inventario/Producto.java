package src.poo.abstracto.supermercado.inventario;

public abstract class Producto {
    private Double precioLista;
    private String nombreProducto;

    public Producto(String nombreProducto, Double precioLista) {
        this.nombreProducto = nombreProducto;
        this.precioLista = precioLista;
    }

    public abstract Double obtenerPrecio();

    @Override
    public String toString() {
        return "Nombre de Producto: " + nombreProducto +
                " - Precio de Lista: " + precioLista;
    }

    public Double getPrecioLista() {
        return precioLista;
    }

    public void setPrecioLista(Double precioLista) {
        this.precioLista = precioLista;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
}
