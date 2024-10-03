package Controladores;

import java.util.ArrayList;
import java.util.List;

import Dtos.usuarioDto;
import Servicios.ConexionBBDDImplementacion;
import Servicios.ConexionBBDDInterfaz;
import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;
import Servicios.OperativaImplementacion;
import Servicios.OperativaInterfaz;

/*
 * Clase principal de la aplicacion
 * 25/09/2024
 * @author irodhan
 */
public class Main {

	// Variables globales
	public List<usuarioDto> listaUsuarios = new ArrayList<>();

	/*
	 * Metodo principal de la aplicacion 25/09/2024
	 * 
	 * @author irodhan
	 */
	public static void main(String[] args) {
		// Creamos los objetos
		ConexionBBDDInterfaz cI = new ConexionBBDDImplementacion();
		MenuInterfaz mI = new MenuImplementacion();
		OperativaInterfaz oI = new OperativaImplementacion();
		// Variables
		int opcionSeleccionada = 0;
		Boolean cerrarMenu = false;

		// Creamos un bucle para que no se termine hasta que el usuario lo indique
		while (!cerrarMenu) {
			try {
				// Guardamos la opcion indicado
				opcionSeleccionada = mI.mostrarMenuYSeleccion();

				// Creamos un switch con la opcion indicada
				switch (opcionSeleccionada) {
				case 0:
					System.out.println("[INFO] - Ha seleccionado la opcion 0");
					System.out.println("[INFO] -  Se va a cerrar la aplicacion, gracias por usarla.");
					// Cambiamos el valor de cerrarMenu para poder finalizar la aplicacion
					cerrarMenu = true;
					break;
				case 1:
					System.out.println("[INFO] - Ha seleccionado la opcion 1");
					break;
				case 2:
					System.out.println("[INFO] - Ha seleccionado la opcion 2");
					break;
				default:
					System.out.println(
							"[INFO] - La opcion seleccionado no coincide con ninguna opcion mostrada anteriormente.");
					break;

				}
			} catch (Exception e) {
				System.out.println("[INFO] - Ha ocurrido un error.");
				System.out.println(e.getMessage());
			}
		}
	}
}
