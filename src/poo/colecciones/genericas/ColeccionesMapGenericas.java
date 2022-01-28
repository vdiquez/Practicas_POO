package src.poo.colecciones.genericas;

import java.util.*;

import static src.poo.colecciones.genericas.ColeccionesGenericas.imprimir;

public class ColeccionesMapGenericas {
    public static void main(String[] args) {
        Map<Integer, String> miMapa = new HashMap<>();
        Set<String> setear = new TreeSet<>();
        List<String> lista = new ArrayList<>();

        miMapa.put(1, "Buenos Aires");
        miMapa.put(2, "Bogota");
        miMapa.put(3, "Caracas");

        System.out.println("La capital de Colombia es: " + miMapa.get(2));

        setear.add("Tucuman");
        setear.add("Cordoba");
        setear.add("Mendoza");
        int contador = 0;
        for (Iterator it = setear.iterator(); it.hasNext(); contador ++) {
            String provincia = (String) it.next();
            if (contador == 1) {
                System.out.println("Provincia Iterator: " + provincia);
            }
        }
        contador = 0;
        Iterator it = setear.iterator();
        while(it.hasNext()) {
            contador++;
            String provincia = (String) it.next();
            if (contador == 1) {
                System.out.println("Provincia While: " + provincia);
            }
        }

        for(String provincia: setear){
            System.out.println("Provincia: " + provincia);
        }

        lista.add("Repasar POO");
        lista.add("Escribir código a pesar de que crea que no puedo");
        lista.add("Escribir más código");

        System.out.println("La tarea que debo hacer prioritariamente es: "
                + lista.get(0));
        System.out.println("La tarea que debo hacer prioritariamente es: "
                + lista.get(1));
        System.out.println("La tarea que debo hacer prioritariamente es: "
                + lista.get(2));

        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
        imprimir(setear);
        imprimir(lista);

    }

    public static void imprimir(Collection arregloDeObjetos) {
        for(Object elemento : arregloDeObjetos){
            System.out.println("elemento = " + elemento);
        }
    }
}
