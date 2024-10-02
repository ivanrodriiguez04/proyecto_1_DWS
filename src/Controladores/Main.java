package Controladores;


import Servicios.*;

/*
 * Clase principal de la aplicacion
 * 25/09/2024
 * @author irodhan
 */
public class Main {

	/*
	 * Metodo principal de la aplicacion
	 * 25/09/2024
	 * @author irodhan
	 */
	public static void main(String[] args) {
		// Creamos los objetos
		ConexionBBDDInterfaz cI=new ConexionBBDDImplementacion();
		cI.conectar();
	}

}
