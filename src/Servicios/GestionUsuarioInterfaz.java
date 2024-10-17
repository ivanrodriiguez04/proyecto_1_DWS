package servicios;

import java.util.List;

import dtos.UsuarioDto;
/*
 * Interfaz de la gestion del usuario en la aplicacion
 * 17/10/2024
 * @author irodhan
 */
public interface GestionUsuarioInterfaz {
	/*
	 * Metodo que permite dar el alta a un nuevo usuario
	 * 17/10/2024
	 * @author irodhan
	 */
	public void darAltaUsuario(List<UsuarioDto> listaUsuarios);
}
