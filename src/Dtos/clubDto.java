package dtos;

public class ClubDto {

	//Variables
	private long idClub;
	private String nombreClub="aaaaa";
	private String direccionClub="aaaaa";
	private String emailClub="aaaaa";
	private String passwordClub="aaaaa";
	
	//Constructores
	public ClubDto(long idClub, String nombreClub, String direccionClub, String emailClub, String passwordClub) {
		super();
		this.idClub = idClub;
		this.nombreClub = nombreClub;
		this.direccionClub = direccionClub;
		this.emailClub = emailClub;
		this.passwordClub = passwordClub;
	}
	public ClubDto() {
		// TODO Auto-generated constructor stub
	}

	//Getters & Setters
	public long getIdClub() {
		return idClub;
	}
	public void setIdClub(long idClub) {
		this.idClub = idClub;
	}
	public String getNombreClub() {
		return nombreClub;
	}
	public void setNombreClub(String nombreClub) {
		this.nombreClub = nombreClub;
	}
	public String getDireccionClub() {
		return direccionClub;
	}
	public void setDireccionClub(String direccionClub) {
		this.direccionClub = direccionClub;
	}
	public String getEmailClub() {
		return emailClub;
	}

	public void setEmailClub(String emailClub) {
		this.emailClub = emailClub;
	}

	public String getPasswordClub() {
		return passwordClub;
	}

	public void setPasswordClub(String passwordClub) {
		this.passwordClub = passwordClub;
	}
}
