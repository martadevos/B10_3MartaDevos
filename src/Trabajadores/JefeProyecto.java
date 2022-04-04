package Trabajadores;

import java.util.ArrayList;

public class JefeProyecto extends Empleado implements Cambios {

    private int despacho;
    private String movil;
    private Administrativo admin;
    private ArrayList<Programador> listaProgramadores;
    private ArrayList<Enumerado.Proyecto> listaProyectos;
    private Portatil portatil;
    private Enumerado.Tecnologia tecnologia;
    private Coche coche;

    public JefeProyecto(String movil, Coche coche, int antiguedad, int salario, String nombre, String apellidos, String dni, String direccion, String telf, int despacho, Administrativo admin, ArrayList<Programador> listaProgramadores, ArrayList<Enumerado.Proyecto> listaProyectos, Portatil portatil, Enumerado.Tecnologia tecnologia) {
        super(antiguedad, salario, nombre, apellidos, dni, direccion, telf);
        this.despacho = despacho;
        this.admin = admin;
        this.listaProgramadores = listaProgramadores;
        this.listaProyectos = listaProyectos;
        this.portatil = portatil;
        this.movil = movil;
        this.tecnologia = tecnologia;
        this.coche = coche;
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

    @Override
    public String toString() {
        return String.format("""
                %S
                PUESTO: Jefe de Proyecto
                    Teléfono de empresa: %S
                    Despacho: %S
                    Administrador: %S
                    Programadores bajo su cargo:
                    %S
                    Proyectos bajo su cargo:
                    %S
                    Tecnología: %S
                    Portátil:
                    %S
                    Coche:
                    %S""", super.toString(), movil, despacho, admin, listaProgramadores, listaProyectos, tecnologia, portatil, coche);
    }
}
