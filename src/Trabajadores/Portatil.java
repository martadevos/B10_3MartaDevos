package Trabajadores;

public class Portatil {

    private enum Modelo{};

    private String numDeSerie, marca;
    private Modelo modelo;


    public Portatil(String numDeSerie, Modelo modelo) {
        this.numDeSerie = numDeSerie;
        this.marca = "HP";
        this.modelo=modelo;
    }
}
