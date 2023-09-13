
package modeloDAO;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Carrito;
import modelo.Compra;

public class CompraDAO {
    
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r=0;
    
    public int GenerarCompra(Compra Compra){
        int idcompras;
        String sql="insert into compras(idCliente,FechaCompras,Monto,Estado,idPago) values(?,?,?,?,?)";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1,Compra.getCliente().getId());
            ps.setString(2,Compra.getFecha());
            ps.setDouble(3,Compra.getMonto());
            ps.setString(4,Compra.getEstado());
            ps.setInt(5,Compra.getIdpago());
            r=ps.executeUpdate();
            
            sql="Select @@IDENTITY AS idCompras";
            rs=ps.executeQuery(sql);
            rs.next();
            idcompras=rs.getInt("idCompras");
            rs.close();
            
            for (Carrito detalle : Compra.getDetallecompras()) {
                sql="insert into detalle_compras(idProducto,idCompras,Cantidad,PrecioCompra)values(?,?,?,?)";
                ps=con.prepareStatement(sql);
                ps.setInt(1,detalle.getIdproducto());
                ps.setInt(2,idcompras);
                ps.setInt(3,detalle.getCantidad());
                ps.setDouble(4, detalle.getPreciocompra());
                r=ps.executeUpdate();
            }
        } catch (Exception e) {
        }
       return r; 
    }
}
