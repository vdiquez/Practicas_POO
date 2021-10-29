package src.poo.colecciones;

import java.util.Objects;

public class Employee {
    private String nombre;
    private String dni;
    private byte edad;

    public Employee() {}

    public Employee(String nombre, String dni, byte edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return edad == employee.edad && Objects.equals(nombre, employee.nombre) && Objects.equals(dni, employee.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, dni, edad);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                "}";
    }
}
