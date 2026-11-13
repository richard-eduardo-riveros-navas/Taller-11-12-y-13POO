package Ejercicio3;

interface Dibujable {
    void dibujar();
}

public class Lienzo implements Dibujable {
    @Override
    public void dibujar(){
        System.out.println("Ejemplo");
    }
}
abstract class EstructuraBase {
    public void procesar() {
       System.out.println("Procesando..."); }
}