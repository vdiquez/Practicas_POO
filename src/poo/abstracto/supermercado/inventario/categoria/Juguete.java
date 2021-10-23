package src.poo.abstracto.supermercado.inventario.categoria;

import src.poo.abstracto.supermercado.inventario.Producto;

public class Juguete extends Producto {
    public Juguete(String nombreProducto, Double precioLista) {
        super(nombreProducto, precioLista);
    }

    @Override
    public Double obtenerPrecio() {
        return null;
    }
}
