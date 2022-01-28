package src.poo.genericas;

public class TestGenerics {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica<>(15);
        objetoInt.obtenerTipo();
        
        ClaseGenerica<String> objectoString = new ClaseGenerica<>("Juan");
        objectoString.obtenerTipo();
    }
}
