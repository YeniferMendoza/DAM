package gestionCantantesyCanciones;

import java.util.ArrayList;

public class Cancion {
	private String titulo;
	private GeneroMusical genero;
	private float duracion;
	private ArrayList<Cantante> listaCant; 
	
	public Cancion(String titulo, GeneroMusical genero, float duracion) {
		this.titulo = titulo;
		this.genero = genero;
		this.duracion= duracion;
		listaCant = new ArrayList<Cantante>();
	}
	
	public Cancion() {
		
	}
	
	public boolean asociarCantante(Cantante cantante) {
		return this.listaCant.add(cantante);
	}
	
	public String mostrarCantantes() {
		return this.listaCant.toString();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public GeneroMusical getGenero() {
		return genero;
	}

	public void setGenero(GeneroMusical genero) {
		this.genero = genero;
	}

	public float getDuracion() {
		return duracion;
	}

	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}

	public ArrayList<Cantante> getListaCant() {
		return listaCant;
	}

	public void setListaCant(ArrayList<Cantante> listaCant) {
		this.listaCant = listaCant;
	}
	

}
