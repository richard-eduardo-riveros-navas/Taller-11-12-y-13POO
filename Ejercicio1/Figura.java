package Ejercicio1;

public abstract class Figura {

    public abstract double calcularArea();

    public void mostrarArea() {
        System.out.println("El área de la figura es: " + calcularArea());
    }
}

 class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

 class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
class Prueba {
    public static void main(String[] args) {
        Circulo C1 = new Circulo(10);
        Rectangulo R1 = new Rectangulo(20, 5);
        C1.mostrarArea();
        R1.mostrarArea();
    }
}
