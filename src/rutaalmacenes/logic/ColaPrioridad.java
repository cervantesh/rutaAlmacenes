/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rutaalmacenes.logic;

/**
 *
 * @author 20127008
 * @param <T>
 */

public interface ColaPrioridad <T extends Comparable<T>> {
    
    void insertar(T x);
    T obtenerPrimero();
    T eliminar();
    boolean esVacio();
    
}
