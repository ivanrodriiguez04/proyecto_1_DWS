package util;

import java.util.List;

import dtos.ClubDto;
import dtos.UsuarioDto;
import servicios.ConsultasBBDDImplementacion;
import servicios.ConsultasBBDDInterfaz;
/*
 *	Clase que contiene las utilidades de la aplicacion 
 * 17/10/2024
 * @author irodhan
 */
public class Utilidades {
	
	/*
	 * Método que calcula el id para un nuevo usuario 
	 * 17/10/2024
	 * @author irodhan
	 */
	public static long asignarIdUsuario() {
		ConsultasBBDDInterfaz consulta=new ConsultasBBDDImplementacion();
		consulta.cargaUsuario();
		List<UsuarioDto> nuevaLista=controladores.Inicio.listaUsuarios;
		long id;
		int tamanyo=nuevaLista.size();
		if(tamanyo>0) 
		{
			id=nuevaLista.get(tamanyo-1).getIdUsuario()+1;
		}
		else 
		{
			id=1;
		}
		return id;
	}
	/*
	 * Método que calcula el id para un nuevo club
	 * 17/10/2024
	 * @author irodhan
	 */
	public static long asignarIdClub() {
		ConsultasBBDDInterfaz consulta=new ConsultasBBDDImplementacion();
		consulta.cargaClub();
		List<ClubDto> nuevaLista=controladores.Inicio.listaClubes;
		long id;
		int tamanyo=nuevaLista.size();
		if(tamanyo>0) 
		{
			id=nuevaLista.get(tamanyo-1).getIdClub()+1;
		}
		else 
		{
			id=1;
		}
		return id;
	}
	
}
