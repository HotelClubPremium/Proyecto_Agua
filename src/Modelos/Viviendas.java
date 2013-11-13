/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

public class Viviendas {
  private String Codigo;
   private String Estrato;
   private String Cliente;
   private String Direccion;
   private String Barrio;
   private Integer Deuda;
   private Integer Descuento;
   
   
   public Viviendas(String Codigo,String Direccion,String Estrato,String Cliente,String Barrio,Integer Deuda,Integer Descuento){
       this.Codigo=Codigo;
       this.Direccion=Direccion;
       this.Estrato=Estrato;
       this.Cliente=Cliente;
       this.Barrio=Barrio;
       this.Deuda=Deuda;
       this.Descuento=Descuento;
       
   }
   public Viviendas(){
    
}

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getEstrato() {
        return Estrato;
    }

    public void setEstrato(String Estrato) {
        this.Estrato = Estrato;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getBarrio() {
        return Barrio;
    }

    public void setBarrio(String Barrio) {
        this.Barrio = Barrio;
    }

    public Integer getDeuda() {
        return Deuda;
    }

    public void setDeuda(Integer Deuda) {
        this.Deuda = Deuda;
    }

    public Integer getDescuento() {
        return Descuento;
    }

    public void setDescuento(Integer Descuento) {
        this.Descuento = Descuento;
    }
   
   
   
}
