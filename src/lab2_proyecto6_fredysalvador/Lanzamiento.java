/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2_proyecto6_fredysalvador;

/**
 *
 * @author Fredy Salvador
 */
public class Lanzamiento {
     private String titulo;
    private String fechaLanzamiento;
    private int conteoLikes;

    public Lanzamiento(String titulo, String fechaLanzamiento) {
        this.titulo = titulo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.conteoLikes = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public int getConteoLikes() {
        return conteoLikes;
    }

    public void incrementarLikes() {
        conteoLikes++;
    }
}
