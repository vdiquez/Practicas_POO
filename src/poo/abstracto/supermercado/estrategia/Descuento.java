package src.poo.abstracto.supermercado.estrategia;

import src.poo.abstracto.supermercado.inventario.Producto;
import src.poo.abstracto.supermercado.inventario.categoria.Alimento;
import src.poo.abstracto.supermercado.inventario.categoria.Herramienta;
import src.poo.abstracto.supermercado.inventario.categoria.Juguete;
import src.poo.abstracto.supermercado.inventario.categoria.Ropa;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Descuento {
    public static final Double DESCUENTO_ALIMENTO = 1.10;
    public static final Double DESCUENTO_JUGUETE = 1.25;
    public static final Double DESCUENTO_ROPA = 1.15;
    public static final Double DESCUENTO_HERRAMIENTA = 1.05;
    private static final int MARTES = 3;
    private static final int JUEVES = 5;

    public static Double obtenerPrecioConDescuento(Producto producto) {
        Double precioConDescuento = producto.getPrecioLista();
        if (producto instanceof Alimento) {
            Calendar hoy = new GregorianCalendar();
            int dia = hoy.get(Calendar.DAY_OF_WEEK);
            if (dia == MARTES || dia == JUEVES) {
                precioConDescuento = producto.getPrecioLista() / DESCUENTO_ALIMENTO;
            }
        } else if (producto instanceof Ropa) {
            if (((Ropa) producto).getTarget().equalsIgnoreCase("niño")
                    || ((Ropa) producto).getTarget().equalsIgnoreCase("mujer")) {
                precioConDescuento = producto.getPrecioLista() / DESCUENTO_ROPA;
            }
        } else if (producto instanceof Herramienta) {
            if (((Herramienta)producto).isMetodoPagoTC()) {
                precioConDescuento = producto.getPrecioLista() / DESCUENTO_HERRAMIENTA;
            }

        } else if (producto instanceof Juguete) {

        }

        return precioConDescuento;
    }
}
