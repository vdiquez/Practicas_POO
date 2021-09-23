package src.poo.metodos;

import java.util.Scanner;

public class Central {
    public static void main(String[] args) {
        Saludador persona = new Saludador();
        Scanner scan = new Scanner(System.in);
        System.out.println("Que quieres que haga?");
        System.out.println("1. Saludar");
        System.out.println("2. Despedirse");
        int tipoSaludo = scan.nextInt();
        System.out.println("Por favor introduce tu nombre");
        String nombre = scan.next();
        String saludo = persona.saludar(nombre, tipoSaludo);
        System.out.println(saludo);
    }
}
