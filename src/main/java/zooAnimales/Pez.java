
package zooAnimales;
import java.ArrayList;
import java.util.List;
import gestion.Zona;

public class Pez extends Animal {
    private static int salmones = 0;
    private static int bacalaos = 0;
    private static List<Pez> listado = new ArrayList<>();
    private int cantidadAletas;
    private int longitud;

    public Pez() {
        super();
    }

    public Pez(String nombre, int edad, String habitat, String genero, int cantidadAletas, int longitud) {
        super(nombre, edad, habitat, genero);
        this.cantidadAletas = cantidadAletas;
        this.longitud = longitud;
        listado.add(this);
    }

    public static int getSalmones() {
        return salmones;
    }

    public static int getBacalaos() {
        return bacalaos;
    }

    public static int cantidadPeces() {
        return listado.size();
    }

    public static Pez crearSalmon(String nombre, int edad, String genero) {
        salmones++;
        return new Pez(nombre, edad, "oceano", genero, 6, 2);
    }

    public static Pez crearBacalao(String nombre, int edad, String genero) {
        bacalaos++;
        return new Pez(nombre, edad, "oceano", genero, 6, 3);
    }

    @Override
    public String movimiento() {
        return "natación";
    }

    @Override
    public String toString() {
        return super.toString() + ", tengo " + cantidadAletas + " aletas y una longitud de " + longitud + " cm.";
    }

    // Getters y setters
    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public static List<Pez> getListado() {
        return listado;
    }

    public static void setListado(List<Pez> listado) {
        Pez.listado = listado;
    }
}