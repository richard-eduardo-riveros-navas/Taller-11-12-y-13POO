package Ejercicio2;

public interface Volador {
    void volar();
}

 interface Nadador {
    void nadar();
}

 class Pato implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("El pato está despegando y volando bajo.");
    }

    @Override
    public void nadar() {
        System.out.println("El pato está nadando en el lago.");
    }
}
