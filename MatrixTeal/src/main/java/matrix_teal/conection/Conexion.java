package matrix_teal.conection;
import java.sql.Connection;
import java.sql.DriverManager;

//Conexion a base de datos
public class Conexion {
    public static Connection getConexion() {
        Connection conexion = null;
        var baseDatos = "matrix_teal_db";
        var url = "jdbc:mysql://localhost:3306/" + baseDatos;
        var usuario = "root";
        var password = "childAndor1.2.9";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (Exception e) {
            System.out.println("Error en conexion a DB: " + e.getMessage());
        }
        return conexion;
    }

    public static void main(String[] args) {
        var conexion = Conexion.getConexion();
        if (conexion != null) {
            System.out.println("Conexion exitosa");
        } else {
            System.out.println("No se puede conectar con la base de datos");
        }
    }

}