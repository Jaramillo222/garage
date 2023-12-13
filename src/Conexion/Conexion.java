package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jaramillo
 */
public class Conexion {
    //conexion local
    public static Connection conectar(){
        
        try {
            Connection cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/cochera", "root", "");
            return cn;
        } catch (Exception e) {
            System.err.println("Error en la conexion local"+e);
        }
        return  null;
    }
}
