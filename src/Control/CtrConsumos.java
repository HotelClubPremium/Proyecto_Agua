/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelos.Consumos;
import Modelos.ConsumosDAO;

/**
 *
 * @author CarlosJulio
 */
public class CtrConsumos {
    public String Guardar(Consumos u){
        ConsumosDAO UDao= new ConsumosDAO();
        UDao.insert(u);
        return "Guardado Satisfactoriamente";
        
    } 
}
