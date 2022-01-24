package src.poo.excepciones;

public class OperacionesMatematicas {
    public static void main(String[] args) {
        dividir();
        Integer result = null;
        try {
            result = sum(null, null);
        } catch (Exception e) {
            System.err.println("null , null: " + e.getMessage());
        }
        try {
            result = sum(null, 5);
        } catch (Exception e) {
            System.err.println("null, 5: " + e.getMessage());
        }
        try {
            result = sum(16, null);
        } catch (Exception e) {
            System.err.println("16, null: " + e.getMessage());
        }
        try {
            result = sum(7, 33);
        } catch (Exception e) {
            System.err.println("7, 33: " + e.getMessage());
        }
        System.out.println("El resultado es: " + result);
    }

    private static void dividir() {
        try {
            int zero = 0;
            int result = 10 / zero;
            System.out.println(result);
        } catch (ArithmeticException aE) {
            System.err.println("No se puede dividir por cero. Mensaje: " + aE.getMessage());
        }
    }

    private static Integer sum(Integer a, Integer b) throws Exception {
        if (a == null) {
            throw new Exception("El valor A es requerido");
        }
        if (b == null) {
            throw new Exception("El valor B es requerido");
        }
        System.out.println("PROCESANDO EL RESULTADO");
        return a + b;

    }

}
