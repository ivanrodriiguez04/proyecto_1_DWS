package servicios;

import java.util.List;

import dtos.ClubDto;
/*
 * Interfaz de la gestión de los clubes de la aplicación
 * 17/10/2024
 * @author irodhan
 */
public interface GestionClubInterfaz {
	/*
	 * Método que permite dar el alta a un nuevo club 
	 * 17/10/2024
	 * @author irodhan
	 */
	public void darAltaClub(List<ClubDto> listaClubes);

}
