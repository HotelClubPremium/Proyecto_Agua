/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author CarlosJulio
 */
public class Conceptos_AdminDAO {
     String msg;
    boolean lError;
    private db conexion;
    
     public db getConexion() {
        return conexion;
    }
    public void setConexion(db conexion) {
        this.conexion = conexion;
    }
    
    public Conceptos_AdminDAO(db conexion){
         this.setConexion(conexion);
    }
    
    public Conceptos_AdminDAO(){
        
    }
    
    public boolean insert(Conceptos_Admin c) throws SQLException {
        //Insertar en el Sistema de Base de Datos
        boolean result = false;
        String sql = "INSERT INTO conceptos_admin(Estrato,valor_litros,reconexion,descuento) VALUES(?,?,?,?)";
        
        java.sql.PreparedStatement pst = conexion.getConnection().prepareStatement(sql);
        pst.setString(1, c.getEstrato());
        pst.setInt(2, c.getPrecio());       
        pst.setInt(3, c.getReconexion());
        pst.setInt(4, c.getDescuento());
        
        if (pst.executeUpdate() > 0) {
            conexion.Commit();
            result = true;
        }
        return result;
    }

    public boolean update(String Estrato,Conceptos_Admin c) throws SQLException {
        //Insertar en el Sistema de Base de Datos
        boolean result = false;
        String sql = "update conceptos_admin set valor_litros = ? ,reconexion= ? ,descuento= ? where Estrato= ?";
        java.sql.PreparedStatement pst = conexion.getConnection().prepareStatement(sql);
        pst.setInt(1, c.getPrecio());       
        pst.setInt(2, c.getReconexion());
        pst.setInt(3, c.getDescuento());
        pst.setString(4, Estrato);
        this.lError = true;
        if (conexion.Update(pst) > 0) {
            conexion.Commit();
            this.lError = false;
        }
        return result;
    }
    
    
     public Conceptos_Admin getPk(String Estrato) throws SQLException {
      
        Conceptos_Admin c =null;
        String sql = "select * from conceptos_admin where Estrato=? ";
        java.sql.PreparedStatement pst = conexion.getConnection().prepareStatement(sql);
        pst.setString(1,Estrato);        
        ResultSet rs = conexion.Query(pst);
        lError = true;
        if (rs.next()) {
           c = MapearObjeto(rs);
            lError = false;
        }
        rs.close();
        return c;
    }
    
    private Conceptos_Admin MapearObjeto(ResultSet rs) throws SQLException {
        Conceptos_Admin c = new  Conceptos_Admin();
        c.setEstrato(rs.getString("Estrato"));      
        c.setPrecio(rs.getInt("valor_litros"));
        c.setReconexion(rs.getInt("reconexion"));
        c.setDescuento(rs.getInt("descuento"));
        return c;
    }
    
}
