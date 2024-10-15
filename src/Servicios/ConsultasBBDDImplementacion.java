package servicios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import dtos.UsuarioDto;

public class ConsultasBBDDImplementacion  implements ConsultasBBDDInterfaz{

	Connection conexion=null;
	Statement sentencia=null;
	@Override
	public void cargaUsuario() {
		// TODO Auto-generated method stub
		ConexionBBDDInterfaz cI=new ConexionBBDDImplementacion();
	
		try {
			conexion=cI.conectar();
			sentencia=conexion.createStatement();
			//Ejecutamos la consulta SQL
			String sql="SELECT * FROM usuarios";
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
			System.out.println("[INFO] - Ha ocurrido algun error");
			
		}finally {
			cI.cerrarConexion();
		}
	}

}
