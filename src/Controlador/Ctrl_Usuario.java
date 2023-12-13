package Controlador;

import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author Jaramillo
 */
public class Ctrl_Usuario {
    //metodo para iniciar Sesion
    public boolean loginUser(Usuario objeto){
        
        boolean respuesta = false;
        
        Connection cn = Conexion.conectar();
        String sql = "select NombreUsuario, Contrasena FROM usuarios WHERE NombreUsuario = '" +objeto.getNombreUsuario()+ "' AND Contrasena = '" + objeto.getContrasena()+"'";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                respuesta = true;
                
            }
        } catch (Exception e) {
            System.out.println("Error al Iniciar Sesion");
            JOptionPane.showMessageDialog(null, "Error al Iniciar Sesion");
        }
        return  respuesta;
    }
}
