package Trabajadores;

public class Administrativo extends Empleado{

    private int despacho, numFax;

    public Administrativo(int antiguedad, int salario, String nombre, String apellidos, String dni, String direccion, String telf, int despacho, int numFax) {
        super(antiguedad, salario, nombre, apellidos, dni, direccion, telf);
        this.despacho = despacho;
        this.numFax = numFax;
    }

    @Override
    public void subirSalario() {

    }
}
