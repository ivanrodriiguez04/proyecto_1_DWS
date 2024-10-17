package servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import dtos.UsuarioDto;

public class GestionUsuarioImplementacion implements GestionUsuarioInterfaz{
	Scanner sc = new Scanner(System.in);
	ConexionBBDDInterfaz cI=new ConexionBBDDImplementacion();
	ConsultasBBDDInterfaz consultas=new ConsultasBBDDImplementacion();
	public void darAltaUsuario() {
		// TODO Auto-generated method stub
		consultas.cargaUsuario();
		UsuarioDto nuevoUsuario= crearUsuario();
		String sql="INSERT INTO club_motos.usuarios (idusuario,nombreusuario,apellidosusuario,telefonousuario,dniusuario,emailusuario) VALUES (?,?,?,?,?,?)";
		try {
			Connection conexion=cI.conectar();
			PreparedStatement sentencia=conexion.prepareStatement(sql);
			
			sentencia.setLong(1, nuevoUsuario.getIdUsuario());
			sentencia.setString(2, nuevoUsuario.getNombreUsuario());
			sentencia.setString(3, nuevoUsuario.getApellidosUsuario());
			sentencia.setInt(4, nuevoUsuario.getTelefonoUsuario());
			sentencia.setString(5, nuevoUsuario.getDniUsuario());
			sentencia.setString(6, nuevoUsuario.getEmailUsuario());
			
			int filasInsertadas=sentencia.executeUpdate();
			if(filasInsertadas>0) {
				System.out.println("[INFO] - Insertcion exitosa");
			}

		}catch(SQLException e) {
			System.err.println("[INFO] - Ha ocurrido un error.");
			System.out.println(e.getMessage());
		}
	}
	/*
	 * Metodo que crea un objeto usuario y pide la informacion necesaria al usuario
	 * 15/10/2024
	 * @author irodhan
	 */
	private UsuarioDto crearUsuario() 
	{
		UsuarioDto nuevoUsuario= new UsuarioDto();
		String apellido1,apellido2;
		nuevoUsuario.setIdUsuario(util.Utilidades.asignarIdUsuario());;
		System.out.println("Introduzca su nombre:");
		nuevoUsuario.setNombreUsuario(sc.next());
		System.out.println("Introduzca su primer apellido:");
		apellido1=sc.next();
		System.out.println("Introduzca su segundo apellido:");
		apellido2=sc.next();
		System.out.println("Introduzca su DNI: ");
		nuevoUsuario.setDniUsuario(sc.next());
		System.out.println("Introduzca su número telefónico:");
		nuevoUsuario.setTelefonoUsuario(sc.nextInt());
		System.out.println("Introduzaca su email: ");
		nuevoUsuario.setEmailUsuario(sc.next());
		nuevoUsuario.setApellidosUsuario(apellido1+" "+apellido2);
		return nuevoUsuario;
	}
}
