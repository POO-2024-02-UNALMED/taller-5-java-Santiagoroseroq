package zooAnimales;

import java.util.ArrayList;
import java.util.List;

import gestion.Zona;

public class Mamifero extends Animal {
    private static int caballos = 0;
    private static int leones = 0;
    private static List<Mamifero> listado = new ArrayList<>();
    private boolean pelaje;
    private int patas;

    public Mamifero() {
        super();
    }

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        listado.add(this);
    }

    public static int getCaballos() {
        return caballos;
    }

    public static int getLeones() {
        return leones;
    }

    public static int cantidadMamiferos() {
        return listado.size();
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero) {
        caballos++;
        return new Mamifero(nombre, edad, "pradera", genero, true, 4);
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero) {
        leones++;
        return new Mamifero(nombre, edad, "selva", genero, true, 4);
    }

    @Override
    public String movimiento() {
        return "camina";
    }

    // Getters y setters
    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public static List<Mamifero> getListado() {
        return listado;
    }

    public static void setListado(List<Mamifero> listado) {
        Mamifero.listado = listado;
    }
}