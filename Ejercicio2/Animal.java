package Ejercicio2;

interface Volador {
    void volar();
}

 interface Nadador {
    void nadar();
}

public class Animal implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("El Animal está despegando y volando bajo.");
    }

    @Override
    public void nadar() {
        System.out.println("El Animal está nadando en el lago.");
    }
}
class pruebaAnimal {
    public static void main(String[] args) {
        Animal A1 = new Animal();
        A1.volar();
        A1.nadar();
    }
}