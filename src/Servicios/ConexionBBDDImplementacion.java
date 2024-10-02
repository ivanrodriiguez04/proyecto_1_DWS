package Servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Clase que contiene los metodos que tienen que ver con la conexion a la base de datos
 * 25/09/2024
 * @author irodhan
 */

public class ConexionBBDDImplementacion implements ConexionBBDDInterfaz {
	
	private String url = "jdbc:postgresql://localhost:5432/prueba_conexion";
	private String user = "postgres";
	private String password = "_Ivanrodriiguez04";
	public Connection conectar() {
		Connection conexion = null;
		try {
			// Registrar el driver JDBC de PostgreSQL
			Class.forName("org.postgresql.Driver"); 

			// Establecer la conexión usando DriverManager
			conexion = DriverManager.getConnection(url, user, password);

			System.out.println("Conexión establecida con éxito.[java]");

		} catch (SQLException e) {
			System.out.println("Error de conexión: " + e.getMessage());
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el driver: " + e.getMessage());
			e.printStackTrace();
		}

		return conexion; // Retorna la conexión establecida
	}
	
	public  void cerrarConexion(Connection conexion) {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("Conexión cerrada.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
	}
}
