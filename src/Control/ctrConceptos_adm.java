/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelos.Conceptos_Admin;
import Modelos.Conceptos_AdminDAO;
import Modelos.db;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CarlosJulio
 */
public class ctrConceptos_adm {
    
    db conexion;
    Conceptos_Admin c= new Conceptos_Admin();
    
    
    
    public String Guardar(Conceptos_Admin u) {
        
        try {
            conexion = new db();
            Conceptos_AdminDAO cDao= new Conceptos_AdminDAO(conexion);
            cDao.insert(u);
            return "Guardado Satisfactoriamente";
        } catch (SQLException ex) {
            Logger.getLogger(CtrViviendas.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getMessage();
        }
    } 
    
    public Conceptos_Admin getPk (String Estrato){
         try {
              
            conexion = new db();
            Conceptos_AdminDAO cDao= new Conceptos_AdminDAO(conexion);
            c= cDao.getPk(Estrato);
            return c ;
        } catch (SQLException ex) {
            Logger.getLogger(CtrLecturaConsumos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
      }
    
     public String Update(String Estrato,Conceptos_Admin u) {
        
        try {
            conexion = new db();
            Conceptos_AdminDAO cDao= new Conceptos_AdminDAO(conexion);
            cDao.update(Estrato,u);
            return "Guardado Satisfactoriamente";
        } catch (SQLException ex) {
            Logger.getLogger(CtrViviendas.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getMessage();
        }
    } 
    
}
