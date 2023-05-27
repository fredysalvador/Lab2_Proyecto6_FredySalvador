package lab2_proyecto6_fredysalvador;


import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fredy Salvador
 */
public class ListaReproduccion {
    private String nombre;
    private int conteoLikes;
    private List<Cancion> canciones;

    public ListaReproduccion(String nombre) {
        this.nombre = nombre;
        this.conteoLikes = 0;
        this.canciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getConteoLikes() {
        return conteoLikes;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void incrementarLikes() {
        conteoLikes++;
    }

    public void agregarCancion(Cancion cancion) {
        // Lógica para agregar una canción a la lista de reproducción
    }
}
