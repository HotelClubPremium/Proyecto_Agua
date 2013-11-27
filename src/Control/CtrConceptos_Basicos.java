/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelos.Conceptos_Basicos;
import Modelos.Conceptos_BasicosDAO;
import Modelos.db;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class CtrConceptos_Basicos {
     db conexion;
    Conceptos_Basicos c= new Conceptos_Basicos();
    
    
    
    public String Guardar(Conceptos_Basicos u) {
        
        try {
            conexion = new db();
            Conceptos_BasicosDAO cDao= new Conceptos_BasicosDAO(conexion);
            cDao.insert(u);
            return "Guardado Satisfactoriamente";
        } catch (SQLException ex) {
            Logger.getLogger(CtrViviendas.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getMessage();
        }
    } 
    
    public Conceptos_Basicos getPk (String Codigo_Vivienda){
         try {
              
            conexion = new db();
            Conceptos_BasicosDAO cDao= new Conceptos_BasicosDAO(conexion);
            c= cDao.getPk(Codigo_Vivienda);
            return c ;
        } catch (SQLException ex) {
            Logger.getLogger(CtrLecturaConsumos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
      }
    
     public String Update(String Codigo_Vivienda,Conceptos_Basicos u) {
        
        try {
            conexion = new db();
            Conceptos_BasicosDAO cDao= new Conceptos_BasicosDAO(conexion);
            cDao.update(Codigo_Vivienda,u);
            return "Guardado Satisfactoriamente";
        } catch (SQLException ex) {
            Logger.getLogger(CtrViviendas.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getMessage();
        }
    } 
}
