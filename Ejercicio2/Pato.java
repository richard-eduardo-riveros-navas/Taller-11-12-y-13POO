package Ejercicio2;

interface Volador {
    void volar();
}
interface Nadador {
    void nadar();
}
public class Pato implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("El pato alza el vuelo sobre el lago.");
    }

    @Override
    public void nadar() {
        System.out.println("El pato se desplaza sobre el agua.");
    }
}
class PruebaPato {
    public static void main(String[] args) {
        Pato pato = new Pato();
        pato.volar();
        pato.nadar();
    }
}