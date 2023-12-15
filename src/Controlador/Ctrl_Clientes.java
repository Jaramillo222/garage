package Controlador;

import Conexion.Conexion;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import modelo.Cliente;
import java.sql.ResultSet;

/**
 *
 * @author Jaramillo
 */
public class Ctrl_Clientes {

    //metodo para registrar cliente
    public boolean guardar(Cliente objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into clientes values(?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNombreCliente());
            consulta.setString(3, objeto.getTelefono());
            consulta.setString(4, objeto.getEmail());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar cliente" + e);
        }
        return respuesta;
    }

    //metodo para consultar si existe cliente
    public boolean existeCliente(String cliente) {
        boolean respuesta = false;
        String sql = "select NombreCliente from clientes where NombreCliente = '" + cliente + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar cliente" + e);
        }
        return respuesta;
    }

}
