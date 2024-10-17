package servicios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import dtos.ClubDto;
import dtos.UsuarioDto;
/*
 * Clase que implementa a la interfaz de consultas en la base de datos 
 * 17/10/2024
 * @author irodhan
 */
public class ConsultasBBDDImplementacion  implements ConsultasBBDDInterfaz{

	Connection conexion=null;
	Statement sentencia=null;
	@Override
	public void cargaUsuario() {

		ConexionBBDDInterfaz cI=new ConexionBBDDImplementacion();
	
		try {
			conexion=cI.conectar();
			sentencia=conexion.createStatement();
			//Ejecutamos la consulta SQL
			String sql="SELECT * FROM club_motos.usuarios";
			ResultSet resultado=sentencia.executeQuery(sql);
			//Cargamos los datos obtenidos en la lista
			while(resultado.next()) 
			{
				UsuarioDto usuario=new UsuarioDto();
				usuario.setIdUsuario(resultado.getLong(1));
				usuario.setNombreUsuario(resultado.getString(2));
				usuario.setApellidosUsuario(resultado.getString(3));
				usuario.setTelefonoUsuario(resultado.getInt(4));
				usuario.setDniUsuario(resultado.getString(5));
				usuario.setEmailUsuario(resultado.getString(6));	
				
				controladores.Inicio.listaUsuarios.add(usuario);
			}
			resultado.close();
			sentencia.close();
			conexion.close();
		
		}catch(Exception e) {
			System.err.println("[INFO] - Ha ocurrido algun error");
			System.out.println(e.getMessage());
			
		}finally {
			cI.cerrarConexion();
		}
	}
	@Override
	public void cargaClub() {
		ConexionBBDDInterfaz cI=new ConexionBBDDImplementacion();
		
		try {
			conexion=cI.conectar();
			sentencia=conexion.createStatement();
			//Ejecutamos la consulta SQL
			String sql="SELECT * FROM club_motos.clubes";
			ResultSet resultado=sentencia.executeQuery(sql);
			//Cargamos los datos obtenidos en la lista
			while(resultado.next()) 
			{
				ClubDto club=new ClubDto();
				club.setIdClub(resultado.getLong(1));
				club.setNombreClub(resultado.getString(2));
				club.setIdRuta(resultado.getLong(3));
				club.setIdEvento(resultado.getLong(4));
				club.setDireccionClub(resultado.getString(5));	
				
				controladores.Inicio.listaClubes.add(club);
			}
			resultado.close();
			sentencia.close();
			conexion.close();
		
		}catch(Exception e) {
			System.err.println("[INFO] - Ha ocurrido algun error");
			System.out.println(e.getMessage());
			
		}finally {
			cI.cerrarConexion();
		}
		
	}

}
