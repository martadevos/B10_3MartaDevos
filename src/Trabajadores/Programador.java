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
        portatil = new Portatil("3452345AGH", );
    }

    @Override
    public Enumerado.Tecnologia cambiarTecnologia() {
        return null;
    }

    @Override
    public void subirSalario() {

    }

    @Override
    public String toString() {
        return String.format("""
                %S
                PUESTO: Programador
                    Teléfono de la empresa: %S
                    Proyecto en que trabaja: %S
                    Tecnología: %S
                    Portátil:
                    %S""", super.toString(), movil, proyecto, tecnologia, portatil);
    }
}
