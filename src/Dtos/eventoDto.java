package Dtos;

import java.sql.Timestamp;

public class eventoDto {

	//Variable
	private long idEvento;
	private String nombreEvento="aaaaa";
	private Timestamp fechaEvento;
	private Boolean tipoEvento=false;
	private int precioEntrada=0;
	private Boolean esPrivada=false;
	private long idRuta;
	//Constructores
	public eventoDto(long idEvento, String nombreEvento, Timestamp fechaEvento, Boolean tipoEvento, int precioEntrada,
			Boolean esPrivada, long idRuta) {
		super();
		this.idEvento = idEvento;
		this.nombreEvento = nombreEvento;
		this.fechaEvento = fechaEvento;
		this.tipoEvento = tipoEvento;
		this.precioEntrada = precioEntrada;
		this.esPrivada = esPrivada;
		this.idRuta = idRuta;
	}
	//Getters & Setters
	public long getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(long idEvento) {
		this.idEvento = idEvento;
	}
	public String getNombreEvento() {
		return nombreEvento;
	}
	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}
	public Timestamp getFechaEvento() {
		return fechaEvento;
	}
	public void setFechaEvento(Timestamp fechaEvento) {
		this.fechaEvento = fechaEvento;
	}
	public Boolean getTipoEvento() {
		return tipoEvento;
	}
	public void setTipoEvento(Boolean tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	public int getPrecioEntrada() {
		return precioEntrada;
	}
	public void setPrecioEntrada(int precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
	public Boolean getEsPrivada() {
		return esPrivada;
	}
	public void setEsPrivada(Boolean esPrivada) {
		this.esPrivada = esPrivada;
	}
	public long getIdRuta() {
		return idRuta;
	}
	public void setIdRuta(long idRuta) {
		this.idRuta = idRuta;
	}
	
}
