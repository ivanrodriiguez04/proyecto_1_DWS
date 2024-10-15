package servicios;

import java.util.List;

import dtos.ClubDto;
import dtos.UsuarioDto;

/*
 * Interfaz principal de las operaciones de la aplicacion
 * 03/10/2024
 * @author irodhan
 */
public interface OperativaInterfaz {

	public void darAltaUsuario(List<UsuarioDto> listaUsuarios);
	
	public void darAltaClub(List<ClubDto> listaClubes);
}
