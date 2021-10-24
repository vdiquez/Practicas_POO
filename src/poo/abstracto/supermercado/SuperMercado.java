package src.poo.abstracto.supermercado;

import src.poo.abstracto.supermercado.inventario.Producto;
import src.poo.abstracto.supermercado.inventario.categoria.Alimento;
import src.poo.abstracto.supermercado.inventario.categoria.Herramienta;
import src.poo.abstracto.supermercado.inventario.categoria.Juguete;
import src.poo.abstracto.supermercado.inventario.categoria.Ropa;

import java.util.ArrayList;
import java.util.List;

public class SuperMercado {
    public static void main(String[] args) {
        Producto papas = new Alimento("Papas", 100.0);
        Producto cilantro = new Alimento("Cilantro", 80.0);
        Producto fresas = new Alimento("Fresas", 210.0);

        Producto tableroAjedrez = new Juguete("Tablero de Ajedrez", 45.0);
        Producto cuboRubik = new Juguete("Cubo Rubik", 75.0);
        int cantidadJuguetes = 2;
        Producto camiseta = new Ropa("Camiseta", 34.0, "niño");

        Producto taladro = new Herramienta("Taladro", 132.0, true);

        List<Producto> productos = new ArrayList<>();
        productos.add(papas);
        productos.add(cilantro);
        productos.add(fresas);
        productos.add(tableroAjedrez);
        productos.add(cuboRubik);
        productos.add(camiseta);
        productos.add(taladro);

        System.out.println("El total de productos es: " + productos.size());

        System.out.println("*************Precio de Lista**************");

        Double totalConDescuento = 0.0;
        Double totalSinDescuento = 0.0;
        for (Producto producto: productos) {
            System.out.println(producto.toString());
            totalSinDescuento += producto.getPrecioLista();
            if (producto instanceof Juguete && (cantidadJuguetes > 3 || producto.getPrecioLista() > 3000.0)) {
                ((Juguete) producto).setAplicaDescuento(true);
            }
            totalConDescuento += producto.obtenerPrecioConDescuento();

        }

        System.out.println("*************Precio A Pagar**************");
        System.out.println("Total a pagar con descuento: " + totalConDescuento);
        System.out.println("Total a pagar sin descuento: " + totalSinDescuento);


    }
}
