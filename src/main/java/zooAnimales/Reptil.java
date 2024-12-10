package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal {
    private static int iguanas = 0;
    private static int serpientes = 0;
    private static List<Reptil> listado = new ArrayList<>();
    private String colorEscamas;
    private int largoCola;

    public Reptil() {
        super();
    }

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }

    public static int getIguanas() {
        return iguanas;
    }

    public static int getSerpientes() {
        return serpientes;
    }

    public static int cantidadReptiles() {
        return listado.size();
    }

    public static Reptil crearIguana(String nombre, int edad, String genero) {
        iguanas++;
        return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero) {
        serpientes++;
        return new Reptil(nombre, edad, "desierto", genero, "marrón", 1);
    }

    @Override
    public String movimiento() {
        return "reptación";
    }

    @Override
    public String toString() {
        return super.toString() + ", tengo escamas de color " + colorEscamas + " y una cola de " + largoCola + " cm.";
    }

    // Getters y setters
    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }
}