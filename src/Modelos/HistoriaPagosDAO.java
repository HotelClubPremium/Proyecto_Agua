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
public class HistoriaPagosDAO {
     String msg;
    boolean lError;
    
    private db conexion;
    public db getConexion() {
        return conexion;
    }
    public void setConexion(db conexion) {
        this.conexion = conexion;
    }
    
    Sistema s=Sistema.getInstancia();

    public HistoriaPagosDAO(db conexion) {
      this.setConexion(conexion);
    }
    
    
    public boolean insert(HistorialPagos u)throws SQLException { 
      //insertar en el sistema de base de datos
        boolean result = false;
        String sql = "INSERT INTO Historial_Pago(Vivienda,Consumo_Mes,Deuda,TotalMes,Pago,NuevoSaldo,Mes,Año) values (?,?,?,?,?,?,?,?)";
        java.sql.PreparedStatement pst = conexion.getConnection().prepareStatement(sql);
        pst.setString(1, u.getVivienda());
        pst.setInt(2, u.getConsumoMes());
        pst.setInt(3, u.getDeuda());
        pst.setInt(4, u.getTotalMes());
        pst.setInt(5, u.getPago());
        pst.setInt(6, u.getNuevoSaldo());
        pst.setInt(7, u.getMes());
        pst.setInt(8, u.getAño());
        if (pst.executeUpdate() > 0) {
            conexion.Commit();
            result = true;
        }
        return result;
    }
    public ArrayList<HistorialPagos>   getRecords(){
    return s.getLstHistorialPagos();
    }
   
    public HistorialPagos Buscar(String Vivienda){
     
       for(HistorialPagos c:s.getLstHistorialPagos()){
       if(c.getVivienda().equals(Vivienda)){
           return c;
        }
     }
         return null;             
    }
}
