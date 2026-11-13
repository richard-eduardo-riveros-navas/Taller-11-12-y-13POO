package Ejercicio2;

public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSalario();

    public void mostrarDetalles() {
        System.out.println("Empleado: " + nombre + " | Salario calculado: " + calcularSalario());
    }
}

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
class Prueba {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("pedro",100,30);
        Vendedor v1 = new Vendedor("pablo",67,20);
        g1.mostrarDetalles();
        v1.mostrarDetalles();
    }
    }