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
 */
public class NodoAP//
{
    private Integer adyacencia;
    private LocalTime tiempoRecorrido;
    
    /**
     *
     */
    public NodoAP()
    {
        this.tiempoRecorrido=LocalTime.of(0, 0);
    }

    /**
     *
     * @param posicion
     * @param tiempoRecorrido
     */
    public NodoAP(Integer posicion, LocalTime tiempoRecorrido)
    {
        this.adyacencia = posicion;
        this.tiempoRecorrido = tiempoRecorrido;
    }
    
    /**
     *
     * @return
     */
    public Integer getAdyacenciaNodo()
    {
        return adyacencia;
    }

    /**
     *
     * @return
     */
    public LocalTime getTiempoRecorrido()
    {
        return tiempoRecorrido;
    }
}
