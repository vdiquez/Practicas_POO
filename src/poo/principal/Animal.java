package src.poo.principal;

import java.util.Objects;

public class Animal {
    public String breed;
    public String color;
    public String name;
    public boolean move(int distanceX, int distanciaY) {
        return true;
    }
    public String sleep() {
        return "Estoy durmiendo";
    }
    public String eat() {
        return "Estoy comiendo";
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(breed, animal.breed) && Objects.equals(color, animal.color) && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, color, name);
    }
}
