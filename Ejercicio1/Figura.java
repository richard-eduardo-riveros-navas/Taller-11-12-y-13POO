package Ejercicio1;

public abstract class Figura {
    public abstract double calcularArea();
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
// Archivo: Triangulo.java
class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
class PruebaFigura {
    public static void main(String[] args) {
        Figura rect = new Rectangulo(5.0, 8.0);
        Figura tri = new Triangulo(5.0, 8.0);

        System.out.println("Área del Rectángulo: " + rect.calcularArea());
        System.out.println("Área del Triángulo: " + tri.calcularArea());
    }
}

