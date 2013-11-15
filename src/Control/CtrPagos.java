/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelos.ClientesDAO;
import Modelos.Conceptos_Admin;
import Modelos.Conceptos_AdminDAO;
import Modelos.Consumos;
import Modelos.ConsumosDAO;
import Modelos.HistoriaPagosDAO;
import Modelos.HistorialPagos;
import Modelos.db;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CarlosJulio
 */
public class CtrPagos {
    private Integer Total,Consumo,Precio;
    db conexion;
    
    public Integer Calcular(String Vivienda,String Estrato){
        
        
        Consumos c=new Consumos();
        ConsumosDAO cDao=new ConsumosDAO();
        Conceptos_Admin ca=new Conceptos_Admin();
        Conceptos_AdminDAO caDao=new Conceptos_AdminDAO();
        
        c=cDao.Buscar(Vivienda);
        if (c==null){
            return 0;
        }
        else{
            ca=caDao.Buscar(Estrato);
            Consumo=c.getConsumo_mes();
            Precio=ca.getPrecio();
            Total=Consumo*Precio;
            return Total;
        }
               
        
    }
    
     public String Guardar(HistorialPagos u){
       try {
            conexion = new db();
            HistoriaPagosDAO CDao= new HistoriaPagosDAO(conexion);
            CDao.insert(u);
        
            return "Datos Guardados Correctamente";
        } catch (SQLException ex) {
            Logger.getLogger(CtrClientes.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getMessage();
        }
        
    } 
    
}
