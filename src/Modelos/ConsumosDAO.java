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
 * @author Miguel
 */
public class ConsumosDAO {
    String msg;
    boolean lError;
    private db conexion;

    
    public db getConexion() {
        return conexion;
    }
    public void setConexion(db conexion) {
        this.conexion = conexion;
    }
    public ConsumosDAO(db conexion) {
        this.setConexion(conexion);
    }
     public ConsumosDAO(){
        
    }
    
   /* public boolean insert(Consumos c) throws SQLException {
        //Insertar en el Sistema de Base de Datos
        boolean result = false;
        String sql = "insert into Usuarios (UserName,Nombre,Apellidos,Email,Password) values (?,?,?,?,?)";
        java.sql.PreparedStatement pst = conexion.getConnection().prepareStatement(sql);
        pst.setString(1, c.getUsername());
        pst.setString(2, c.getNombre());
        pst.setString(3, c.getApellidos());
        pst.setString(4, c.getEmail());
        pst.setString(5, c.getPassword());
        if (pst.executeUpdate() > 0) {
            conexion.Commit();
            result = true;
        }
        return result;
    } */

    public ArrayList<Consumos> getRecords() throws SQLException {
        ArrayList<Consumos> lst = new ArrayList<Consumos>();
        Consumos c =null;
        String sql = "select * from Consumos ";
        ResultSet rs = conexion.Query(sql);
        while (rs.next()) {
            c = MapearObjeto(rs);
            lst.add(c);
        }
        rs.close();
        return lst;
    }
 // buscar Consumos por  codigo vivienda
    public Consumos getPk(Integer codigo_vivienda) throws SQLException {
      
        Consumos c =null;
        String sql = "select * from Consumos where codigo_vivienda=? ";
        java.sql.PreparedStatement pst = conexion.getConnection().prepareStatement(sql);
        pst.setInt(1,codigo_vivienda);        
        ResultSet rs = conexion.Query(pst);
        lError = true;
        if (rs.next()) {
           c = MapearObjeto(rs);
            lError = false;
        }
        rs.close();
        return c;
    }
// acutalizar  un usuario necesita username y  el objeto con los campos
    public void update(Integer codigo_vivienda,  Consumos c) throws SQLException {
        // actualizar objeto de la lista
        boolean result = false;
        String sql = "update Consumos set lectura_anterior=?,consumo_mes=? where codigo_vivienda=?";
	java.sql.PreparedStatement pst = conexion.getConnection().prepareStatement(sql);
	pst.setInt(1, c.getLectura_anterior());
        pst.setInt(2, c.getConsumo_mes());
        pst.setInt(3,codigo_vivienda);
        this.lError = true;
	if (conexion.Update(pst) > 0) {
            conexion.Commit();
            this.lError = false;
	}
    }
/*// eliminar usuario necesita el
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
	
    } */

    private Consumos MapearObjeto(ResultSet rs) throws SQLException {
        Consumos c = new Consumos();
        c.setCodigo_vivienda(rs.getInt(("codigo_vivienda")));
        c.setDireccion_vivienda(rs.getString("direccion_vivienda"));
        c.setLectura_anterior(rs.getInt("lectura_anterior"));
        c.setConsumo_mes(rs.getInt("consumo_mes"));
        
        return c;
    }
}
