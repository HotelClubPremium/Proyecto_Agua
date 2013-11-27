/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author CarlosJulio
 */
public class Conceptos_Admin {
    
    private String Estrato;
    private Integer Precio;
    private Integer Reconexion;
    private Integer Descuento;
    
    public Conceptos_Admin(String Estrato,Integer Precio){
        this.Estrato=Estrato;
        this.Precio=Precio;
    }
    public Conceptos_Admin(){
    
}

    public String getEstrato() {
        return Estrato;
    }

    public void setEstrato(String Estrato) {
        this.Estrato = Estrato;
    }

    public Integer getPrecio() {
        return Precio;
    }

    public void setPrecio(Integer Precio) {
        this.Precio = Precio;
    }

    public Integer getReconexion() {
        return Reconexion;
    }

    public void setReconexion(Integer Reconexion) {
        this.Reconexion = Reconexion;
    }

    public Integer getDescuento() {
        return Descuento;
    }

    public void setDescuento(Integer Descuento) {
        this.Descuento = Descuento;
    }
    
    
}
