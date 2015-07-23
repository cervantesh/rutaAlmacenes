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
public class RutaAlmacenes
{

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception
    {
        Grafo<Almacen> Almacenes=new Grafo<>();
        Grafo<Almacen> alm2=new Grafo<>();
        
        LocalTime  t1, t2;
        t1 = LocalTime.of(12, 50);
        t2 = LocalTime.of(8, 20);
        
        LocalTime time1=LocalTime.of(3, 0);
        LocalTime time2=LocalTime.of(4, 0);
        LocalTime time3=LocalTime.of(1, 0);
        

        Almacen a1=new Almacen("SD", "Sto Dgo", t1);
        Almacen a2=new Almacen("ST", "Santiago", t2);
        Almacen a3=new Almacen("PT", "Puerto Plata", t1);
        
        Almacenes.InsertarVertice(a1);
        Almacenes.InsertarVertice(a2);
        Almacenes.InsertarVertice(a3);
        Almacenes.InsertarArco(a1, a1, time1);
        Almacenes.InsertarArco(a2, a2, time2);
        Almacenes.InsertarArco(a1, a2, time3);
        Almacenes.InsertarArco(a3, a3, time2);
        Almacenes.InsertarArco(a1, a3, time1);
        //Almacenes.EliminarArco(a1, a2);
        //Almacenes.EliminarVertice(a3);
        
        System.out.println("Almacenes:");
        Almacenes.MostrarGrafo();
        System.out.println();
        
        
        ListaSE<NodoAP> adyac=Almacenes.VerticesAdyacentes(a1);
        System.out.println("Almacenes adyacentes a " + a1);
        for(int i=0; i<adyac.Longitud(); i++)
        {
            System.out.println(Almacenes.getLista().Obtener(adyac.Obtener(i).getAdyacenciaNodo()));
        }
        System.out.println("\nVertice de menor tiempo de recorrido en " + a1);
        System.out.println(Almacenes.getLista().Obtener(Almacenes.VerticeMenorRecorrido(a1).getAdyacenciaNodo()));
    }
    
}
