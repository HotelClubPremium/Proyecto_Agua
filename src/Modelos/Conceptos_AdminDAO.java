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
public class Conceptos_AdminDAO {
     String msg;
    boolean lError;
    
    Sistema s=Sistema.getInstancia();
    public void insert(Conceptos_Admin u){ 
      //insertar en el sistema de base de datos
        s.getLstConceptos_Admin().add(u);
}
    public ArrayList<Conceptos_Admin>getRecords(){
    return s.getLstConceptos_Admin();
    }
   
    public Conceptos_Admin Buscar(String Estrato){
     
       for(Conceptos_Admin c:s.getLstConceptos_Admin()){
       if(c.getEstrato().equals(Estrato)){
           return c;
        }
     }
         return null;             
    }
}
