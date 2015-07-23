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
public interface InterfazLista<T>{

    /**
     *
     * @param objeto
     */
    public void Adicionar(T objeto);
	
    /**
     *
     * @param objeto
     * @param pos
     * @throws Exception
     */
    public void Insertar(T objeto, int pos) throws Exception ;
	
    /**
     *
     * @param pos
     * @throws Exception
     */
    public void Eliminar(int pos) throws Exception;
	
    /**
     *
     * @param pos
     * @return
     * @throws Exception
     */
    public T Obtener(int pos) throws Exception;  
	
    /**
     *
     * @return
     */
    public boolean EsVacia();
	
    /**
     *
     * @return
     */
    public int Longitud();
	
    /**
     *
     * @param x
     * @return
     */
    public int Buscar(T x);
		
}
