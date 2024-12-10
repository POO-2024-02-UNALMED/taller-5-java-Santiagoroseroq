
package gestion;

import java.util.ArrayList;
import java.util.List;
import zooAnimales.Animal;

public class Zona {
    private String nombre;
    private Zoologico zoologico;
    private List<Animal> animales;

    public Zona() {}

    public Zona(String nombre, Zoologico zoologico) {
        this.nombre = nombre;
        this.zoologico = zoologico;
        this.animales = new ArrayList<>();
    }

    public void agregarAnimales(Animal animal) {
        if (!animales.contains(animal)) {
            animales.add(animal);
            animal.setZona(this);
        }
    }

    public int getCantidadAnimales() {
        return animales.size();
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Zoologico getZoologico() {
        return zoologico;
    }

    public void setZoologico(Zoologico zoologico) {
        this.zoologico = zoologico;
    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }
}