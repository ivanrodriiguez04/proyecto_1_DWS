package servicios;

import java.util.Scanner;

import dtos.UsuarioDto;

/*
 * Implementacion principal de las operaciones de la aplicacion
 * 03/10/2024
 * @author irodhan
 */
public class OperativaImplementacion implements OperativaInterfaz{

	Scanner sc = new Scanner(System.in);
	@Override
	public void darAltaUsuario() {
		UsuarioDto nuevoUsuario= new UsuarioDto();
		
		nuevoUsuario.setIdUsuario(0);;
		System.out.println("Introduzca su nombre:");
		nuevoUsuario.setNombreUsuario(sc.nextLine());
		System.out.println("Introduzca sus apellidos:");
		nuevoUsuario.setApellidosUsuario(sc.nextLine());
	}

	@Override
	public void darAltaClub() {
		// TODO Auto-generated method stub
		
	}

}
