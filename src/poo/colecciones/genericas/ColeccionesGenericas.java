package src.poo.colecciones.genericas;

import java.util.*;

public class ColeccionesGenericas {

    public static void main(String[] args) {
        List miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        String elemento = (String) miLista.get(0);
//        System.out.println("elemento = " + elemento);
        
        imprimir(miLista);

        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");
//        imprimir(miSet);

        Map miMapa = new HashMap();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");
        
//        String elemento = (String) miMapa.get("valor1");
        //System.out.println("elemento = " + elemento);
        
//        imprimir(miMapa.keySet());
//        imprimir(miMapa.values());
    }
    
    public static void imprimir(Collection coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });

//        for(Object elemento: coleccion){
//            System.out.println("elemento = " + elemento);
//        }
    }

}
