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
public class Almacen<T> extends Vertice
{
    private String id;
    private String ciudad;
    private T horaDeApertura;

    /**
     *
     * @param ID
     * @param nombre
     * @param horaDeApertura
     */
    public Almacen(String ID, String nombre, T horaDeApertura) //
    {
        this.id = ID;
        this.ciudad = nombre;
        this.horaDeApertura = horaDeApertura;
    }

    /**
     *
     * @return atributo ID
     */
    public String getID()
    {
        return id;
    }

    /**
     *
     * @return atributo ciudad
     */
    public String getCiudad()
    {
        return ciudad;
    }

    /**
     *
     * @return atributo horaDeApertura
     */
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
