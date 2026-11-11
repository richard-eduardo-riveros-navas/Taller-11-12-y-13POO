package Ejercicio1;

// Interfaz 1
public interface Hablador {
    void hablar();
}

// Interfaz 2
 interface Trabajador {
    void trabajar();
}

// Clase Ejercicio1.Persona implementando múltiples interfaces (Herencia Múltiple)
 class Persona implements Hablador, Trabajador {
    @Override
    public void hablar() {
        System.out.println("La persona está hablando en la reunión.");
    }

    @Override
    public void trabajar() {
        System.out.println("La persona está escribiendo código en Java.");
    }
}

// Clase de prueba
 class MainPersona {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.hablar();
        p.trabajar();
    }
}
