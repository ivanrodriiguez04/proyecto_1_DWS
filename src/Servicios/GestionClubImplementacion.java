package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.ClubDto;
/*
 *	Clase que implementa a la interfaz de la gestion de los clubes 
 * 17/10/2024
 * @author irodhan
 */
public class GestionClubImplementacion implements GestionClubInterfaz{
Scanner sc = new Scanner(System.in);
	ConsultasBBDDInterfaz consultas=new ConsultasBBDDImplementacion();
	public void darAltaClub(List<ClubDto> listaClubes) {
		consultas.cargaClub();
		ClubDto nuevoClub= crearClub();
		
		listaClubes.add(nuevoClub);
	}
	/*
	 * Metodo que crea un objeto club y pide la informacion necesaria al usuario
	 * 15/10/2024
	 * @author irodhan
	 */
	private ClubDto crearClub() 
	{
		ClubDto nuevoClub=new ClubDto();
		nuevoClub.setIdClub(util.Utilidades.asignarIdClub());
		System.out.println("Introduzca el nombre del club:");
		nuevoClub.setNombreClub(sc.next());
		System.out.println("Introduzca la direccion del club: ");
		nuevoClub.setDireccionClub(sc.next());
		return nuevoClub;
	}
}
