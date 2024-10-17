package controladores;

import java.util.ArrayList;
import java.util.List;

import dtos.ClubDto;
import dtos.UsuarioDto;
import servicios.ConexionBBDDImplementacion;
import servicios.ConexionBBDDInterfaz;
import servicios.GestionClubImplementacion;
import servicios.GestionClubInterfaz;
import servicios.GestionUsuarioImplementacion;
import servicios.GestionUsuarioInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

/*
 * Clase principal de la aplicacion
 * 25/09/2024
 * @author irodhan
 */
public class Inicio {

	// Variables globales
	public static List<UsuarioDto> listaUsuarios = new ArrayList<>();
	public static List<ClubDto> listaClubes = new ArrayList<>();

	/*
	 * Metodo principal de la aplicacion 25/09/2024
	 * 25/09/2024
	 * @author irodhan
	 */
	public static void main(String[] args) {
		// Creamos los objetos
		ConexionBBDDInterfaz cI = new ConexionBBDDImplementacion();
		MenuInterfaz mI = new MenuImplementacion();
		GestionUsuarioInterfaz gU=new GestionUsuarioImplementacion();
		GestionClubInterfaz gC=new GestionClubImplementacion();
		// Variables
		int opcionSeleccionada = 0;
		Boolean cerrarMenu = false;

		cI.conectar();
		// Creamos un bucle para que no se termine hasta que el usuario lo indique
		do {
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
					gU.darAltaUsuario(listaUsuarios);
					break;
				case 2:
					System.out.println("[INFO] - Ha seleccionado la opcion 2");
					gC.darAltaClub(listaClubes);
					break;
				case 3:
					System.out.println("[INFO] - Ha seleccionado la opcion 3");

					break;
				case 4:
					System.out.println("[INFO] - Ha seleccionado la opcion 4");

					break;
				case 5:
					System.out.println("[INFO] - Ha seleccionado la opcion 5");

					break;
				case 6:
					System.out.println("[INFO] - Ha seleccionado la opcion 6");

					break;
				default:
					System.err.println("[INFO] - La opcion seleccionado no coincide con ninguna opcion mostrada anteriormente.");
					break;
				}
			} catch (Exception e) {
				System.err.println("[INFO] - Ha ocurrido un error.");
				System.out.println(e.getMessage());
			}
		} while(!cerrarMenu);
	}
}
