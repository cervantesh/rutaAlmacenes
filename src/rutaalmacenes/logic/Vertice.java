/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rutaalmacenes.logic;

import java.util.Objects;

/**
 *
 * @author CBJ
 * @param <T>
 */

public  class Vertice<T extends Comparable<T>> 
                      implements Comparable<Vertice<T>>  {

    private Vertice anterior;
    private T pesoMin;

    /**
     * Asigna un valor al vertice anterior
     * @param anterior
     */
    public void setAnterior(Vertice anterior) {
        this.anterior = anterior;
    }

    /**
     *
     * @param pesoMin
     */
    public void setPesoMin(T pesoMin) {
        this.pesoMin = pesoMin;
    }
    
    /**
     *
     * @return vértice anterior
     */
    public Vertice getAnterior() {
        return anterior;
    }

    /**
     *
     * @return
     */
    public T getPesoMin() {
        return pesoMin;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vertice<?> other = (Vertice<?>) obj;
        if (!Objects.equals(this.pesoMin, other.pesoMin)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vertice{" + "anterior=" + anterior + ", pesoMin=" + pesoMin + '}';
    }
     
    @Override
    public int compareTo(Vertice<T> o) {
        return pesoMin.compareTo(o.pesoMin);
    } 
}