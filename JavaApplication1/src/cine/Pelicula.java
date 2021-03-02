package cine;

public class Pelicula {
	
	private String nombre;
	private Categoria categoria;
	private String descripcion;
	private String duracion;
	private String año;
	private Idioma idioma;
	private Integer resticcionEdad;
	private Boolean estado;
	private Formato formato;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public String getAño() {
		return año;
	}
	public void setAño(String año) {
		this.año = año;
	}
	public Idioma getIdioma() {
		return idioma;
	}
	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}
	public Integer getResticcionEdad() {
		return resticcionEdad;
	}
	public void setResticcionEdad(Integer resticcionEdad) {
		this.resticcionEdad = resticcionEdad;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public Formato getFormato() {
		return formato;
	}
	public void setFormato(Formato formato) {
		this.formato = formato;
	}

}


