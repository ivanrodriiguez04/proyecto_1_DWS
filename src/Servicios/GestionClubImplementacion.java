package servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import dtos.ClubDto;
/*
 *	Clase que implementa a la interfaz de la gestion de los clubes 
 * 17/10/2024
 * @author irodhan
 */
public class GestionClubImplementacion implements GestionClubInterfaz{
	Scanner sc = new Scanner(System.in);
	ConexionBBDDInterfaz cI=new ConexionBBDDImplementacion();
	ConsultasBBDDInterfaz consultas=new ConsultasBBDDImplementacion();
	
	public void darAltaClub() {
		ClubDto nuevoClub= crearClub();
		String sql="INSERT INTO club_motos.clubes (idclub,nombreclub,idruta,idevento,direccionclub) VALUES (?,?,?,?,?)";
		try {
			Connection conexion=cI.conectar();
			PreparedStatement sentencia=conexion.prepareStatement(sql);
			
			sentencia.setLong(1, nuevoClub.getIdClub());
			sentencia.setString(2, nuevoClub.getNombreClub());
			sentencia.setLong(3, nuevoClub.getIdRuta());
			sentencia.setLong(4, nuevoClub.getIdEvento());
			sentencia.setString(5, nuevoClub.getDireccionClub());
			
			int filasInsertadas=sentencia.executeUpdate();
			if(filasInsertadas>0) {
				System.out.println("[INFO] - Insertcion exitosa");
			}

		}catch(SQLException e) {
			System.err.println("[INFO] - Ha ocurrido un error.");
		}

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
