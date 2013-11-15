/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Miguel Palomino
 */
public class Consumos {
    private Integer codigo_vivienda;
    private String direccion_vivienda;
    private Integer lectura_anterior;
    private Integer consumo_mes;
    
    public Consumos(Integer codigo_vivienda,String direccion_vivienda,Integer lectura_anterior,Integer consumo_mes){
        this.codigo_vivienda=codigo_vivienda;
        this.direccion_vivienda=direccion_vivienda;
        this.lectura_anterior=lectura_anterior;
        this.consumo_mes=consumo_mes;
    }
    public Consumos(){
        
    }

    public Integer  getCodigo_vivienda() {
        return  this.codigo_vivienda;
    }

    public void setCodigo_vivienda(Integer codigo_vivienda) {
        this.codigo_vivienda = codigo_vivienda;
    }

    public String getDireccion_vivienda() {
        return direccion_vivienda;
    }

    public void setDireccion_vivienda(String direccion_vivienda) {
        this.direccion_vivienda= direccion_vivienda;
    }
    
    public Integer getLectura_anterior() {
        return this.lectura_anterior;
    }

    public void setLectura_anterior(Integer lectura_anterior) {
        this.lectura_anterior= lectura_anterior;
    }
    
     public Integer getConsumo_mes() {
        return  this.consumo_mes;
    }

    public  void  setConsumo_mes(Integer consumo_mes) {
        this.consumo_mes= consumo_mes;
    }

  
   
    
}
