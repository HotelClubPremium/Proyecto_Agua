



package Modelos;
import java.util.ArrayList;
/**
 *
 * @author CarlosJulio
 */
public class UsuariosDAO {
     String msg;
    boolean lError;
    
    Sistema s=Sistema.getInstancia();
    public void insert(Usuarios u){ 
      //insertar en el sistema de base de datos
        s.getLstUsuarios().add(u);
}
    public ArrayList<Usuarios>getRecords(){
    return s.getLstUsuarios();
    }
    public void getPK (Usuarios u){
   //realizar busqueda en la lista y retornarlo
    }
    public void update (Usuarios u){
    //actualizar objeto de la lista
    }
    public void delete (Usuarios u){
    //eliminar objeto de la lista
    }
}
