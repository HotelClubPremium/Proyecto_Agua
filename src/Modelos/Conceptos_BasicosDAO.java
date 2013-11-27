/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Conceptos_BasicosDAO {
  String msg;
    boolean lError;
    private db conexion;
    
    public db getConexion() {
        return conexion;
    }
    public void setConexion(db conexion) {
        this.conexion = conexion;
    }
    
     public Conceptos_BasicosDAO(db conexion){
         this.setConexion(conexion);
    }
    
    public Conceptos_BasicosDAO(){
        
    }
    
    public boolean insert(Conceptos_Basicos c) throws SQLException {
        //Insertar en el Sistema de Base de Datos
        boolean result = false;
        String sql = "INSERT INTO conceptos_basicos(deuda,cargo_mensual,descuento,reconexion,total,codigo_vivienda) VALUES(?,?,?,?,?,?)";
        
        java.sql.PreparedStatement pst = conexion.getConnection().prepareStatement(sql);
        pst.setInt(1, c.getDeuda());
        pst.setInt(2, c.getCargo_Mensual());       
        pst.setInt(3, c.getDescuento());
        pst.setInt(4, c.getReconexion());
        pst.setInt(5, c.getTotal());
        pst.setString(6, c.getCodigo_Vivienda());
        
        if (pst.executeUpdate() > 0) {
            conexion.Commit();
            result = true;
        }
        return result;
    }
    
    public boolean update(String Codigo_Vivienda,Conceptos_Basicos c) throws SQLException {
        //Insertar en el Sistema de Base de Datos
        boolean result = false;
        String sql = "update conceptos_basicos set deuda =?,\n" +
                    "cargo_mensual = ?,\n" +
                    "descuento = ?,\n" +
                    "reconexion = ?,\n" +
                    "total = ? \n" +
                    "WHERE \n" +
                    "codigo_vivienda = ? ";
        java.sql.PreparedStatement pst = conexion.getConnection().prepareStatement(sql);
        pst.setInt(1, c.getDeuda());       
        pst.setInt(2, c.getCargo_Mensual());
        pst.setInt(3, c.getDescuento());
        pst.setInt(4, c.getReconexion());
        pst.setInt(5, c.getTotal());
        pst.setString(6, Codigo_Vivienda);
        
        this.lError = true;
        if (conexion.Update(pst) > 0) {
            conexion.Commit();
            this.lError = false;
        }
        return result;
    }
    
    public Conceptos_Basicos getPk(String codigo_vivienda) throws SQLException {
      
        Conceptos_Basicos c =null;
        String sql = "select * from conceptos_basicos where codigo_vivienda=? ";
        java.sql.PreparedStatement pst = conexion.getConnection().prepareStatement(sql);
        pst.setString(1,codigo_vivienda);        
        ResultSet rs = conexion.Query(pst);
        lError = true;
        if (rs.next()) {
           c = MapearObjeto(rs);
            lError = false;
        }
        rs.close();
        return c;
    }
    
    private Conceptos_Basicos MapearObjeto(ResultSet rs) throws SQLException {
        Conceptos_Basicos c = new  Conceptos_Basicos();
        c.setCodigo_Vivienda(rs.getString("Codigo_Vivienda"));      
        c.setCargo_Mensual(rs.getInt("valor_litros"));
        c.setReconexion(rs.getInt("reconexion"));
        c.setDescuento(rs.getInt("descuento"));
        c.setTotal(rs.getInt("Total"));
        c.setDeuda(rs.getInt("Deuda"));
        return c;
    }
    
    
    
}
