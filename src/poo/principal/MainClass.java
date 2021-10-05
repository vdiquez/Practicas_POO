package src.poo.principal;

import src.poo.util.Person;

import java.util.Date;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        Item seaItem = new Item();
        Item techItem = new Item("Televisor");
        Item techItem2 = new Item("Televisor", 1600.0, new Date(2040 - 1900, 3, 2));
        System.out.println("Introduzca el nombre del Item: ");
        seaItem.name = scanner.nextLine();
        System.out.println("Introduzca el precio del Item: ");
        seaItem.price = scanner.nextDouble();
        System.out.println("Introduzca el día de vencimiento del Item: ");
        int day = scanner.nextInt();
        System.out.println("Introduzca el mes de vencimiento del Item: ");
        int month = scanner.nextInt();
        System.out.println("Introduzca el año de vencimiento del Item: ");
        int year = scanner.nextInt();
        seaItem.expirationDate = new Date(year - 1900, month, day);
        seaItem.calculateTax();

        if (seaItem.canItBeSold()) {
            System.out.println("Nombre del Item : " + seaItem.name);
            System.out.println("Precio del Item: " + seaItem.price);
            System.out.println("Impuesto del Item: " + seaItem.tax);
            System.out.println("Total a pagar por el Item: " + seaItem.getTotalToPay());
        } else {
            System.out.println("Este Ítem no está habilitado para la venta");
        }

        techItem2.price = 1700.0;

        Person person2 = new Person();*/

        Animal perrito = new Animal();
        Animal perrito2 = new Animal();
        perrito.name = "firulais";
        perrito2.name = "firulais";
        System.out.println(perrito.hashCode());
        System.out.println(perrito2.hashCode());
        System.out.println(perrito.equals(perrito2));

    }
}
