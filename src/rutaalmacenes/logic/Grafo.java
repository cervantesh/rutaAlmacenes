
package rutaalmacenes.logic;

import java.time.LocalTime;

/**
 *
 * @author CDJ
 * @param <T>
 */
public class Grafo<T> implements InterfazGrafo<T> {
    
    private ListaSE<T> lista;
    private ListaSE<ListaSE<NodoAP>> adyacencia;
    
    public ListaSE<T> getLista() {
        return lista;
    }

    public ListaSE<ListaSE<NodoAP>> getAdyacencia() {
        return adyacencia;
    }
    
    public Grafo() {
        lista =  new ListaSE<T>();
        adyacencia = new ListaSE<ListaSE<NodoAP>>();
    }

    protected int PosicionDelVertice(T v) throws Exception {
        for(int i = 0; i < lista.Longitud(); i++) 
            if (lista.Obtener(i).equals(v))
                return i;
        return -1;
    }
     
    @Override
    public boolean EsVacio() {
        return lista.EsVacia();
    }

    @Override
    public int NumeroDeVertices() {
        return lista.Longitud();
    }

    @Override
    public int NumeroDeArcos() throws Exception {
        int c = 0;
        for(int i = 0; i < lista.Longitud(); i++) 
            c += adyacencia.Obtener(i).Longitud();
        return c/2;
    }

    @Override
    public boolean EstaElVertice(T v) throws Exception {
        return PosicionDelVertice(v) != -1;
    }

    @Override
    public boolean EstaElArco(T v1, T v2) throws Exception {
        int p1 = PosicionDelVertice(v1);
        int p2 = PosicionDelVertice(v2);
        if ((p1 != -1)&&(p2 != -1))
        {
            ListaSE<NodoAP> adyac = adyacencia.Obtener(p1);
            for(int i = 0; i < adyac.Longitud(); i++)
                if (adyac.Obtener(i).getAdyacenciaNodo().equals(p2))
                    return true;
           
        }
        return false;
    }

    @Override
    public void InsertarVertice(T v) throws Exception {
        if(!EstaElVertice(v))
        {
            lista.Adicionar(v);
	adyacencia.Adicionar(new ListaSE<NodoAP>());
        }
        else
        {
            throw new Exception("El elemento ya Existe");
        }
    }
    
    @Override
    public void InsertarArco(T v1, T v2, LocalTime time) throws Exception
    {
        int p1 = PosicionDelVertice(v1);
        int p2 = PosicionDelVertice(v2);
        NodoAP node1= new NodoAP(PosicionDelVertice(v1), time);
        NodoAP node2= new NodoAP(PosicionDelVertice(v2), time);
        
        if ((p1 != -1)&&(p2 != -1)&&(!EstaElArco(v1,v2)))
        {
            ListaSE<NodoAP> adyac = adyacencia.Obtener(p1);
            adyac.Adicionar(node2);
            if( p1 != p2 )
            {
                adyac = adyacencia.Obtener(p2);
                adyac.Adicionar(node1);
            }
        }
        else    
            throw new IllegalArgumentException();
    }
    
    @Override
    public void EliminarVertice(T v) throws Exception //Daniel
    {
        int p = PosicionDelVertice(v);
        if (p != -1)
        {
            ListaSE<NodoAP> adyac = adyacencia.Obtener(p);
            for(int i = 0; i < lista.Longitud(); i++)
            {
                if(!adyac.EsVacia() && EstaElArco(v, lista.Obtener(i)))
                    EliminarArco(v, lista.Obtener(i));                
            }
                
            adyacencia.Eliminar(p);
            lista.Eliminar(p);
            
            NodoAP aux;
            
            for(int i = 0; i < adyacencia.Longitud(); i++)
            {
                adyac = adyacencia.Obtener(i);
                for(int j = 0; j < adyac.Longitud(); j++) {
                    aux = adyac.Obtener(0);
                    adyac.Eliminar(0);
                    if(aux.getAdyacenciaNodo() > p) 
                    {
                        NodoAP nodeAuxMinor=new NodoAP(aux.getAdyacenciaNodo()-1, aux.getTiempoRecorrido());
                        
                        adyac.Adicionar(nodeAuxMinor);//aux-1
                    }
                    else
                    {
                        NodoAP nodeAux=new NodoAP(aux.getAdyacenciaNodo(), aux.getTiempoRecorrido());
                        
                        adyac.Adicionar(nodeAux);//aux
                    }
                }
            }
        }
        else    
            throw new IllegalArgumentException();
    }

