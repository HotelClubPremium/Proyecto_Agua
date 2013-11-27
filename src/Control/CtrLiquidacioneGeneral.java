/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelos.Conceptos_Admin;
import Modelos.Conceptos_AdminDAO;
import Modelos.Conceptos_Basicos;
import Modelos.Conceptos_BasicosDAO;
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
    CtrConceptos_Basicos cCB = new CtrConceptos_Basicos();
    
private ArrayList<Viviendas> lstVivienda = new ArrayList<>();
private Integer Ultimo;
private Integer Codigo_vivienda;
private Integer consumo;
private Integer valor_litro;
private Integer deuda;
private Integer nuevo_total;
private Integer cargo_mes;
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
                          cargo_mes=  valor_litro *  consumo;
/*  ya tengo el codigo de vivienda y el nuevo gargo mes.......luego actualizo en conceptos basicos de esa vivienda*/
                           actualizar_conceptos_basicos(codigo_vivienda,cargo_mes );
                           
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


public void  actualizar_conceptos_basicos( String  codigo_vivienda,  int cargo_mes ){
    
      Conceptos_Basicos cb= new Conceptos_Basicos();
      Conceptos_BasicosDAO cDao= new Conceptos_BasicosDAO();
       cb  = cCB .getPk(codigo_vivienda);
       
       deuda= cb.getTotal();
       nuevo_total= (deuda+ cargo_mes + cb.getReconexion()-cb.getDescuento());
       
     cb.setDeuda(deuda);
     cb.setCargo_Mensual(cargo_mes);
     cb.setDescuento(0);
     cb.setReconexion(consumo);
     cb.setTotal(nuevo_total);
     
      String msg = cCB .Update(codigo_vivienda,cb);
       
}
     

}
