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
public class Almacen<T> extends Vertice
{
    private String id;
    private String ciudad;
    private T horaDeApertura;

    public Almacen(String ID, String nombre, T horaDeApertura) //
    {
        this.id = ID;
        this.ciudad = nombre;
        this.horaDeApertura = horaDeApertura;
    }

    public String getID()
    {
        return id;
    }

    public String getNombre()
    {
        return ciudad;
    }

    public T getHoraDeApertura()
    {
        return horaDeApertura;
    }

    @Override
    public String toString()
    {
        return "ID: " + id + "  Ciudad: " + ciudad + "  Hora Inicio:  " + horaDeApertura;
    } 
    
    @Override
    public boolean equals(Object obj) {
        Almacen almacen = (Almacen) obj;
        return this.id.equals(almacen.id) && this.ciudad.equals(almacen.ciudad);
        
    }
    
}
