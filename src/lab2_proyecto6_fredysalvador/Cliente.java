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
public class Cliente extends Usuario {
    private List<Cancion> cancionesFavoritas;
    private List<ListaReproduccion> listasCreadas;
    private List<ListaReproduccion> listasGuardadas;

    public Cliente(String username, String password, int edad) {
        super(username, password, edad);
        this.cancionesFavoritas = new ArrayList<>();
        this.listasCreadas = new ArrayList<>();
        this.listasGuardadas = new ArrayList<>();
    }

    public List<Cancion> getCancionesFavoritas() {
        return cancionesFavoritas;
    }

    public List<ListaReproduccion> getListasCreadas() {
        return listasCreadas;
    }

    public List<ListaReproduccion> getListasGuardadas() {
        return listasGuardadas;
    }

    public void crearListaReproduccion(ListaReproduccion lista) {
        // Lógica para crear una lista de reproducción
    }

    public void editarListaReproduccion(ListaReproduccion lista) {
        // Lógica para editar una lista de reproducción
    }

    public void eliminarListaReproduccion(ListaReproduccion lista) {
        // Lógica para eliminar una lista de reproducción
    }

    public void darLikeListaReproduccion(ListaReproduccion lista) {
        // Lógica para dar like a una lista de reproducción
    }

    public void guardarListaReproduccion(ListaReproduccion lista) {
        // Lógica para guardar una lista de reproducción en la biblioteca
    }

}
