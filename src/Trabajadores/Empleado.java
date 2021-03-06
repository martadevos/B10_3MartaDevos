package Trabajadores;

public abstract class Empleado {

    private int antiguedad, salario;
    private String nombre, apellidos, dni, direccion, telf;

    public Empleado(int antiguedad, int salario, String nombre, String apellidos, String dni, String direccion, String telf) {
        this.antiguedad = antiguedad;
        this.salario = salario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telf = telf;
    }

    public abstract void subirSalario();

    @Override
    public String toString() {
        return String.format("""
                DATOS DEL EMPLEADO:
                    Nombre completo: %S %S
                    DNI: %S
                    Tlf: %S
                    Dirección: %S
                    Salario: %S
                    Antigüedad en la empresa: %S""", nombre, apellidos, dni, telf, direccion, salario, antiguedad);
    }
}
