package dtos;

/*
 * CLase que contiene toda la informacion de las motos
 * 02/10/2024
 * @author irodhan
 */
public class motoDto {

	//Variables
	private long idMoto;
	private String marcaMoto="aaaaa";
	private String modeloMoto="aaaaa";
	private String colorMoto="aaaaa";
	private String matriculaMoto="aaaaa";
	private long idUsuario;
	
	//Constructores
	public motoDto(long idMoto, String marcaMoto, String modeloMoto, String colorMoto, String matriculaMoto,
			long idUsuario) {
		super();
		this.idMoto = idMoto;
		this.marcaMoto = marcaMoto;
		this.modeloMoto = modeloMoto;
		this.colorMoto = colorMoto;
		this.matriculaMoto = matriculaMoto;
		this.idUsuario = idUsuario;
	}

	//Getters & Setters
	public long getIdMoto() {
		return idMoto;
	}

	public void setIdMoto(long idMoto) {
		this.idMoto = idMoto;
	}

	public String getMarcaMoto() {
		return marcaMoto;
	}

	public void setMarcaMoto(String marcaMoto) {
		this.marcaMoto = marcaMoto;
	}

	public String getModeloMoto() {
		return modeloMoto;
	}

	public void setModeloMoto(String modeloMoto) {
		this.modeloMoto = modeloMoto;
	}

	public String getColorMoto() {
		return colorMoto;
	}

	public void setColorMoto(String colorMoto) {
		this.colorMoto = colorMoto;
	}

	public String getMatriculaMoto() {
		return matriculaMoto;
	}

	public void setMatriculaMoto(String matriculaMoto) {
		this.matriculaMoto = matriculaMoto;
	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
}
