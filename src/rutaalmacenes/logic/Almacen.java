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
public class Almacen
{
    private String id;
    private String nombre;
    private LocalTime horaDeApertura;

    public Almacen(String ID, String nombre, LocalTime horaDeApertura) //
    {
        this.id = ID;
        this.nombre = nombre;
        this.horaDeApertura = horaDeApertura;
    }

    public String getID()
    {
        return id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public LocalTime getHoraDeApertura()
    {
        return horaDeApertura;
    }

    @Override
    public String toString()
    {
        return "ID: " + id + ". " + nombre + ". Hora de apertura: " + horaDeApertura;
    }
    
}