    @Override
    public void EliminarArco(T v1, T v2) throws Exception {
        int p1 = PosicionDelVertice(v1);
        int p2 = PosicionDelVertice(v2);
        if ((p1 != -1)&&(p2 != -1)&&(EstaElArco(v1,v2)))
        {
            ListaSE<NodoAP> adyac = adyacencia.Obtener(p1);
            for(int i = 0; i < adyac.Longitud(); i++)
                if(adyac.Obtener(i).getAdyacenciaNodo() == p2)
                    adyac.Eliminar(i);
            
            adyac = adyacencia.Obtener(p2);
            for(int i = 0; i < adyac.Longitud(); i++)
                if(adyac.Obtener(i).getAdyacenciaNodo() == p1)
                    adyac.Eliminar(i);
        }
        else    
            throw new IllegalArgumentException();
    }

    @Override
    public void ReemplazarVertice(T v1, T v2) throws Exception {
        int p = PosicionDelVertice(v1);
        if(p != -1) {
            lista.Eliminar(p);
            if(!lista.EsVacia())
                lista.Insertar(v2, p);
            else
                lista.Adicionar(v2);
        }
        else 
            throw new IllegalArgumentException();
    }


/*Esta es otra forma de implementar ALoAncho sin colas la otra verla en la 
    implementación de matrix de adyacencia */
    
    @Override
    public ListaSE<T> ALoAncho() throws Exception {
        int p = 0;
        if(p != -1) {
          ListaSE<T> result = new ListaSE<T>();
          ListaSE<Integer> aux = new ListaSE<Integer>();
          boolean[] visitado = new boolean[lista.Longitud()];
          aux.Adicionar(p);
          result.Adicionar(lista.Obtener(0));   
          visitado[p] = true;
          for(int k = 0; k < lista.Longitud(); k++)
          { 
             for(int i = 0; i < aux.Longitud(); i++) {
               ListaSE<NodoAP> adyac = adyacencia.Obtener(aux.Obtener(i)); 
               for(int j = 0; j < adyac.Longitud(); j++)
               {
                  if(!visitado[adyac.Obtener(j).getAdyacenciaNodo()])
                  {
                     aux.Adicionar(adyac.Obtener(j).getAdyacenciaNodo());
                     result.Adicionar(lista.Obtener(adyac.Obtener(j).getAdyacenciaNodo()));
                     visitado[adyac.Obtener(j).getAdyacenciaNodo()] = true;
                  }
               }
             }
             if(!visitado[k]) 
             {
               aux.Adicionar(k);
               result.Adicionar(lista.Obtener(k));
               visitado[k] = true;
             }
           }
       
           return result;
        }
        throw new IllegalArgumentException();
    }
    
    @Override
    public InterfazGrafo<T> Copiar() throws Exception {
        Grafo<T> g = new Grafo<T>();
        for(int i = 0; i < lista.Longitud(); i++) 
           g.lista.Adicionar(lista.Obtener(i));
        
        ListaSE<NodoAP> aux;   
        for(int i = 0; i < lista.Longitud(); i++) 
        {
            aux = new ListaSE<NodoAP>();
           ListaSE<NodoAP> adyac = adyacencia.Obtener(aux.Obtener(i).getAdyacenciaNodo());
           
           for(int j = 0; j < adyac.Longitud(); j++) 
              aux.Adicionar(adyac.Obtener(j));
           g.adyacencia.Adicionar(aux);
        }
        return g;
    }

