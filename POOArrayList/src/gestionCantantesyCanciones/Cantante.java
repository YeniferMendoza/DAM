package gestionCantantesyCanciones;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cantante {
	private String nombre;
	private LocalDate fechaNac;
	private GeneroMusical genero;
	private ArrayList<Cancion> listaCanciones;
	
	public Cantante(String nombre, LocalDate fechaNac, GeneroMusical genero) {
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.genero = genero;
		this.listaCanciones = new ArrayList<Cancion>();
	}
	
	public boolean añadirCancion(Cancion cancion) {
		return this.listaCanciones.add(cancion);
	}
	
	public String mostrarCanciones() {
		return this.listaCanciones.toString();
	}
	
	public int numeroCanciones() {
		return this.listaCanciones.size();
	}

	public String toString() {
		return String.format(
				"Nombre: %s\nFecha de nacimiento: %s\nGenero Musical: %s\nLista de canciones: %s\n",
				this.nombre, this.fechaNac, this.genero, this.listaCanciones);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public GeneroMusical getGenero() {
		return genero;
	}

	public void setGenero(GeneroMusical genero) {
		this.genero = genero;
	}

	public ArrayList<Cancion> getListaCanciones() {
		return listaCanciones;
	}

	public void setListaCanciones(ArrayList<Cancion> listaCanciones) {
		this.listaCanciones = listaCanciones;
	}
	
	

}
