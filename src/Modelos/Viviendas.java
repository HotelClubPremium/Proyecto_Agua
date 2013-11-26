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
   private Integer Id_barrio;
   private Integer Deuda;
   private Integer Descuento;
   
   
   public Viviendas(String Codigo,String Direccion,String Estrato,String Cliente,String Barrio,Integer Deuda,Integer Descuento){
       this.Codigo=Codigo;
       this.Direccion=Direccion;
       this.Estrato=Estrato;
       this.Cliente=Cliente;
       this.Id_barrio=Id_barrio;
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

    public Integer getId_barrio() {
        return Id_barrio;
    }

    public void setId_barrio(Integer Id_barrio) {
        this.Id_barrio = Id_barrio;
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

    public void getCodigo_vivienda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
   
}
