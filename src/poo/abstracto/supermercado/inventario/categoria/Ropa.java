package src.poo.abstracto.supermercado.inventario.categoria;

import src.poo.abstracto.supermercado.inventario.Producto;

public class Ropa extends Producto {

    private String target;

    public Ropa(String nombreProducto, Double precioLista, String target) {
        super(nombreProducto, precioLista);
        this.target = target;
    }

    @Override
    public Double obtenerPrecio() {
        return null;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
