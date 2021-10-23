package src.poo.abstracto.supermercado.inventario.categoria;

import src.poo.abstracto.supermercado.inventario.Producto;

public class Herramienta extends Producto {

    private boolean metodoPagoTC;

    public Herramienta(String nombreProducto, Double precioLista, boolean metodoPagoTC) {
        super(nombreProducto, precioLista);
        this.metodoPagoTC = metodoPagoTC;
    }

    @Override
    public Double obtenerPrecio() {
        return null;
    }

    public boolean isMetodoPagoTC() {
        return metodoPagoTC;
    }

    public void setMetodoPagoTC(boolean metodoPagoTC) {
        this.metodoPagoTC = metodoPagoTC;
    }
}
