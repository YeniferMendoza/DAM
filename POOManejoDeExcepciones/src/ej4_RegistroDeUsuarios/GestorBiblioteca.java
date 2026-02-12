package ej4_RegistroDeUsuarios;

import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

import excepcionesPersonalizadas.MaterialDuplicadoException;
import excepcionesPersonalizadas.MaterialNoEncontradoException;
import excepcionesPersonalizadas.MaterialNoPrestadoException;
import excepcionesPersonalizadas.MaterialYaPrestadoException;

public class GestorBiblioteca {

	private List<Material> lista;

	public GestorBiblioteca() {
		lista = new ArrayList<Material>();
	}

	public GestorBiblioteca(ArrayList<Material> lista) {
		this.lista = lista;
	}

	public GestorBiblioteca(Material... material) {
		for (Material m : material) {
			this.lista.add(m);
		}
	}

	public boolean añadirNuevo(Material material) throws MaterialDuplicadoException {
		for (Material m : lista) {
			if (m.equals(material)) {
				throw new MaterialDuplicadoException(material);
			}
		}
		this.lista.add(material);
		return true;
	}

	public void eliminar(Material material) throws MaterialNoEncontradoException {
		for (Material m : lista) {
			if (m.equals(material)) {
				throw new MaterialNoEncontradoException(material);
			}
		}
		System.out.println("Se he eliminado correctamente.");
	}

	public Material buscarIde(UUID id) throws MaterialNoEncontradoException {
		for (Material m : lista) {
			if (id.equals(m.getId())) {
				return m;
			}
		}
		throw new MaterialNoEncontradoException(null);
	}

	public void filtrarCaracteristica(String creador) {
		ArrayList<Material> list = new ArrayList<Material>();
		for (Material m : this.lista) {
			if (m instanceof Libro) {
				if (creador.equals(((Libro) m).getAutor())) {
					list.add(m);
				}
			} else if (m instanceof Pelicula) {
				if (creador.equals(((Pelicula) m).getDirector())) {
					list.add(m);
				}
			}
		}
	}

	//podía hacerce con el try catch
	public void prestarDisponible(Material m){
		try {
			m.prestar();
			System.out.println("Se ha prestado correctamente.");
		} catch (MaterialYaPrestadoException e) {
			System.out.println(e.getMessage());
		}
	}

	public void devolverPrestado(Material m){
		try {
			m.devolver();
			System.out.println("Se ha devuelto correctamente.");
		} catch (MaterialNoPrestadoException e) {
			System.out.println(e.getMessage());
		}

	}

}
