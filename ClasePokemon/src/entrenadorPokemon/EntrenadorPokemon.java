package entrenadorPokemon;

import java.time.LocalDate;
import java.util.Random;

import cajaPokemon.CajaPokemon;
import pokemon.Pokemon;
import pokemon.TipoPokemon;

public class EntrenadorPokemon {
	private String nombre;
	private CiudadOrigen ciudad;
	private LocalDate Nacimiento;
	private Pokemon[] equipo;
	private CajaPokemon cajaPk;

	public EntrenadorPokemon() {

	}

	public EntrenadorPokemon(String nombre, CiudadOrigen ciudad, LocalDate Nacimiento, Pokemon[] equipo,
			CajaPokemon cp) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.Nacimiento = Nacimiento;
		this.equipo = equipo;
		this.cajaPk = cp;
	}

	public String toString() {
		return String.format("Nombre: %s\nCiudad: %s\nNacimiento: %s\nEquipo: %s", nombre, ciudad, Nacimiento, equipo);
	}

	public void visitarCentroPokemon() {
		for (Pokemon pokemon : this.equipo) {
			pokemon.curar();
		}
	}

	public boolean agregarPakemon(Pokemon pokemon) {
		for (int i = 0; i < this.equipo.length; i++) {
			if (this.equipo[i] == null) {
				this.equipo[i] = pokemon;
				return true;
			}
		}
		return false;
	}

	public void eliminarPokemon(int numPokemon) {
		this.equipo[numPokemon] = null;
	}

	public int contarDebilitados() {
		int contador = 0;
		for (int i = 0; i < this.equipo.length; i++) {
			if (this.equipo[i].estaDebilitado()) {
				contador++;
			}
		}
		return contador;
	}

	public int contarPorTipo(TipoPokemon tipo) {
		int contador = 0;
		for (Pokemon pokemon : this.equipo) {
			if (pokemon.getTipo() == tipo)
				contador++;
		}
		return contador;
	}

	public void entrenarPokemon(int numPokemon) {
		Random rd = new Random();
		int aleatorio = rd.nextInt(0, 2);
		if (aleatorio == 1) {
			this.equipo[numPokemon].subirNivel();
		}

	}

	public boolean agregarPokemon(int index) {
		for (int i = 0; i < equipo.length; i++) {
			if (this.equipo[i] == null) {
				this.equipo[i] = this.cajaPk.liberarPokemon(index);
				return true;
			}
		}
		return false;
	}

	public void intercambiarPk(int indexCaja, int indexEquipo) {
		this.cajaPk.añadirPokemon(this.equipo[indexEquipo]);
		this.equipo[indexCaja] = this.cajaPk.liberarPokemon(indexCaja);
	}

	public String getNombre() {
		return this.nombre;
	}

	public CiudadOrigen getCiudad() {
		return this.ciudad;
	}

	public LocalDate getNacimoento() {
		return this.Nacimiento;
	}

	public Pokemon[] getEquipo() {
		return this.equipo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCiudad(CiudadOrigen ciudad) {
		this.ciudad = ciudad;
	}

	public void setFecha(LocalDate nacimiento) {
		this.Nacimiento = nacimiento;
	}

	public void setEquipo(Pokemon[] equipo) {
		if (equipo.length <= 6) {
			this.equipo = equipo;
		}
	}

}
