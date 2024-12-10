package zooAnimales;

import java.util.ArrayList;
import java.util.List;
import gestion.Zona;

public abstract class Animal {
    private static int totalAnimales = 0;
    private static List<Animal> listado = new ArrayList<>();
    protected String nombre;
    protected int edad;
    protected String habitat;
    protected String genero;
    private Zona zona;

    public Animal() {
        this.nombre = null;
        this.edad = 0;
        this.habitat = null;
        this.genero = null;
        totalAnimales++;
        listado.add(this);
    }

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
        listado.add(this);
    }

    public static String totalPorTipo() {
        String resultado = "";
        resultado += "Mamiferos: " + Mamifero.cantidadMamiferos() + "\n";
        resultado += "Aves: " + Ave.cantidadAves() + "\n";
        resultado += "Reptiles: " + Reptil.cantidadReptiles() + "\n";
        resultado += "Peces: " + Pez.cantidadPeces() + "\n";
        resultado += "Anfibios: " + Anfibio.cantidadAnfibios() + "\n";
        return resultado;
    }

    @Override
    public String toString() {
        return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero;
    }

    public abstract String movimiento();

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public static int getTotalAnimales() {
        return totalAnimales;
    }

    public static void setTotalAnimales(int totalAnimales) {
        Animal.totalAnimales = totalAnimales;
    }

    public static List<Animal> getListado() {
        return listado;
    }

    public static void setListado(List<Animal> listado) {
        Animal.listado = listado;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }
}