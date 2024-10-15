package servicios;

import java.sql.Connection;

/*
 * Interfaz de los metodos relacionados con la conexion a base de datos
 * 25/09/2024
 * @author irodhan
 */
public interface ConexionBBDDInterfaz {
	/*
	 * Metodo que genera la conexion a la base de datos
	 * 26/09/2024
	 * @author irodhan
	 */
	public Connection conectar();
	/*
	 * Metodo que cierra la conexion a la base de datos
	 * 26/09/2024
	 * @author irodhan
	 */
	public  void cerrarConexion();
}
