package dtos;

public class ClubDto {

	//Variables
	private long idClub;
	private String nombreClub="aaaaa";
	private String direccionClub="aaaaa";
	private long idRuta;
	private long idEvento;
	
	//Constructores
	public ClubDto(long idClub, String nombreClub, String direccionClub, long idRuta, long idEvento) {
		super();
		this.idClub = idClub;
		this.nombreClub = nombreClub;
		this.direccionClub = direccionClub;
		this.idRuta = idRuta;
		this.idEvento = idEvento;
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
	public long getIdRuta() {
		return idRuta;
	}
	public void setIdRuta(long idRuta) {
		this.idRuta = idRuta;
	}
	public long getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(long idEvento) {
		this.idEvento = idEvento;
	}
	
}
