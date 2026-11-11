package Ejercicio3;

interface Conducible {
    void conducir();
}
public class Libro implements Conducible {
    private String titulo;

    @Override
    public void conducir() {
        System.out.println("Un libro no puede ser conducido.");
    }
}