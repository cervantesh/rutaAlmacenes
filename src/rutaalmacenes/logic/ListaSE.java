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

public class ListaSE<T> implements InterfazLista<T>
{
    private NodoSE<T> cabeza;
        
    /**
     *
     * @return
     */
    public NodoSE<T> getCabeza() {
            return cabeza;
        }

    /**
     *
     */
    public ListaSE() {
            cabeza = null;
	}

    /**
     *
     * @return
     */
    @Override
	public boolean EsVacia() {
            return cabeza == null;
	}

    /**
     *
     * @return
     */
    @Override
	public int Longitud() {
		if (cabeza == null)
			return 0;
		NodoSE<T> cursor = cabeza;
		int cont = 0;
		while (cursor != null) {
			cont++;
			cursor = cursor.getSiguiente();
		}
		return cont;
	}

    /**
     *
     * @param objeto
     */
    @Override
	public void Adicionar(T objeto) {
		NodoSE<T> nuevo = new NodoSE<>(objeto);
		if (EsVacia())
			cabeza = nuevo;
		else {
			NodoSE<T> cursor = cabeza;
			while (cursor.getSiguiente() != null)
				cursor = cursor.getSiguiente();
			cursor.setSiguiente(nuevo);
		}
	}

    /**
     *
     * @param pos
     * @throws Exception
     */
    @Override
	public void Eliminar(int pos) throws Exception {
		if (EsVacia())
			throw new Exception("Lista vacia");
		if (pos < 0 || pos >= Longitud())
			throw new Exception("Posición fuera de rango.");
		if (pos == 0)
			cabeza = cabeza.getSiguiente();
		else {
			NodoSE<T> cursor = cabeza;
			int cont = 0;
			while (cont++ < pos - 1) {
				cursor = cursor.getSiguiente();
			}
			cursor.setSiguiente(cursor.getSiguiente().getSiguiente());
		}

	}

    /**
     *
     * @param objeto
     * @param pos
     * @throws Exception
     */
    @Override
	public void Insertar(T objeto, int pos) throws Exception {
		if (pos < 0 || pos >= Longitud())
			throw new Exception("Posición fuera de rango");
		NodoSE<T> nuevo = new NodoSE<>(objeto);
		if (pos == 0) {
			nuevo.setSiguiente(cabeza);
			cabeza = nuevo;
		} else {
			NodoSE<T> cursor = cabeza;
			int cont = 0;
			while (cont++ < pos - 1)
				cursor = cursor.getSiguiente();
			nuevo.setSiguiente(cursor.getSiguiente());
			cursor.setSiguiente(nuevo);
		}
	}

    /**
     *
     * @param pos
     * @return
     * @throws Exception
     */
    @Override
	public T Obtener(int pos) throws Exception {
		if (pos < 0 || pos >= Longitud())
			throw new Exception("Posición fuera de rango");
		NodoSE<T> cursor = cabeza;
		int cont = 0;
		while (cont++ < pos) {
			cursor = cursor.getSiguiente();
		}
		return cursor.getDato();
	}

    /**
     *
     * @param x
     * @return
     */
    @Override
	public int Buscar(T x) {
		NodoSE<T> cursor = cabeza;
		int value = 0;
		while (cursor != null) {
			if(cursor.getDato().equals(x))
				return value;  
                        cursor = cursor.getSiguiente();
		}
		return -1;
	}
        
        /**
         * Retorna la lista en orden inverso
         * @return listaInvertida
     * @throws java.lang.Exception
         */
        public ListaSE<T> InvertirLista() throws Exception
        {
            ListaSE<T> listaInvertida;
            listaInvertida = new ListaSE<T>();
            
            for (int i = this.Longitud() ; i > 0; i--) {
                listaInvertida.Adicionar(this.Obtener(i));
            }
            return listaInvertida;
        }
        
}