    @Override
     public ListaSE<T> EnProfundidad() throws Exception {
        ListaSE<T> visitados = new ListaSE<T>();
        for(int i=0;i<lista.Longitud();i++)
            if(visitados.Buscar(lista.Obtener(i))==-1)
                visitados=BuscarPorProfundidad(lista.Obtener(i),visitados);
        return visitados;
    }
     
    private  ListaSE<T> BuscarPorProfundidad(T x,ListaSE<T> visitados) throws Exception{
        if(visitados.Buscar(x)==-1)
            visitados.Adicionar(x);
        for(int i=0;i<Adyacentes(x).Longitud();i++)
            if(visitados.Buscar(Adyacentes(x).Obtener(i))==-1)
             visitados=BuscarPorProfundidad(Adyacentes(x).Obtener(i),visitados);
        return visitados;
    }

    @Override
    public boolean EsConexo() throws Exception {
        ListaSE<T> visitados = new ListaSE<T>();
        visitados = BuscarPorProfundidad(lista.Obtener(0),visitados);
        return visitados.Longitud()==lista.Longitud();
    }

    @Override
    public ListaSE<T> MenorCamino(T v1, T v2) {
        return null;
    }
    
    public int Buscar(T x){
    	
        return lista.Buscar(x);
  
    }

    @Override
    public ListaSE<T> Adyacentes(T v) throws Exception {
        ListaSE<T> result = new ListaSE<T>();
        ListaSE<NodoAP> adyacentes = adyacencia.Obtener(PosicionDelVertice(v));
        for(int i=0;i<adyacentes.Longitud();i++)
            result.Adicionar(lista.Obtener(adyacentes.Obtener(i).getAdyacenciaNodo()));
        return result;
    }
    
    public void MostrarGrafo() throws Exception
    {
        for (int i=0; i<lista.Longitud(); i++)
        {
            System.out.println(lista.Obtener(i).toString());
            
            if(adyacencia.Obtener(i).Longitud()>0)
            {
                System.out.println("  Almacenes adyacentes: ");
            
                for(int j=0; j<adyacencia.Obtener(i).Longitud(); j++)
                {
                    String msg=lista.Obtener(adyacencia.Obtener(i).Obtener(j).getAdyacenciaNodo()).toString();
                    System.out.println("\t" + msg + ". Tiempo de recorrido: " + adyacencia.Obtener(i).Obtener(j).getTiempoRecorrido());
                }
            }
            else
                System.out.println("  No tiene almacenes adyacentes");
        }
    }
    
    public boolean ExistenArcos() throws Exception
    {
        return NumeroDeArcos() > 0; 
    }
    
    public ListaSE<NodoAP> VerticesAdyacentes(T v) throws Exception //Retorna lista de vertices adyacentes
    {
        int p1=PosicionDelVertice(v);
        ListaSE<NodoAP> result= new ListaSE<>();
        
        if(p1!=-1)
        {
            ListaSE<NodoAP> adyac=adyacencia.Obtener(p1);
            for(int i=0; i<adyac.Longitud(); i++)
            {
                result.Adicionar(adyac.Obtener(i));
            }
        }
        return result;
    }
    
    public NodoAP VerticeMenorRecorrido(T v) throws Exception//Retorna vértice de menor recorrido de lista de adyacentes
    {
        ListaSE<NodoAP> adyacentes=VerticesAdyacentes(v);
        
        NodoAP menor=adyacentes.Obtener(0);
        for(int i=1; i<adyacentes.Longitud(); i++)
        {
            if(adyacentes.Obtener(i).getTiempoRecorrido().isBefore(menor.getTiempoRecorrido()))
                menor=adyacentes.Obtener(i);
        }
        
        return menor;
    }
    
//    public T VerticeMenorHoraApertura(T v) throws Exception
//    {
//        ListaSE<NodoAP> adyacentes=VerticesAdyacentes(v);
//        
//        T menor=lista.Obtener(adyacentes.Obtener(0).getAdyacenciaNodo());
//        
//        
//        
//        return menor;
//    }
}
