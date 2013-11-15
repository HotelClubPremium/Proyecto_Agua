/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelos.Consumos;
import Modelos.ConsumosDAO;
import Modelos.db;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CtrLecturaConsumos {
    db conexion;
  /*  public String insert(Consumos c){   
        if (!esUsernameValido(c.getCodigo_vivienda())){
            return "Longitud de UserName inválido ";
        }
        if (!esApellidoValido(c.getApellidos())){
            return "Apellido Vacio";
        }
        if (!esNombreValido(c.getApellidos())){
            return "Nombre Vacio";
        }
        try {
            conexion = new db();
           ConsumosDAO cDao= new ConsumosDAO(conexion);
            cDao.insert(c);
        
            return "Guardado Satisfactoriamente por migurl";
        } catch (SQLException ex) {
            Logger.getLogger(CtrLecturaConsumos.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getMessage();
        }
         
    } */
    
     public String update( Integer codigo_vivienda, Consumos c){
         try {
            conexion = new db();
            ConsumosDAO cDao= new ConsumosDAO(conexion);
            cDao.update(codigo_vivienda,c);
            return "Guardada lectura Satisfactoriamente";
        } catch (SQLException ex) {
            Logger.getLogger(CtrLecturaConsumos.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getMessage();
        }
         
         
     }
    private boolean esApellidoValido(String apellidos) {
        return apellidos.trim().length()>0;
    }
    private boolean esNombreValido(String nombre) {
        return nombre.trim().length()>0;
    }
    public boolean esUsernameValido(String userName) {
        return userName.trim().length()>4 && userName.trim().length()<8;
    }
    
    
     public Consumos getPk (Integer codigo_vivienda){
         try {
              
            conexion = new db();
            Consumos c= new Consumos();
           ConsumosDAO cDao= new ConsumosDAO(conexion);
           c= cDao.getPk(codigo_vivienda);
            return c ;
        } catch (SQLException ex) {
            Logger.getLogger(CtrLecturaConsumos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
         
         
     }
}
