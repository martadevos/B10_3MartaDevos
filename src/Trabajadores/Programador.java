package Trabajadores;

public class Programador extends Empleado implements Cambios{

    private Portatil portatil;
    private String movil;
    private Enumerado.Proyecto proyecto;
    private Enumerado.Tecnologia tecnologia;

    public Programador(int antiguedad, int salario, String nombre, String apellidos, String dni, String direccion, String telf, Portatil portatil, String movil, Enumerado.Proyecto proyecto, Enumerado.Tecnologia tecnologia) {
        super(antiguedad, salario, nombre, apellidos, dni, direccion, telf);
        this.portatil = portatil;
        this.movil = movil;
        this.proyecto = proyecto;
        this.tecnologia = tecnologia;
    }

    @Override
    public Portatil cambiarPortatil() {
        return null;
    }

    @Override
    public Enumerado.Tecnologia cambiarTecnologia() {
        return null;
    }

    @Override
    public void subirSalario() {

    }
}
