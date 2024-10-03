package Dtos;

public class solicitudDto {

	//Variables
	private long idSolicitud;
	private Boolean estadoSolicitud=false;
	private long idUsuario;
	private long idClub;
	//Constructores
	public solicitudDto(long idSolicitud, Boolean estadoSolicitud, long idUsuario, long idClub) {
		super();
		this.idSolicitud = idSolicitud;
		this.estadoSolicitud = estadoSolicitud;
		this.idUsuario = idUsuario;
		this.idClub = idClub;
	}
	//Getters & Setters
	public long getIdSolicitud() {
		return idSolicitud;
	}
	public void setIdSolicitud(long idSolicitud) {
		this.idSolicitud = idSolicitud;
	}
	public Boolean getEstadoSolicitud() {
		return estadoSolicitud;
	}
	public void setEstadoSolicitud(Boolean estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}
	public long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public long getIdClub() {
		return idClub;
	}
	public void setIdClub(long idClub) {
		this.idClub = idClub;
	}
	
}
