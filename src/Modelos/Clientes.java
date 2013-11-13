/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;


public class Clientes {
     private String Cedula;
   private String Nombre;
   private String Apellido;
   private String Direccion;
   private String Telefono;
   private String Email;
   
    public Clientes (String cedula,  String nombre, String apellidos,String direccion,String telefono, String email){
  this.Cedula=cedula;
  this.Nombre=nombre;
  this.Apellido=apellidos;
  this.Direccion=direccion;
  this.Telefono=telefono;
  this.Email=email;
  
  
  }
  public Clientes(){
  }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
   
   
   
   
}
