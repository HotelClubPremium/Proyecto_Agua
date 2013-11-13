
package Control;
import Modelos.Usuarios;
import Modelos.UsuariosDAO;
public class CtrUsuarios {
    public String Guardar(Usuarios u){
        UsuariosDAO UDao= new UsuariosDAO();
        UDao.insert(u);
        return "Guardado Satisfactoriamente";
        
    } 
}
