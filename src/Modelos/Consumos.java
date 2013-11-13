/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author CarlosJulio
 */
public class Consumos {
    private String Vivienda;
    private Integer Consumo;
    
    public Consumos(String Vivienda,Integer Consumo){
        this.Consumo=Consumo;
        this.Vivienda=Vivienda;
    }
    public Consumos(){
        
    }

    public String getVivienda() {
        return Vivienda;
    }

    public void setVivienda(String Vivienda) {
        this.Vivienda = Vivienda;
    }

    public Integer getConsumo() {
        return Consumo;
    }

    public void setConsumo(Integer Consumo) {
        this.Consumo = Consumo;
    }
    
}
