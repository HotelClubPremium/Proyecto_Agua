/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelos.Viviendas;
import Modelos.ViviendasDAO;
import Modelos.db;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

     
/**
 *
 * @author miguel
 */
public class CtrLiquidacioneGeneral {
private ArrayList<Viviendas> lstVivienda = new ArrayList<>();
private Integer Ultimo;

 db conexion;
public  void liquidacion_por_barrio (Integer barrio_liquidar  ) throws SQLException {
             ViviendasDAO vDao = new ViviendasDAO();
              
           lstVivienda= vDao.getRecords();
              for(int i=0;i<lstVivienda.size();i++){
                  /*falta q reciba el id de barrio a liquidar   */
                    if (  lstVivienda.get(i).getId_barrio().equals(barrio_liquidar)) {
                        
                          lstVivienda.get(i).getCodigo();
                          lstVivienda.get(i).getEstrato();
                /* consigo el codigo y el estrato de la cada vivienda*/ 
            
                        }    
          
            
            
            
            
            
            }
           
}

     
     
     public Integer UltimoRegistro(){
         try{
             ViviendasDAO vDao=new ViviendasDAO();
             lstVivienda=vDao.getRecords();
             for(int i=0;i<lstVivienda.size();i++){
               Ultimo=Integer.parseInt(lstVivienda.get(i).getCodigo());
           }
          Ultimo=Ultimo+1;
          
         return Ultimo;
         }
         catch(Exception e){
             return 1000;
         } 
         
     }
    
    
    public String insert(Viviendas v){   
        try {
            conexion = new db();
            ViviendasDAO VDao= new ViviendasDAO(conexion);
            VDao.insert(v);
        
            return "Guardad ";
        } catch (SQLException ex) {
            Logger.getLogger(CtrLiquidacioneGeneral.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getMessage();
        }
        
        
        
    }
    
      public Viviendas getPk(String codigo){
         try {
              
            conexion = new db();
            Viviendas v= new Viviendas();
           ViviendasDAO vDao= new ViviendasDAO(conexion);
           v= vDao.getPk(codigo);
            return v;
        } catch (SQLException ex) {
            Logger.getLogger(CtrLiquidacioneGeneral.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
         
         
     } 

}
