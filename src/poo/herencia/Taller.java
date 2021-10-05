package src.poo.herencia;

import src.poo.herencia.transporte.terrestre.Auto;

public class Taller {
    public static void main(String[] args) {
        Auto auto = new Auto(5, "JLT965", "Chevrolet");

        System.out.println(auto);
    }
}
