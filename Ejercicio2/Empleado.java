package Ejercicio2;

// Clase abstracta Empleado
public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto
    public abstract double calcularSalario();

    // Método concreto
    public void mostrarDetalles() {
        System.out.println("Empleado: " + nombre + " | Salario calculado: " + calcularSalario());
    }
}

// Clase Gerente
class Gerente extends Empleado {
    private double salarioBase;
    private double bono;

    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}

// Clase Vendedor
class Vendedor extends Empleado {
    private double salarioBase;
    private double comision;

    public Vendedor(String nombre, double salarioBase, double comision) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comision;
    }
}
