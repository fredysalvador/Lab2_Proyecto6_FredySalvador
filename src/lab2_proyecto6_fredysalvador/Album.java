/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2_proyecto6_fredysalvador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fredy Salvador
 */
public class Album extends Lanzamiento {
    private List<Cancion> canciones;
    private int cantidadCanciones;

    public Album(String titulo, String fechaLanzamiento) {
        super(titulo, fechaLanzamiento);
        this.canciones = new ArrayList<>();
        this.cantidadCanciones = 0;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public int getCantidadCanciones() {
        return cantidadCanciones;
    }

    public void agregarCancion(Cancion cancion) {
        // Lógica para agregar una canción al álbum
    }
}
