package src.poo.estaticos;

import java.io.File;
import java.util.Objects;

public class PracticaEstatica {
    public static final String CONSTANTE = "constante";
    public static String estado;
    public int numero;
    public String cadena;
    public File archivo;

    public PracticaEstatica() {
        System.out.println("PracticaEstatica START");
    }
    public PracticaEstatica(int numero, String cadena) {
        this.numero = numero;
        this.cadena = cadena;
        setCadena("");
    }

    public static String getEstado() {
        return estado;
    }

    public static void setEstado(String estado) {
        PracticaEstatica.estado = estado;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PracticaEstatica that = (PracticaEstatica) o;
        return numero == that.numero && Objects.equals(cadena, that.cadena) && Objects.equals(archivo, that.archivo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, cadena, archivo);
    }
}
