package zooAnimales;

import java.util.ArrayList;
import java.util.List;
import gestion.Zona;

public class Anfibio extends Animal {
    private static int ranas = 0;
    private static int salamandras = 0;
    private static List<Anfibio> listado = new ArrayList<>();
    private boolean pielBatracia;
    private int ojos;

    public Anfibio() {
        super();
    }

    public Anfibio(String nombre, int edad, String habitat, String genero, boolean pielBatracia, int ojos) {
        super(nombre, edad, habitat, genero);
        this.pielBatracia = pielBatracia;
        this.ojos = ojos;
        listado.add(this);
    }

    public static int getRanas() {
        return ranas;
    }

    public static int getSalamandras() {
        return salamandras;
    }

    public static int cantidadAnfibios() {
        return listado.size();
    }

    public static Anfibio crearRana(String nombre, int edad, String genero) {
        ranas++;
        return new Anfibio(nombre, edad, "selva", genero, true, 2);
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        salamandras++;
        return new Anfibio(nombre, edad, "selva", genero, true, 2);
    }

    @Override
    public String movimiento() {
        return "salto";
    }

    @Override
    public String toString() {
        return super.toString() + ", tengo piel batracia " + (pielBatracia ? "sí" : "no") + " y " + ojos + " ojos.";
    }

    // Getters y setters
    public boolean isPielBatracia() {
        return pielBatracia;
    }

    public void setPielBatracia(boolean pielBatracia) {
        this.pielBatracia = pielBatracia;
    }

    public int getOjos() {
        return ojos;
    }

    public void setOjos(int ojos) {
        this.ojos = ojos;
    }

    public static List<Anfibio> getListado() {
        return listado;
    }

    public static void setListado(List<Anfibio> listado) {
        Anfibio.listado = listado;
    }
}