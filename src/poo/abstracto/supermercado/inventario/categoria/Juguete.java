package src.poo.abstracto.supermercado.inventario.categoria;

import src.poo.abstracto.supermercado.inventario.Producto;

import static src.poo.abstracto.supermercado.estrategia.Descuento.DESCUENTO_JUGUETE;

public class Juguete extends Producto {
    private boolean aplicaDescuento;
    public Juguete(String nombreProducto, Double precioLista) {
        super(nombreProducto, precioLista);
    }

    @Override
    public Double obtenerPrecioConDescuento() {
        if (aplicaDescuento) {
            this.setPrecioLista(this.getPrecioLista() / DESCUENTO_JUGUETE);
        }
        return this.getPrecioLista();
    }

    public boolean isAplicaDescuento() {
        return aplicaDescuento;
    }

    public void setAplicaDescuento(boolean aplicaDescuento) {
        this.aplicaDescuento = aplicaDescuento;
    }
}
