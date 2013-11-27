/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelos.Conceptos_Admin;
import Modelos.Conceptos_AdminDAO;
import Modelos.Consumos;
import Modelos.ConsumosDAO;
import Modelos.Viviendas;
import Modelos.ViviendasDAO;
import Modelos.db;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

     
/**
 *
 * @author miguel
 */
public class CtrLiquidacioneGeneral {
    ctrConceptos_adm  clCA = new ctrConceptos_adm();
    
private ArrayList<Viviendas> lstVivienda = new ArrayList<>();
private Integer Ultimo;
private Integer Codigo_vivienda;
private Integer consumo;
private Integer valor_litro;
private String Estrato;
CtrLecturaConsumos CLC= new CtrLecturaConsumos();

 db conexion;
public  void liquidacion_por_barrio (Integer barrio_liquidar  ) throws SQLException {

           ViviendasDAO vDao = new ViviendasDAO();   
           lstVivienda= vDao.getRecords();
           
              for(int i=0;i<lstVivienda.size();i++){
                  /*falta q reciba el id de barrio a liquidar   */
                    if (  lstVivienda.get(i).getId_barrio().equals(barrio_liquidar)) {
                       /* consigo el codigo y el estrato de la cada vivienda*/ 
                       Codigo_vivienda =  Integer.parseInt(lstVivienda.get(i).getCodigo());
                               Estrato =  lstVivienda.get(i).getEstrato();
                             /* consigo el consumo mes de esa vivienda */
                               consumo = consumo_vivienda(Codigo_vivienda);
                             /* consigo el valor por litro para ese estrato */
                          valor_litro   =  valor_litro_estrato(Estrato);
                       
                        }    /* fin del if */
          
            }
           
}
/* buscar el consumo del mes de esa vivienda y retornar el valor consumid */
public Integer consumo_vivienda (int codigo_vivienda){
    
               Consumos c=new Consumos();
               ConsumosDAO cDAO = new ConsumosDAO();
               c  = CLC.getPk(codigo_vivienda);
             return c.getConsumo_mes(); 
}

public Integer valor_litro_estrato (String estrato){
    /* ojo  controlador  realizado por pitre  devuelv un objeto  conceptos_Admin */
               Conceptos_Admin c=new Conceptos_Admin();
               Conceptos_AdminDAO cDAO = new Conceptos_AdminDAO();
               c  = clCA.getPk(estrato);
             return c.getPrecio();
             
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
