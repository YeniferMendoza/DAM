package grimorioDeHechizos;

import java.util.ArrayList;

public class Grimorio {
	private ArrayList<HechizoElemental> grimorio;
	
	public Grimorio() {
		this.grimorio = new ArrayList<HechizoElemental>();
	}
	
	public Grimorio(ArrayList<HechizoElemental> grimorio) {
		this.grimorio = grimorio;
	}
	
	public Grimorio(HechizoElemental... elementals) {
		this.grimorio = new ArrayList<HechizoElemental>();
		for (HechizoElemental elemental:elementals) {
			this.grimorio.add(elemental);
		}
	}
	
	public boolean agregarHechizo(ArrayList<HechizoElemental> h) {
		return this.grimorio.addAll(h);
	}
	public boolean agregarHechizo(HechizoElemental h) {
		return this.grimorio.add(h);
	}
	
	public String toString() {
		String hechizo = "";
		for(HechizoElemental h: this.grimorio) {
			hechizo += h.toString() + "\n";
		}
		return hechizo;
	}
	
	public void buscarInvocar(String nombre) {
		for(HechizoElemental h: this.grimorio) {
			if(h.getNombre().equals(nombre)) {
				h.cast();
			}
		}
	}
	
	public ArrayList<HechizoElemental> filtrar(String tipo) throws ClassNotFoundException{
		ArrayList<HechizoElemental> lista = new ArrayList<HechizoElemental>();
		for(HechizoElemental h : this.grimorio) {
			if(h.getClass().equals(Class.forName(tipo))) {
				lista.add(h);
			}
		}
		return lista;
	}
	

	public ArrayList<HechizoElemental> getGrimorio() {
		return grimorio;
	}

	public void setGrimorio(ArrayList<HechizoElemental> grimorio) {
		this.grimorio = grimorio;
	}

}
