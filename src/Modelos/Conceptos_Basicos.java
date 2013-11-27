/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Carlos
 */
public class Conceptos_Basicos {
    
    private String Codigo_Vivienda;
    private Integer Deuda;
    private Integer Cargo_Mensual;
    private Integer Descuento;
    private Integer Reconexion;
    private Integer Total;
    
    public Conceptos_Basicos(String Codigo_Vivienda,Integer Deuda,Integer Cargo_Mensual,Integer Descuento,Integer Reconexion,Integer Total){
    this.Codigo_Vivienda= Codigo_Vivienda;
    this.Deuda= Deuda;
    this.Cargo_Mensual=Cargo_Mensual;
    this.Descuento=Descuento;
    this.Reconexion= Reconexion;
    this.Total=Total;
    
    }
    
    public Conceptos_Basicos(){
        
    }

    public String getCodigo_Vivienda() {
        return Codigo_Vivienda;
    }

    public void setCodigo_Vivienda(String Codigo_Vivienda) {
        this.Codigo_Vivienda = Codigo_Vivienda;
    }

    public Integer getDeuda() {
        return Deuda;
    }

    public void setDeuda(Integer Deuda) {
        this.Deuda = Deuda;
    }

    public Integer getCargo_Mensual() {
        return Cargo_Mensual;
    }

    public void setCargo_Mensual(Integer Cargo_Mensual) {
        this.Cargo_Mensual = Cargo_Mensual;
    }

    public Integer getDescuento() {
        return Descuento;
    }

    public void setDescuento(Integer Descuento) {
        this.Descuento = Descuento;
    }

    public Integer getReconexion() {
        return Reconexion;
    }

    public void setReconexion(Integer Reconexion) {
        this.Reconexion = Reconexion;
    }

    public Integer getTotal() {
        return Total;
    }

    public void setTotal(Integer Total) {
        this.Total = Total;
    }
    
}
