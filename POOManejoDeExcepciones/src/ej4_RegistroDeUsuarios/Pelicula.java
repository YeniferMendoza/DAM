package ej4_RegistroDeUsuarios;


public class Pelicula extends Material{
	
	private String director;
	private float duracion;
	
	public Pelicula(String titulo, String director, float duracion) {
		super(titulo);
		this.director= director;
		this.duracion= duracion;
	}
	

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public float getDuracion() {
		return duracion;
	}

	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}

	
	


}
