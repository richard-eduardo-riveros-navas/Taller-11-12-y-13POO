package Ejercicio3;

interface Resettable {
    void reset();
}

public class Dispositivo implements Resettable {
    private String nombre;
    @Override
    public void reset(){
        System.out.println("reset hecho");
    }
}
