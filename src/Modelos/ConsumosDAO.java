/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.ArrayList;

/**
 *
 * @author CarlosJulio
 */
public class ConsumosDAO {
     String msg;
    boolean lError;
    
    Sistema s=Sistema.getInstancia();
    public void insert(Consumos u){ 
      //insertar en el sistema de base de datos
        s.getLstConsumos().add(u);
}
    public ArrayList<Consumos>getRecords(){
    return s.getLstConsumos();
    }
   
    public Consumos Buscar(String Vivienda){
     
       for(Consumos c:s.getLstConsumos()){
       if(c.getVivienda().equals(Vivienda)){
           return c;
        }
     }
         return null;             
    }
}
