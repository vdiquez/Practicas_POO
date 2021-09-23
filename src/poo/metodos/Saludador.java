package src.poo.metodos;

public class Saludador {
    public String saludar(String nombre, int tipoSaludo) {

        if (tipoSaludo == 1) {
            String saludar = "Hola " + nombre;
            return saludar;
        } else {
            String despedirse = "Chao " + nombre;
            return despedirse;
        }
    }
}
