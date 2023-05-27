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
public class Artista extends Usuario {
    private String nombreArtistico;
    private List<Cancion> canciones;
    private List<Album> albums;

    public Artista(String username, String password, int edad, String nombreArtistico) {
        super(username, password, edad);
        this.nombreArtistico = nombreArtistico;
        this.canciones = new ArrayList<>();
        this.albums = new ArrayList<>();
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void crearLanzamiento(Lanzamiento lanzamiento) {
        // Lógica para crear y publicar un lanzamiento
    }

    public void eliminarLanzamiento(Lanzamiento lanzamiento) {
        // Lógica para eliminar un lanzamiento
    }

    public void editarLanzamiento(Lanzamiento lanzamiento) {
        // Lógica para editar un lanzamiento
    }
}
