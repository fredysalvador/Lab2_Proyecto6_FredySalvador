/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2_proyecto6_fredysalvador;

/**
 *
 * @author Fredy Salvador
 */
public class Single extends Lanzamiento {
    private Cancion cancion;

    public Single(String titulo, String fechaLanzamiento, Cancion cancion) {
        super(titulo, fechaLanzamiento);
        this.cancion = cancion;
    }

    public Cancion getCancion() {
        return cancion;
    }
}
