
package Modelos;


public class Usuarios {
   
   private String Cedula;
   private String Nombre;
   private String Apellido;
   private String Direccion;
   private String Cargo;
   private String Email;
   private String Password;
   

  public Usuarios (String cedula,  String nombre, String apellidos,String direccion, String email,String cargo,String password){
  this.Cedula=cedula;
  this.Nombre=nombre;
  this.Apellido=apellidos;
  this.Direccion=direccion;
  this.Email=email;
  this.Cargo=cargo;
  this.Password=password;
  }
  public Usuarios(){
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

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
   
   
   
    
}
