package src.poo.estaticos;

public class PracticaEstatica {
    public static final String CONSTANTE = "constante";
    public static String estado;
    public int numero;
    public String cadena;

    public PracticaEstatica() {
        System.out.println("PracticaEstatica START");
    }
    public PracticaEstatica(int numero, String cadena) {
        this.numero = numero;
        this.cadena = cadena;
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
}
