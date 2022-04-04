package Trabajadores;

import java.util.ArrayList;

public class JefeProyecto extends Empleado implements Cambios{

    private int despacho;
    private Administrativo admin;
    private Programador programador;
    private ArrayList<Enumerado.Proyecto> listaProyectos;
    private Portatil portatil;
    private Enumerado.Tecnologia tecnologia;

    public JefeProyecto(int antiguedad, int salario, String nombre, String apellidos, String dni, String direccion, String telf, int despacho, Administrativo admin, Programador programador, ArrayList<Enumerado.Proyecto> listaProyectos, Portatil portatil, Enumerado.Tecnologia tecnologia) {
        super(antiguedad, salario, nombre, apellidos, dni, direccion, telf);
        this.despacho = despacho;
        this.admin = admin;
        this.programador = programador;
        this.listaProyectos = listaProyectos;
        this.portatil = portatil;
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
