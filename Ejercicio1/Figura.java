package Ejercicio1;

// Clase abstracta base
// Clase abstracta Figura
public abstract class Figura {
    // Método abstracto (sin cuerpo)
    public abstract double calcularArea();

    // Método concreto compartido
    public void mostrarArea() {
        System.out.println("El área de la figura es: " + calcularArea());
    }
}

// Clase derivada Circulo
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

// Clase derivada Rectangulo
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
