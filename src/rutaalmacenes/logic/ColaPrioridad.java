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
    
    /**
     *
     * @param x
     */
    void insertar(T x);

    /**
     *
     * @return
     */
    T obtenerPrimero();

    /**
     *
     * @return
     */
    T eliminar();

    /**
     *
     * @return
     */
    boolean esVacio();
    
}
