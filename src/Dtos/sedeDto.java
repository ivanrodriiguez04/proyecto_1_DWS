package Dtos;

public class sedeDto {

	//Variables
	private long idSede;
	private String nombreSede="aaaaa";
	private String direccionSede="aaaaa";
	private long idClub;
	//Constructores
	public sedeDto(long idSede, String nombreSede, String direccionSede, long idClub) {
		super();
		this.idSede = idSede;
		this.nombreSede = nombreSede;
		this.direccionSede = direccionSede;
		this.idClub = idClub;
	}
	//Getters & Setters
	public long getIdSede() {
		return idSede;
	}
	public void setIdSede(long idSede) {
		this.idSede = idSede;
	}
	public String getNombreSede() {
		return nombreSede;
	}
	public void setNombreSede(String nombreSede) {
		this.nombreSede = nombreSede;
	}
	public String getDireccionSede() {
		return direccionSede;
	}
	public void setDireccionSede(String direccionSede) {
		this.direccionSede = direccionSede;
	}
	public long getIdClub() {
		return idClub;
	}
	public void setIdClub(long idClub) {
		this.idClub = idClub;
	}
	
	
}
