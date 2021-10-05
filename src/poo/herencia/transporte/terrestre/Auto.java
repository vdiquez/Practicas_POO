package src.poo.herencia.transporte.terrestre;

import src.poo.herencia.transporte.Transporte;

public class Auto extends Transporte {
    private String patent;
    private String brand;

    public Auto() {
    }

    public Auto(Integer seats, String patent, String brand) {
        super(seats);
        this.patent = patent;
        this.brand = brand;
    }

    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

