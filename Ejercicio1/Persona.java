package Ejercicio1;

 interface Hablador {
    void hablar();
}

 interface Trabajador {
    void trabajar();
}

 public class Persona implements Hablador, Trabajador {
    @Override
    public void hablar() {
        System.out.println("La persona está hablando en la reunión.");
    }

    @Override
    public void trabajar() {
        System.out.println("La persona está escribiendo código en Java.");
    }
}

 class pruebaPersona {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.hablar();
        p.trabajar();
    }
}
