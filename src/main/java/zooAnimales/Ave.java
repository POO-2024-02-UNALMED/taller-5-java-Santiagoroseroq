package zooAnimales;

import java.util.stream.Collectors;


public class Ave extends Animal {
    private static int halcones = 0;
    private static int aguilas = 0;
    private String colorPlumas;

    public Ave() {
        super();
    }

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
    }

    public static int getHalcones() {
        return halcones;
    }

    public static int getAguilas() {
        return aguilas;
    }

    public static int cantidadAves() {
        return Animal.getListado().stream()
                .filter(animal -> animal instanceof Ave)
                .collect(Collectors.toList()).size();
    }

    public static Ave crearHalcon(String nombre, int edad, String genero) {
        halcones++;
        return new Ave(nombre, edad, "montañas", genero, "café glorioso");
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
        aguilas++;
        return new Ave(nombre, edad, "montañas", genero, "blanco y amarillo");
    }

    @Override
    public String movimiento() {
        return "vuelo";
    }

    @Override
    public String toString() {
        return super.toString() + ", tengo plumas de color " + colorPlumas + ".";
    }

    // Getters y setters
    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
}