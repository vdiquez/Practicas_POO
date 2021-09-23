package src.poo.estaticos;

public class PrincipalEstatica {

    public static String mensaje = "Saludos";
    public String saludo  = "Hola";



    public static void main(String[] args) {
        PracticaEstatica.estado = "Encendido";
        PracticaEstatica ps = new PracticaEstatica();
        System.out.println(PracticaEstatica.CONSTANTE);
        PracticaEstatica ps2 = new PracticaEstatica(5, "Saludos");

        PracticaEstatica.setEstado("Apagado");


        System.out.println(ps);
        System.out.println(ps2);
        System.out.println(PracticaEstatica.estado);

        double floorOfPi = Math.floor(Math.PI);
        System.out.println(floorOfPi);
    }
}
