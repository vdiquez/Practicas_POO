package src.poo.abstracto.supermercado.inventario.categoria;

import src.poo.abstracto.supermercado.inventario.Producto;

import static src.poo.abstracto.supermercado.estrategia.Descuento.DESCUENTO_ROPA;

public class Ropa extends Producto {

    private String target;

    public Ropa(String nombreProducto, Double precioLista, String target) {
        super(nombreProducto, precioLista);
        this.target = target;
    }

    @Override
    public Double obtenerPrecioConDescuento() {
        if (target.equalsIgnoreCase("niño")
                || (target.equalsIgnoreCase("mujer"))) {
            this.setPrecioLista(this.getPrecioLista() / DESCUENTO_ROPA);
        }
        return this.getPrecioLista();
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
