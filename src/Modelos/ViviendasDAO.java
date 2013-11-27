
package Modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ViviendasDAO {
    /*String msg;
    boolean lError;
    
    Sistema s=Sistema.getInstancia();
    public void insert(Viviendas u){ 
      //insertar en el sistema de base de datos
        s.getLstViviendas().add(u);
}
    public ArrayList<Viviendas>getRecords(){
    return s.getLstViviendas();
    }
   public Viviendas Buscar(String Codigo){
     
       for(Viviendas c:s.getLstViviendas()){
       if(c.getCodigo().equals(Codigo)){
           return c;
        }
     }
         return null;             
    }
    public void update (Usuarios u){
    //actualizar objeto de la lista
    }
    public void delete (Usuarios u){
    //eliminar objeto de la lista
    } */
    
    
    String msg;
    boolean lError;
    private db conexion;

   
    public db getConexion() {
        return conexion;
    }
    public void setConexion(db conexion) {
        this.conexion = conexion;
    }
    public ViviendasDAO(db conexion) {
        this.setConexion(conexion);
    }
     public ViviendasDAO(){
        
    }
    
    
    public boolean insert(Viviendas v) throws SQLException {
        //Insertar en el Sistema de Base de Datos
        boolean result = false;
        String sql = "insert into viviendas (codigo,direccion,estrato,barrio) values (?,?,?,?)";
        java.sql.PreparedStatement pst = conexion.getConnection().prepareStatement(sql);
        pst.setString(1, v.getCodigo());
        pst.setString(2, v.getDireccion());
        pst.setString(3, v.getEstrato());
        pst.setInt(4, v.getId_barrio());
        
        
        if (pst.executeUpdate() > 0) {
            conexion.Commit();
            result = true;
        }
        return result;
    }
    
    public ArrayList<Viviendas> getRecords() throws SQLException {
        ArrayList<Viviendas> lst = new ArrayList<Viviendas>();
        Viviendas v =null;
        String sql = "select * from Usuarios ";
        ResultSet rs = conexion.Query(sql);
        while (rs.next()) {
            v = MapearObjeto(rs);
            lst.add(v);
        }
        rs.close();
        return lst;
    }

    public Viviendas getPk(String  codigo) throws SQLException {
        Viviendas v=null;
        String sql = "select * from viviendas where codigo=? ";
        java.sql.PreparedStatement pst = conexion.getConnection().prepareStatement(sql);
        pst.setString (1, codigo);
        ResultSet rs = conexion.Query(pst);
        lError = true;
        if (rs.next()) {
           v = MapearObjeto(rs);
            lError = false;
        }
        rs.close();
        return v;
    }

    public void update(String pk,Usuarios u) throws SQLException {
        // actualizar objeto de la lista
        boolean result = false;
        String sql = "update Usuarios set username= ?, nombre=?,apellidos=?,email=?,password=? where username=?";
	java.sql.PreparedStatement pst = conexion.getConnection().prepareStatement(sql);
	/*pst.setString(1, u.getUsername());
        pst.setString(2, u.getNombre());
        pst.setString(3, u.getApellidos());
        pst.setString(4, u.getEmail());
        pst.setString(5, u.getPassword());
        pst.setString(6, pk);*/
        this.lError = true;
	if (conexion.Update(pst) > 0) {
            conexion.Commit();
            this.lError = false;
	}
    }

    public void delete(String pk) throws SQLException {
        //eleminar objeto de la lista
        String sql = "delete from Usuarios where username=?";
	java.sql.PreparedStatement pst = conexion.getConnection().prepareStatement(sql);
	pst.setString(1,pk);
        this.lError = true;
	if (conexion.Update(pst) > 0) {
            conexion.Commit();
            this.lError = false;
	}
	
    }

    private Viviendas MapearObjeto(ResultSet rs) throws SQLException {
        Viviendas v = new Viviendas();
       v.setCodigo(rs.getString("codigo"));
        v.setDireccion(rs.getString("direccion"));
        v.setEstrato(rs.getString("estrato"));
        v.setId_barrio(rs.getInt("barrio"));
       
        return v;
    }
    
}
