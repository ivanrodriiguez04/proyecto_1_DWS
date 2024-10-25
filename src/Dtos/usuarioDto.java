package dtos;

/*
 * CLase que contiene toda la informacion de los usuarios
 * 02/10/2024
 * @author irodhan
 */
public class UsuarioDto {

	//Variables
	private long idUsuario;
	private String nombreUsuario="aaaaa";
	private String apellidosUsuario="aaaaa";
	private int telefonoUsuario=0;
	private String dniUsuario="aaaaa";
	private String emailUsuario="aaaaa";
	private String passwordUsuario="aaaaa";
	
	//Constructores
	public UsuarioDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsuarioDto(long idUsuario, String nombreUsuario, String apellidosUsuario, int telefonoUsuario,
			String dniUsuario, String emailUsuario, String passwordUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.apellidosUsuario = apellidosUsuario;
		this.telefonoUsuario = telefonoUsuario;
		this.dniUsuario = dniUsuario;
		this.emailUsuario = emailUsuario;
		this.passwordUsuario = passwordUsuario;
	}

	//Getters & Setters
	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApellidosUsuario() {
		return apellidosUsuario;
	}

	public void setApellidosUsuario(String apellidosUsuario) {
		this.apellidosUsuario = apellidosUsuario;
	}

	public int getTelefonoUsuario() {
		return telefonoUsuario;
	}

	public void setTelefonoUsuario(int telefonoUsuario) {
		this.telefonoUsuario = telefonoUsuario;
	}

	public String getDniUsuario() {
		return dniUsuario;
	}

	public void setDniUsuario(String dniUsuario) {
		this.dniUsuario = dniUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
	public String getPasswordUsuario() {
		return passwordUsuario;
	}

	public void setPasswordUsuario(String passwordUsuario) {
		this.passwordUsuario = passwordUsuario;
	}
}
