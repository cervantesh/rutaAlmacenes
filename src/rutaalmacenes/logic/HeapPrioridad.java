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


public class HeapPrioridad <T extends Comparable<T>> implements  ColaPrioridad<T>{

    private T [] vector;
    
    private int tamanoactual;

    
    private static final int CAPACIDAD = 15;
    
    /**
     *
     */
    public HeapPrioridad()
    {
        this.tamanoactual = 0;
        this.obtenerVector(HeapPrioridad.CAPACIDAD);
    }
      
    
    private void obtenerVector(int nuevoTamano)
    {
        this.vector = (T[]) new Comparable [nuevoTamano + 1];
    }
    
    
    private void comprobarTamano()
    {
        if (tamanoactual ==vector.length-1)
            {
                T[]vectorAnterior = vector;
                obtenerVector(tamanoactual*2);
                for(int i = 0; i<vector.length; i++)
                {
                    vector[i]= (T)vectorAnterior[i];
                }
            }   
    }
    
    private void hundir(int hueco)
    {
        
        //o que el vector llegue al final 
        
        boolean bandera = true;
        T temp = vector[hueco];
        
        //si hijos son mayores
        while (hueco*2<= tamanoactual && bandera ) 
        {            
            int hijo = hueco*2;
            ///vector[hijo+1].compareTo(hijo)<0 si esto si cumple hijo+1 es menor
            if ((hijo+1<=tamanoactual) && (vector[hijo+1].compareTo(vector[hijo]))<0) {
                hijo++;
                if (vector[hijo].compareTo(temp)<0) {
                    hueco = hijo;
                }
                else
                {
                    bandera = false;
                }
                vector[hueco]=temp;
            }
        }
        
        
        
    }
    
    /**
     *
     * @param x
     */
    @Override
    public void insertar(T x) {
        comprobarTamano();
        int hueco = this.tamanoactual++;
        

        while (hueco > 0 && x.compareTo(vector[hueco/2])<0) 
        {            
            vector[hueco] = vector[hueco/2];
            hueco = hueco/2;
            
        }
        vector[hueco] = x;
    }
   
    /**
     *
     * @return
     */
    @Override
    public T obtenerPrimero() {
        return vector[1];
    }

    /**
     *
     * @return
     */
    @Override
    public T eliminar() {
        T min = obtenerPrimero();
        if (tamanoactual == 0) {
            tamanoactual++;
        }
        vector[1] = vector[tamanoactual--];
        hundir(1);
        
        
        
        return min;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean esVacio() {
        return this.tamanoactual == 0;
   }
    
    /**
     *
     * @return
     */
    public T[] getVector() {
        return vector;
    }
    
    /**
     *
     * @return
     */
    public int getTamanoactual() {
        return tamanoactual;
    }
    
    /**
     *
     * @param i
     * @return
     */
    public T getMiembro(int i)
    {
        return vector[i];
    }
    

   


    
}
