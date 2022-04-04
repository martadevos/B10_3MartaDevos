package Trabajadores;

import java.util.Scanner;

public class Portatil {

    private enum Modelo{SPECTRE, ENVY, ELITEBOOK, PROBOOK, ZBOOK, NOTEBOOK, PAVILION, OMEN};

    private String numDeSerie, marca;
    private Modelo modelo;


    public Portatil(String numDeSerie, Modelo modelo) {
        this.numDeSerie = numDeSerie;
        this.marca = "HP";
        this.modelo=modelo;
    }

    public static Portatil nuevoPortatil(){
        Scanner s = new Scanner(System.in);
        Modelo mod;
        System.out.print("Introduzca el número de serie del ordenador: ");
        String numSerie= s.nextLine();
        System.out.printf("""
                Introduzca un número según cual corresponda a su modelo:
                    1. Spectre
                    2. Envy
                    3. Elitebook
                    4. Probook
                    5. Zbook
                    6. Notebook
                    7. Pavilion
                    8. Omen
                """);
        int elec= s.nextInt();
        switch (elec){
            case 1 -> mod = Modelo.SPECTRE;
            case 2 -> mod = Modelo.ENVY;
            case 3 -> mod = Modelo.ELITEBOOK;
            case 4 -> mod = Modelo.PROBOOK;
            case 5 -> mod = Modelo.ZBOOK;
            case 6 -> mod = Modelo.NOTEBOOK;
            case 7 -> mod = Modelo.PAVILION;
            case 8 -> mod = Modelo.OMEN;
            default -> System.out.println("El número no es correcto, introduzca un número entre el 1 y el 8");
        }
        Portatil portatil=new Portatil();
        return portatil;
    }
}
