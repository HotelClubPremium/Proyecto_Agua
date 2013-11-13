/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.Date;

/**
 *
 * @author CarlosJulio
 */
public class HistorialPagos {
    private String Vivienda;
    private Integer ConsumoMes;
    private Integer Deuda;
    private Integer TotalMes;
    private Integer Pago;
    private Integer NuevoSaldo;
    private Integer Mes;
    private Integer Año;
    
   public HistorialPagos(String Vivienda,Integer ConsumoMes,Integer Deuda,Integer TotalMes,Integer Pago,Integer NuevoSaldo,Integer Mes,Integer Año){
       this.Año=Año;
       this.ConsumoMes=ConsumoMes;
       this.Deuda=Deuda;
       this.Mes=Mes;
       this.NuevoSaldo=NuevoSaldo;
       this.Pago=Pago;
       this.TotalMes=TotalMes;
       this.Vivienda=Vivienda;
       
   }
    public HistorialPagos(){
        
    }

    public String getVivienda() {
        return Vivienda;
    }

    public void setVivienda(String Vivienda) {
        this.Vivienda = Vivienda;
    }

    public Integer getConsumoMes() {
        return ConsumoMes;
    }

    public void setConsumoMes(Integer ConsumoMes) {
        this.ConsumoMes = ConsumoMes;
    }

    public Integer getDeuda() {
        return Deuda;
    }

    public void setDeuda(Integer Deuda) {
        this.Deuda = Deuda;
    }

    public Integer getTotalMes() {
        return TotalMes;
    }

    public void setTotalMes(Integer TotalMes) {
        this.TotalMes = TotalMes;
    }

    public Integer getPago() {
        return Pago;
    }

    public void setPago(Integer Pago) {
        this.Pago = Pago;
    }

    public Integer getNuevoSaldo() {
        return NuevoSaldo;
    }

    public void setNuevoSaldo(Integer NuevoSaldo) {
        this.NuevoSaldo = NuevoSaldo;
    }

    public Integer getMes() {
        return Mes;
    }

    public void setMes(Integer Mes) {
        this.Mes = Mes;
    }

    public Integer getAño() {
        return Año;
    }

    public void setAño(Integer Año) {
        this.Año = Año;
    }

    
    
}
