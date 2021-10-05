package src.poo.herencia.transporte.aereo;

import src.poo.herencia.transporte.Transporte;

public class Avion extends Transporte {
    private String motorType;
    private String model;

    public Avion() {

    }

    public Avion (String motorType, String model) {
        this.motorType = motorType;
        this.model = model;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
