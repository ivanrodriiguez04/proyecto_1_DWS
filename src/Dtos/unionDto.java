package dtos;

/*
 * Clase que contiene los dto de la union
 * 03/10/2024
 * @author irodhan
 */
public class UnionDto {

	//Variables
	private long idUnion;
	private Boolean estadoUnion=false;
	private long idRuta;
	private long idClub;
	private long idUsuario;
	//Constructores
	public UnionDto(long idUnion, Boolean estadoUnion, long idRuta, long idClub, long idUsuario) {
		super();
		this.idUnion = idUnion;
		this.estadoUnion = estadoUnion;
		this.idRuta = idRuta;
		this.idClub = idClub;
		this.idUsuario = idUsuario;
	}
	//Getters & Setters
	public long getIdUnion() {
		return idUnion;
	}
	public void setIdUnion(long idUnion) {
		this.idUnion = idUnion;
	}
	public Boolean getEstadoUnion() {
		return estadoUnion;
	}
	public void setEstadoUnion(Boolean estadoUnion) {
		this.estadoUnion = estadoUnion;
	}
	public long getIdRuta() {
		return idRuta;
	}
	public void setIdRuta(long idRuta) {
		this.idRuta = idRuta;
	}
	public long getIdClub() {
		return idClub;
	}
	public void setIdClub(long idClub) {
		this.idClub = idClub;
	}
	public long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
	
}
