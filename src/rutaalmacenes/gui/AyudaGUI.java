/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rutaalmacenes.gui;
import rutaalmacenes.logic.*;

import javax.swing.DefaultComboBoxModel;


/**
 *
 * @author CDJ
 */
public class AyudaGUI {
    
    static public boolean esVacio(String st) throws Exception
    {
        if(st!=null)
        {
            return st.trim().length() == 0;
        }
        else
        {
            throw new Exception("No existe textfield");
        }
    }
    
    static public void llenarComboBox(javax.swing.JComboBox jc, Grafo  grafo) throws Exception
    {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        Object  aux = null;
        
        if (grafo!=null) 
            for (int i = 0; i < grafo.getLista().Longitud(); i++) {
                aux = grafo.getLista().Obtener(i);
                model.addElement(aux);

            }
        jc.setModel(model);
    }
}
