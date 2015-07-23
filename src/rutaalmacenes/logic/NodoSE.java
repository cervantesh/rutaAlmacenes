/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rutaalmacenes.logic;

/**
 *
 * @author CDJ
 * @param <T>
 */
public class NodoSE<T> {
	
	private T dato;
	private NodoSE <T> siguiente;
	
    /**
     *
     * @param dato
     */
    public NodoSE(T dato)
	{
            this.dato = dato;
            siguiente = null;
	}

    /**
     *
     * @return
     */
    public T getDato() {
            return dato;
	}

    /**
     *
     * @param dato
     */
    public void setDato(T dato) {
            this.dato = dato;
	}

    /**
     *
     * @return
     */
    public NodoSE getSiguiente() {
            return siguiente;
	}

    /**
     *
     * @param siguiente
     */
    public void setSiguiente(NodoSE siguiente) {
            this.siguiente = siguiente;
	}
	
}
