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
    // ❌ ERROR DE COMPILACIÓN:
    // Modifier 'default' not allowed here
    /*
    default void procesar() {
        System.out.println("Procesando...");
    }
    */

    // Forma CORRECTA en una clase abstracta:
    public void procesar() {
        System.out.println("Procesando correctamente en clase abstracta...");
    }
}