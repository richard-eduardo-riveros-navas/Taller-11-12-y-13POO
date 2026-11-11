package Ejercicio3;

// Contrato mediante Interfaz
public interface Accionable {
    void ejecutarAccion();
}

// Base común mediante Clase Abstracta
 abstract class Dispositivo implements Accionable {
    protected String marca;

    public Dispositivo(String marca) {
        this.marca = marca;
    }

    public void apagar() {
        System.out.println("El dispositivo " + marca + " se está apagando.");
    }

    // Método abstracto propio de la jerarquía
    public abstract void encender();
}

// Clase Concreta Smartphone que extiende la clase abstracta e implementa la interfaz
 class Smartphone extends Dispositivo {
    public Smartphone(String marca) {
        super(marca);
    }

    @Override
    public void encender() {
        System.out.println("Smartphone " + marca + " encendido mediante huella dactilar.");
    }

    @Override
    public void ejecutarAccion() {
        System.out.println("Abriendo aplicación móvil...");
    }
}
