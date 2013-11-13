/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelos.Sistema;
import Modelos.Usuarios;

import Modelos.UsuariosDAO;
import java.util.ArrayList;


public class ctrLogin {
    private ArrayList<Usuarios>lstUsuarios= new ArrayList<>();
    
    public Boolean Validar(String Cedula,String Pass){
         try{
             UsuariosDAO uDao=new UsuariosDAO();
              Sistema s=Sistema.getInstancia();
             lstUsuarios= uDao.getRecords();
             for(int i=0;i<lstUsuarios.size();i++){
            if(lstUsuarios.get(i).getCedula().equals(Cedula) && lstUsuarios.get(i).getPassword().equals(Pass)){
                s.setCargo(lstUsuarios.get(i).getCargo());
                return true;
            }
           }          
         return false;
         }
         catch(Exception e){
             return false;
         } 
         
     }
    
}
