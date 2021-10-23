package src.poo.abstracto.supermercado.inventario.categoria;

import src.poo.abstracto.supermercado.inventario.Producto;

public class Alimento extends Producto {
    public Alimento(String nombreProducto, Double precioLista) {
        super(nombreProducto, precioLista);
    }

    @Override
    public Double obtenerPrecio() {
        return null;
    }
}
