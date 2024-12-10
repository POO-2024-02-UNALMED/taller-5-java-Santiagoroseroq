
package zooAnimales;

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
        return new Mamifero(nombre, edad, "pr