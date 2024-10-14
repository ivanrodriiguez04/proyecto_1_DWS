package dtos;

import java.sql.Timestamp;

public class RutaDto {

	//Variables
	private long idRuta;
	private String nombreRuta="aaaaa";
	private int distaciaRuta=0;
	private String codigoRuta="aaaaa";
	private Boolean esPrivada=false; 
	private Timestamp horaInicioRuta;
	private Timestamp horaFinRuta;
	
	//Constructores
	public RutaDto(long idRuta, String nombreRuta, int distaciaRuta, String codigoRuta, Boolean esPrivada,
			Timestamp horaInicioRuta, Timestamp horaFinRuta) {
		super();
		this.idRuta = idRuta;
		this.nombreRuta = nombreRuta;
		this.distaciaRuta = distaciaRuta;
		this.codigoRuta = codigoRuta;
		this.esPrivada = esPrivada;
		this.horaInicioRuta = horaInicioRuta;
		this.horaFinRuta = horaFinRuta;
	}
	//Getters & Setters
	public long getIdRuta() {
		return idRuta;
	}
	public void setIdRuta(long idRuta) {
		this.idRuta = idRuta;
	}
	public String getNombreRuta() {
		return nombreRuta;
	}
	public void setNombreRuta(String nombreRuta) {
		this.nombreRuta = nombreRuta;
	}
	public int getDistaciaRuta() {
		return distaciaRuta;
	}
	public void setDistaciaRuta(int distaciaRuta) {
		this.distaciaRuta = distaciaRuta;
	}
	public String getCodigoRuta() {
		return codigoRuta;
	}
	public void setCodigoRuta(String codigoRuta) {
		this.codigoRuta = codigoRuta;
	}
	public Boolean getEsPrivada() {
		return esPrivada;
	}
	public void setEsPrivada(Boolean esPrivada) {
		this.esPrivada = esPrivada;
	}
	public Timestamp getHoraInicioRuta() {
		return horaInicioRuta;
	}
	public void setHoraInicioRuta(Timestamp horaInicioRuta) {
		this.horaInicioRuta = horaInicioRuta;
	}
	public Timestamp getHoraFinRuta() {
		return horaFinRuta;
	}
	public void setHoraFinRuta(Timestamp horaFinRuta) {
		this.horaFinRuta = horaFinRuta;
	}
	
}
