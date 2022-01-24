package src.poo.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejadorExcepciones {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        calcularLaPotencia();
    }

    private static int calcularLaPotencia() {
        int contador = 0;
        int area = 0;
        while (contador < 3) {
            try {
                System.out.print("Ingrese un valor entero:");
                int base = keyboard.nextInt();
                area = base * base;
                System.out.println("El cuadrado de " + base + " es " + area);
                contador = 3;
            } catch (InputMismatchException iME) {
                System.out.printf("Debe ingresar obligatoriamente un número entero." +
                        " Tiene %d intentos disponibles \n", 2 - contador);
                keyboard.nextLine();
                contador++;
            } finally {
                System.out.println("Estoy pasando por finally");
            }
        }
        return area;
    }
}
