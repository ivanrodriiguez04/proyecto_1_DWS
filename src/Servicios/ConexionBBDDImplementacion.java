package servicios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/*
 * Clase que contiene los metodos que tienen que ver con la conexion a la base de datos
 * 25/09/2024
 * @author irodhan
 */

public class ConexionBBDDImplementacion implements ConexionBBDDInterfaz {
	
	private Connection conexion = null;
	
	public Connection conectar() {
		String[] parametrosConexion = configuracionConexion(); //url, user, pass
		
		if(!parametrosConexion[2].isEmpty()) { //Se controla que los parámetros de conexión se completen
			try {
				//Instancia un objeto de la clase interfaz que se le pasa
				Class.forName("org.postgresql.Driver");
				
				//Se establece la conexión
				//Si pgadmin no tiene abierta la bd, no será posible establecer conexion contra ella
				conexion = DriverManager.getConnection(parametrosConexion[0],parametrosConexion[1],parametrosConexion[2]);
				boolean esValida = conexion.isValid(50000);
				if(esValida == false) {
					conexion = null;
				}
				System.out.println(esValida ? "[INFORMACIÓN-ConexionPostgresqlImplementacion-generaConexion] Conexión a PostgreSQL válida" : "[ERROR-ConexionPostgresqlImplementacion-generaConexion] Conexión a PostgreSQL no válida");
	            
			} catch (ClassNotFoundException cnfe) {
				System.err.println("[ERROR-ConexionPostgresqlImplementacion-generaConexion] Error en registro driver PostgreSQL: " + cnfe);
				conexion = null;
			} catch (SQLException jsqle) {
				System.err.println("[ERROR-ConexionPostgresqlImplementacion-generaConexion] Error en conexión a PostgreSQL (" + parametrosConexion[0] + "): " + jsqle);
				conexion = null;
			}
			
		}else {
			System.out.println("[ERROR-ConexionPostgresqlImplementacion-generaConexion] Los parametros de conexion no se han establecido correctamente");	
			conexion = null;
		}
		return conexion;
	}
	
	public  void cerrarConexion() {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("Conexión cerrada.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
	}
private String[] configuracionConexion() {
		
		String user="", pass="", port="", host="", db="", url="";
		String[] stringConfiguracion = {"","",""};
		
		Properties propiedadesConexion = new Properties();
		try {
			propiedadesConexion.load(new FileInputStream(new File("C:\\Users\\irodhan\\Desktop\\DWS\\edu.proyecto1.es\\src\\util\\conexion_postgresql.properties")));
			user = propiedadesConexion.getProperty("user");
			pass = propiedadesConexion.getProperty("pass");
			port = propiedadesConexion.getProperty("port");
			host = propiedadesConexion.getProperty("host");
			db = propiedadesConexion.getProperty("db");
			url = "jdbc:postgresql://" + host + ":" + port + "/" + db;
			stringConfiguracion[0] = url;
			stringConfiguracion[1] = user;
			stringConfiguracion[2] = pass;
		} catch (FileNotFoundException e) {
			System.err.println("[ERROR-ConexionPostgresqlImplementacion-configuracionConexion] - Error al acceder al fichero propiedades de conexion.");
			stringConfiguracion[0] = "";
			stringConfiguracion[1] = "";
			stringConfiguracion[2] = "";
		} catch (IOException e) {
			System.err.println("[ERROR-ConexionPostgresqlImplementacion-configuracionConexion] - Error al acceder al fichero propiedades de conexion.");
			stringConfiguracion[0] = "";
			stringConfiguracion[1] = "";
			stringConfiguracion[2] = "";
		}

		return stringConfiguracion;
	}
}
