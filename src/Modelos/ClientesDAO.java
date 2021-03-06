/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author CarlosJulio
 */
public class ClientesDAO {
     /*String msg;
    boolean lError;
    
    Sistema s=Sistema.getInstancia();
    public void insert(Clientes u){ 
      //insertar en el sistema de base de datos
        s.getLstClientes().add(u);
}
    public ArrayList<Clientes>getRecords(){
    return s.getLstClientes();
    }
   
    public Clientes Buscar(String Cedula){
     
       for(Clientes c:s.getLstClientes()){
       if(c.getCedula().equals(Cedula)){
           return c;
        }
     }
         return null;             
    }
    
    public void update (Clientes u){
    //actualizar objeto de la lista
    }
    public void delete (Clientes u){
    //eliminar objeto de la lista
    
    
    
    
    }*/
    String msg;
    boolean lError;
    private db conexion;

   
    public db getConexion() {
        return conexion;
    }
    public void setConexion(db conexion) {
        this.conexion = conexion;
    }
    public ClientesDAO(db conexion) {
        this.setConexion(conexion);
    }
     public ClientesDAO(){
        
    }
    
    public boolean insert(Clientes c) throws SQLException {
        //Insertar en el Sistema de Base de Datos
        boolean result = false;
        String sql = "insert into clientes (cedula,nombre,apellido,direccion,telefono,email) values (?,?,?,?,?,?)";
        java.sql.PreparedStatement pst = conexion.getConnection().prepareStatement(sql);
        pst.setString(1, c.getCedula());
        pst.setString(2, c.getNombre());
        pst.setString(3, c.getApellido());
        pst.setString(4, c.getDireccion());
        pst.setString(5, c.getTelefono());
        pst.setString(6, c.getEmail());
        
        
        if (pst.executeUpdate() > 0) {
            conexion.Commit();
            result = true;
        }
        return result;
    }

    public ArrayList<Clientes> getRecords() throws SQLException {
        ArrayList<Clientes> lst = new ArrayList<Clientes>();
        Clientes c =null;
        String sql = "select * from Usuarios ";
        ResultSet rs = conexion.Query(sql);
        while (rs.next()) {
            c = MapearObjeto(rs);
            lst.add(c);
        }
        rs.close();
        return lst;
    }

    public Clientes getPk(String cedula) throws SQLException {
        Clientes c=null;
        String sql = "select * from clientes where cedula=? ";
        java.sql.PreparedStatement pst = conexion.getConnection().prepareStatement(sql);
        pst.setString(1, cedula);
        ResultSet rs = conexion.Query(pst);
        lError = true;
        if (rs.next()) {
           c = MapearObjeto(rs);
            lError = false;
        }
        rs.close();
        return c;
    }

    public void update(String cedula,Clientes c) throws SQLException {
        // actualizar objeto de la lista
        boolean result = false;
        String sql = "update clientes set cedula= ?, nombre=?,apellido=?,direccion=?,telefono=?,email=? where cedula=?";
	java.sql.PreparedStatement pst = conexion.getConnection().prepareStatement(sql);
	pst.setString(1, c.getCedula());
        pst.setString(2, c.getNombre());
        pst.setString(3, c.getApellido());
        pst.setString(4, c.getDireccion());
        pst.setString(5, c.getTelefono());
        pst.setString(6, c.getEmail());
        pst.setString(7, cedula);
        this.lError = true;
	if (conexion.Update(pst) > 0) {
            conexion.Commit();
            this.lError = false;
	}
    }

    public void delete(String cedula) throws SQLException {
        //eleminar objeto de la lista
        String sql = "delete from clientes where cedula=?";
	java.sql.PreparedStatement pst = conexion.getConnection().prepareStatement(sql);
	pst.setString(1,cedula);
        this.lError = true;
	if (conexion.Update(pst) > 0) {
            conexion.Commit();
            this.lError = false;
	}
	
    }

    private Clientes MapearObjeto(ResultSet rs) throws SQLException {
        Clientes c = new Clientes();
      // c.setCedula(rs.getString("cedula"));
        c.setCedula(rs.getString("cedula"));
        c.setNombre(rs.getString("nombre"));
        c.setApellido(rs.getString("apellido"));
        c.setDireccion(rs.getString("direccion"));
        c.setTelefono(rs.getString("telefono"));
        c.setEmail(rs.getString("email"));
        return c;
    }

   
}

