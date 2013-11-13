/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelos.Conceptos_Admin;
import Modelos.Conceptos_AdminDAO;

/**
 *
 * @author CarlosJulio
 */
public class ctrConceptos_adm {
    
    public String Guardar(Conceptos_Admin u){
       Conceptos_AdminDAO UDao= new Conceptos_AdminDAO();
        UDao.insert(u);
        return "Guardado Satisfactoriamente";
        
    } 
    
}
