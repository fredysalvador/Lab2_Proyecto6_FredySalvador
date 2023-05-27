/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2_proyecto6_fredysalvador;

/**
 *
 * @author Fredy Salvador
 */
public class Cancion {
     private String titulo;
    private int duracion;
    private Album album;

    public Cancion(String titulo, int duracion, Album album) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.album = album;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public Album getAlbum() {
        return album;
    }
}
