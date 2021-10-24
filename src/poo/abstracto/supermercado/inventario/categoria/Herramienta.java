package src.poo.abstracto.supermercado.inventario.categoria;

import src.poo.abstracto.supermercado.inventario.Producto;

import static src.poo.abstracto.supermercado.estrategia.Descuento.DESCUENTO_HERRAMIENTA;

public class Herramienta extends Producto {

    private boolean metodoPagoTC;

    public Herramienta(String nombreProducto, Double precioLista, boolean metodoPagoTC) {
        super(nombreProducto, precioLista);
        this.metodoPagoTC = metodoPagoTC;
    }

    @Override
    public Double obtenerPrecioConDescuento() {
        if (isMetodoPagoTC()) {
           this.setPrecioLista(this.getPrecioLista() / DESCUENTO_HERRAMIENTA);
        }
        return this.getPrecioLista();
    }

    public boolean isMetodoPagoTC() {
        return metodoPagoTC;
    }

    public void setMetodoPagoTC(boolean metodoPagoTC) {
        this.metodoPagoTC = metodoPagoTC;
    }
}
