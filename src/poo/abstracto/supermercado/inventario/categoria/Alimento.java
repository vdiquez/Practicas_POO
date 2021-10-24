package src.poo.abstracto.supermercado.inventario.categoria;

import src.poo.abstracto.supermercado.inventario.Producto;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static src.poo.abstracto.supermercado.estrategia.Descuento.*;

public class Alimento extends Producto {
    public Alimento(String nombreProducto, Double precioLista) {
        super(nombreProducto, precioLista);
    }

    @Override
    public Double obtenerPrecioConDescuento() {
        Calendar hoy = new GregorianCalendar();
        int dia = hoy.get(Calendar.DAY_OF_WEEK);
        if (dia == MARTES || dia == JUEVES) {
            this.setPrecioLista(this.getPrecioLista() / DESCUENTO_ALIMENTO);
        }
        return this.getPrecioLista();
    }
}
