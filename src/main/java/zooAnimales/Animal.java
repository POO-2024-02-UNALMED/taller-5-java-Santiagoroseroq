
package zooAnimales;

import gestion.Zona;
import gestion.Zoologico;

public abstract class Animal {
    private static int totalAnimales = 0;
    protected String nombre;
    protected int edad;
    protected String habitat;
    protected String genero;
    protected Zona zona;

    public Animal() {
        totalAnimales++;
    }

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }

    public static int getTotalAnimales() {
        return totalAnimales;
    }

    public static String totalPorTipo() {
        int mamiferos = Mamifero.getListado().size();
        int aves = Ave.getListado().size();
        int reptiles = Reptil.getListado().size();
        int peces = Pez.getListado().size();
        int anfibios = Anfibio.getListado().size();

        return "• Mamíferos: " + mamiferos + "\n" +
               "• Aves: " + aves + "\n" +
               "• Reptiles: " + reptiles + "\n" +
               "• Peces: " + peces + "\n" +
               "• Anfibios: " + anfibios;
    }

    @Override
    public String toString() {
        if (zona != null) {
            return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi género es " + genero + ". La zona en la que me ubico es " + zona.getNombre() + ", en el " + zona.getZoologico().getNombre() + ".";
        } else {
            return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi género es " + genero + ".";
        }
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

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public static void main(String[] args) {
        // ...
    public static void main(String[] args) {
    // Crear un zoológico
    Zoologico zoologico = new Zoologico("Zoológico de la ciudad", "Centro de la ciudad");

    // Crear zonas en el zoológico
    Zona zonaMamiferos = new Zona("Mamíferos", zoologico);
    Zona zonaAves = new Zona("Aves", zoologico);

    // Agregar zonas al zoológico
    zoologico.agregarZonas(zonaMamiferos);
    zoologico.agregarZonas(zonaAves);

    // Crear animales
    Mamifero mamifero1 = Mamifero.crearCaballo("Caballo 1", 5, "Macho");
    Mamifero mamifero2 = Mamifero.crearLeon("León 1", 3, "Macho");
    Ave ave1 = Ave.crearHalcon("Halcón 1", 2, "Macho");
    Ave ave2 = Ave.crearAguila("Águila 1", 4, "Hembra");

    // Agregar animales a las zonas
    zonaMamiferos.agregarAnimales(mamifero1);
    zonaMamiferos.agregarAnimales(mamifero2);
    zonaAves.agregarAnimales(ave1);
    zonaAves.agregarAnimales(ave2);

    // Imprimir información
    System.out.println("Zoológico: " + zoologico.getNombre());
    System.out.println("Cantidad de animales en el zoológico: " + zoologico.cantidadTotalAnimales());
    System.out.println("Cantidad de mamíferos: " + Mamifero.cantidadMamiferos());
    System.out.println("Cantidad de aves: " + Ave.cantidadAves());
    System.out.println(mamifero1.toString());
    System.out.println(ave1.toString());
}