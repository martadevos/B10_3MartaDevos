package Trabajadores;

public class Coche {

    private String matricula, marca, modelo;

    public Coche(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return String.format("Matricula: %S\nMarca: %S\nModelo: %S",matricula,marca, modelo);
    }
}
