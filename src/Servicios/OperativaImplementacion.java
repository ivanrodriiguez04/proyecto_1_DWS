package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.ClubDto;
import dtos.UsuarioDto;

/*
 * Implementacion principal de las operaciones de la aplicacion
 * 03/10/2024
 * @author irodhan
 */
public class OperativaImplementacion implements OperativaInterfaz{

	Scanner sc = new Scanner(System.in);

	ConsultasBBDDInterfaz consultas=new ConsultasBBDDImplementacion();
	public void darAltaUsuario(List<UsuarioDto> listaUsuarios) {
		// TODO Auto-generated method stub
		consultas.cargaUsuario();
		UsuarioDto nuevoUsuario= crearUsuario();
		
		listaUsuarios.add(nuevoUsuario);
	}
	/*
	 * Metodo que crea un objeto usuario y pide la informacion necesaria al usuario
	 * 15/10/2024
	 * @author irodhan
	 */
	private UsuarioDto crearUsuario() 
	{
		UsuarioDto nuevoUsuario= new UsuarioDto();
		
		nuevoUsuario.setIdUsuario(0);;
		System.out.println("Introduzca su nombre:");
		nuevoUsuario.setNombreUsuario(sc.nextLine());
		System.out.println("Introduzca sus apellidos:");
		nuevoUsuario.setApellidosUsuario(sc.nextLine());
		System.out.println("Introduzca su DNI: ");
		nuevoUsuario.setDniUsuario(sc.nextLine());
		System.out.println("Introduzca su número telefónico:");
		nuevoUsuario.setTelefonoUsuario(sc.nextInt());
		System.out.println("Introduzaca su email: ");
		nuevoUsuario.setEmailUsuario(sc.nextLine());
		
		return nuevoUsuario;
	}
	
	public void darAltaClub(List<ClubDto> listaClubes) {
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
		
		
		return nuevoClub;
	}

}
