/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rutaalmacenes.logic;

import java.time.LocalTime;

/**
 *
 * @author CDJ
 * @param <T>
 */
public interface InterfazGrafo<T> {

    /**
     *
     * @return
     */
    boolean EsVacio();

    /**
     *
     * @return
     */
    int NumeroDeVertices();

    /**
     *
     * @return
     * @throws Exception
     */
    int NumeroDeArcos() throws Exception;

    /**
     *
     * @param v
     * @return
     * @throws Exception
     */
    boolean EstaElVertice(T v) throws Exception;

    /**
     *
     * @param v1
     * @param v2
     * @return
     * @throws Exception
     */
    boolean EstaElArco(T v1, T v2) throws Exception;

    /**
     *
     * @param v
     * @throws Exception
     */
    void InsertarVertice(T v)throws Exception;

    /**
     *
     * @param v1
     * @param v2
     * @param time
     * @throws Exception
     */
    void InsertarArco(T v1, T v2, LocalTime time) throws Exception;

    /**
     *
     * @param v
     * @throws Exception
     */
    void EliminarVertice(T v) throws Exception;

    /**
     *
     * @param v1
     * @param v2
     * @throws Exception
     */
    void EliminarArco(T v1, T v2) throws Exception;

    /**
     *
     * @param v1
     * @param v2
     * @throws Exception
     */
    void ReemplazarVertice(T v1, T v2) throws Exception;

    /**
     *
     * @param v
     * @return
     * @throws Exception
     */
    ListaSE<T> Adyacentes(T v) throws Exception;

    /**
     *
     * @return
     * @throws Exception
     */
    ListaSE<T> ALoAncho() throws Exception;

    /**
     *
     * @return
     * @throws Exception
     */
    ListaSE<T> EnProfundidad() throws Exception;

    /**
     *
     * @return
     * @throws Exception
     */
    boolean EsConexo() throws Exception;

    /**
     *
     * @param v1
     * @param v2
     * @return
     */
    ListaSE<T> MenorCamino(T v1, T v2);

    /**
     *
     * @return
     * @throws Exception
     */
    InterfazGrafo<T> Copiar() throws Exception;
}
