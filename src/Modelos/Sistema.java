
package Modelos;
import java.util.ArrayList;
public class Sistema {
    private static Sistema instancia= new Sistema();
    private String Cargo;
      private ArrayList<Usuarios>lstUsuarios= new ArrayList<>();
      private ArrayList<Clientes>lstClientes= new ArrayList<>();
      private ArrayList<Viviendas>lstViviendas= new ArrayList<>();
      private ArrayList<Conceptos_Admin>lstConceptos_Adm= new ArrayList<>();
     
      private ArrayList<HistorialPagos>lstHistorialPagos= new ArrayList<>();
      
  
    public static Sistema getInstancia(){
        return instancia;
        }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
     
      private Sistema(){
      
         Usuarios u;       
         Clientes c;
         Viviendas v;
         
        u= new Usuarios ("1065654572","Carlos","Pitre","calle 123","carlos@hotmail.com","Gerente","1234");
         lstUsuarios.add(u);
        u= new Usuarios ("1065654582","yone","valle","calle 123","yone@hotmail.com","Jefe Persona","12345");
        lstUsuarios.add(u);    
         u= new Usuarios ("1065654592","Miguel","Palomini","calle 123","migue@hotmail.com","Recepcionista","12346");
        lstUsuarios.add(u); 
         u= new Usuarios ("1065654562","Jeiner","Mellado","calle 123","jeiner@hotmail.com","Cajero","12347");
        lstUsuarios.add(u);
         u= new Usuarios ("0","admin","admin","admin","admin@hotmail.com","Administrador","admin");
        lstUsuarios.add(u);
        c=new Clientes("1065","Carlos","julio","calle 1","5869575","cj@hotmail.com");
        lstClientes.add(c);
        
        v=new Viviendas("1000","calle 14 #17","1","1065","Sabana",0,0);
        lstViviendas.add(v);
        }
      
      public  ArrayList<Usuarios> getLstUsuarios (){
     return lstUsuarios;
 }
       public  ArrayList<Clientes> getLstClientes (){
     return lstClientes;
 }
        public  ArrayList<Viviendas> getLstViviendas (){
     return lstViviendas;
 }
      public  ArrayList<Conceptos_Admin> getLstConceptos_Admin (){
     return lstConceptos_Adm;
 }
     
      public  ArrayList<HistorialPagos> getLstHistorialPagos (){
     return lstHistorialPagos;
 }
      
}
