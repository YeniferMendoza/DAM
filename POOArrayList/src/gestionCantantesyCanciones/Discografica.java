package gestionCantantesyCanciones;

import java.util.ArrayList;

public class Discografica {
	private ArrayList<Cantante> cantantes;
	private ArrayList<Cancion> canciones;

	
	public Discografica() {
		this.cantantes = new ArrayList<Cantante>();
		this.canciones = new ArrayList<Cancion>();
	}
	
	public boolean agregarCantante(Cantante cantant) {
		for(Cantante cantante: this.cantantes ) {
			if(cantante.equals(cantant)) {
				return false;
			}
		}
		this.cantantes.add(cantant);
		return true;
	}
	
	public boolean agregarCancion(Cancion canc) {
		for(Cancion cancion: this.canciones ) {
			if(cancion.equals(canc)) {
				return false;
			}
		}
		this.canciones.add(canc);
		return true;
	}
	
	public boolean asignarCancionaCantante(Cancion cancion, Cantante cantante) {
		for(Cancion canc : this.canciones) {
			if(canc.equals(cancion)) {
				return this.cantantes.get(this.cantantes.indexOf(cantante)).añadirCancion(cancion);
			}
		}
		return false;
	}
	
	public ArrayList<Cancion> buscarCancPorGenero(GeneroMusical genero) {
		ArrayList<Cancion> lista = new ArrayList<Cancion>();
		for(Cancion cancion : this.canciones) {
			if(cancion.getGenero().equals(genero)) {
				lista.add(cancion);
			}
		}
		return lista;
	}
	
	public ArrayList<Cancion> cancionesPorCantante(Cantante cantante){
		return this.cantantes.get(this.cantantes.indexOf(cantante)).getListaCanciones();
	}
	
	//Hacer el "mostrar catálogo"//

}
