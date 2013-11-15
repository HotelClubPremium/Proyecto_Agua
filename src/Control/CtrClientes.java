/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelos.Clientes;
import Modelos.ClientesDAO;
import Modelos.db;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author CarlosJulio
 */
public class CtrClientes {
      /* public String Guardar(Clientes c){
        Clientes cl=new Clientes();
        ClientesDAO CDao= new ClientesDAO();
        cl= CDao.Buscar(c.getCedula());
        if(cl == null){
            CDao.insert(c);
        return "Guardado Satisfactoriamente";
        }
        return "No se Pudo Guardar. Ya Existe un cliente con esa Cedula ";
        
        
    } */
    
 
    
     db conexion;
    public String insert(Clientes c){   
        if (!esUsernameValido(c.getCedula())){
            return "Longitud de UserName inválido ";
        }
        if (!esApellidoValido(c.getNombre())){
            return "Apellido Vacio";
        }
        if (!esNombreValido(c.getApellido())){
            return "Nombre Vacio";
        }
        try {
            conexion = new db();
            ClientesDAO CDao= new ClientesDAO(conexion);
            CDao.insert(c);
        
            return "Guardad ";
        } catch (SQLException ex) {
            Logger.getLogger(CtrClientes.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getMessage();
        }
        
        
      
    }
    private boolean esApellidoValido(String apellidos) {
        return apellidos.trim().length()>0;
    }
    private boolean esNombreValido(String nombre) {
        return nombre.trim().length()>0;
    }
    public boolean esUsernameValido(String userName) {
        return userName.trim().length()>1 && userName.trim().length()<8;
    }
    
    
    
    
    
    
       public Clientes getPk(String cedula){
         try {
              
            conexion = new db();
            Clientes c= new Clientes();
           ClientesDAO cDao= new ClientesDAO(conexion);
           c= cDao.getPk(cedula);
            return c ;
        } catch (SQLException ex) {
            Logger.getLogger(CtrClientes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
         
         
     }
}

    
    
    
    
   
    

