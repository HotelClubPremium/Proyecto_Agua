/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelos.Viviendas;
import Modelos.ViviendasDAO;
import Modelos.db;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

     
/**
 *
 * @author CarlosJulio
 */
public class CtrViviendas {
/*private ArrayList<Viviendas>lstVivienda= new ArrayList<>();
private Integer Ultimo;

     public String Guardar(Viviendas v){
         Viviendas vi=new Viviendas();
         
        ViviendasDAO VDao= new ViviendasDAO();
        vi=VDao.Buscar(v.getCodigo());
        if(vi == null){
            VDao.insert(v);
        return "Guardado Satisfactoriamente";
        }
        return "Ya Existe una vivienda con ese codigo";
        
    }
     
     public Integer UltimoRegistro(){
         try{
             ViviendasDAO vDao=new ViviendasDAO();
             lstVivienda=vDao.getRecords();
             for(int i=0;i<lstVivienda.size();i++){
               Ultimo=Integer.parseInt(lstVivienda.get(i).getCodigo());
           }
          Ultimo=Ultimo+1;
          
         return Ultimo;
         }
         catch(Exception e){
             return 1000;
         } 
         
     }*/
    
     db conexion;
    public String insert(Viviendas v){   
        if (!esUsernameValido(v.getCodigo())){
            return "Longitud de UserName inválido ";
        }
        if (!esApellidoValido(v.getDireccion())){
            return "Apellido Vacio";
        }
        if (!esNombreValido(v.getEstrato())){
            return "Nombre Vacio";
        }
        try {
            conexion = new db();
            ViviendasDAO VDao= new ViviendasDAO(conexion);
            VDao.insert(v);
        
            return "Guardad ";
        } catch (SQLException ex) {
            Logger.getLogger(CtrViviendas.class.getName()).log(Level.SEVERE, null, ex);
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
    
    
     

}
