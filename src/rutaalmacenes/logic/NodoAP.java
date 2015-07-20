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
    
    public NodoAP()
    {
        this.tiempoRecorrido=LocalTime.of(0, 0);
    }

    public NodoAP(Integer posicion, LocalTime tiempoRecorrido)
    {
        this.adyacencia = posicion;
        this.tiempoRecorrido = tiempoRecorrido;
    }
    
    public Integer getAdyacencia()
    {
        return adyacencia;
    }

    public LocalTime getTiempoRecorrido()
    {
        return tiempoRecorrido;
    }
}
