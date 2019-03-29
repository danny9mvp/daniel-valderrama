package models;

public class Contacto {
	private String primerNombre;
	private String segundoNombre;
	private String email;
	private String asunto;
	private String comentario;
	
	public Contacto(String primerNombre, String segundoNombre, String email, String asunto, String comentario) {
		super();
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.email = email;
		this.asunto = asunto;
		this.comentario = comentario;
	}

	public Contacto() {
		// TODO Auto-generated constructor stub
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
}
