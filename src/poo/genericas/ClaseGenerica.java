package src.poo.genericas;

public class ClaseGenerica<T> {
    
    private T objeto;
    
    public ClaseGenerica(T objecto){
        this.objeto = objecto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
    }
}
