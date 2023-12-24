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

    // En tu método Ctrl_Clientes.guardar
    public boolean guardar(Cliente objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            System.out.println("Dentro de Ctrl_Clientes.guardar");
            PreparedStatement consulta = cn.prepareStatement("insert into clientes (IDCliente, NombreCliente, Telefono, Email) values(?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNombreCliente());
            consulta.setString(3, objeto.getTelefono());
            consulta.setString(4, objeto.getEmail());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar cliente: " + e);
        }
        return respuesta;
    }

    // Método para verificar si existe un cliente
    public boolean existeCliente(String cliente) {
        boolean respuesta = false;
        String sql = "SELECT NombreCliente FROM clientes WHERE NombreCliente = ?";

        try (Connection cn = Conexion.conectar(); PreparedStatement consulta = cn.prepareStatement(sql)) {

            // Configura el parámetro con el nombre del cliente
            consulta.setString(1, cliente);

            // Ejecuta la consulta
            ResultSet rs = consulta.executeQuery();

            // Verifica si hay algún resultado
            if (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar cliente: " + e);
        }

        return respuesta;
    }

    // Método para actualizar un cliente
    public boolean actualizar(Cliente cliente) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("update clientes set NombreCliente=?, Telefono=?, Email=? where IDCliente=?");
            consulta.setString(1, cliente.getNombreCliente());
            consulta.setString(2, (cliente.getTelefono() != null) ? cliente.getTelefono() : ""); // Si es null, establece una cadena vacía
            consulta.setString(3, (cliente.getEmail() != null) ? cliente.getEmail() : ""); // Si es null, establece una cadena vacía
            consulta.setInt(4, cliente.getIDCliente());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar cliente: " + e);
        }
        return respuesta;
    }

    // Método para eliminar un cliente
    public boolean eliminar(int idCliente) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("delete from clientes where IDCliente=?");
            consulta.setInt(1, idCliente);

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar cliente: " + e);
        }
        return respuesta;
    }
}
