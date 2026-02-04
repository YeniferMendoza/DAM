package cajaPokemon;

import java.util.ArrayList;
import pokemon.Pokemon;
import pokemon.TipoPokemon;

public class CajaPokemon {
	private ArrayList<Pokemon> cajaPk;
	
	public CajaPokemon() {
		cajaPk =  new ArrayList<Pokemon>();
	}
	
	public CajaPokemon(Pokemon...pokemons) {
		for(Pokemon pokemon : pokemons) {
			this.cajaPk.add(pokemon);
		}
	}
	
	public int tamanoCaja() {
		return this.cajaPk.size();
	}
	
	public boolean añadirPokemon(Pokemon pokemon) {
		return this.cajaPk.add(pokemon);
	}
	
	public Pokemon liberarPokemon(int index) {
		return cajaPk.remove(index);
	}
	
	public String mostrarPokemon() {
		String resultado = "";
		for(int i = 0; i < this.cajaPk.size(); i++) {
			resultado+= (i+1)+". "+this.cajaPk.get(i)+", ";
		}
		
		return resultado;
	}
	
	public String infoPokemon(int index) {
		return this.cajaPk.get(index).toString();
	}
	
	public ArrayList<Pokemon> obtenerTipo(TipoPokemon tipo) {
		ArrayList<Pokemon> lista = new ArrayList<>();
		for(Pokemon pokemon: this.cajaPk) {
			if(pokemon.getTipo().equals(tipo)) {
				lista.add(pokemon);
			}
		}
		return lista;
	}
	
	public void ordenarTipo() {
//		if (ascendente) {
			for (int i = 0; i < this.cajaPk.size() - 1; i++) {
				for (int j = 0; j < this.cajaPk.size() - i - 1; j++) {
					if (this.cajaPk.get(j).getTipo().compareTo(cajaPk.get(j + 1).getTipo()) > 0) {
						Pokemon cambio = this.cajaPk.get(j + 1);
						this.cajaPk.set(j + 1, this.cajaPk.get(j));
						this.cajaPk.set(j, cambio);
					}
				}
			}
//		}
//		else {
//			for (int i = 0; i < this.cajaPk.size() - 1; i++) {
//				for (int j = 0; j < this.cajaPk.size() - i - 1; j++) {
//					if (this.cajaPk.get(j).getTipo().compareTo(cajaPk.get(j + 1).getTipo()) <= 0) {
//						Pokemon cambio = this.cajaPk.get(j + 1);
//						this.cajaPk.set(j + 1, this.cajaPk.get(j));
//						this.cajaPk.set(j, cambio);
//					}
//				}
//			}
//		}
	}
	
	public void ordenarNivel(boolean ascendente) {
		if (ascendente) {
			for (int i = 0; i < this.cajaPk.size() - 1; i++) {
				for (int j = 0; j < this.cajaPk.size() - i - 1; j++) {
					if (this.cajaPk.get(j).getNivel() > this.cajaPk.get(j + 1).getNivel()) {
						Pokemon cambio = this.cajaPk.get(j + 1);
						this.cajaPk.set(j + 1, this.cajaPk.get(j));
						this.cajaPk.set(j, cambio);
					}
				}
			}
		}
		else {
			for (int i = 0; i < this.cajaPk.size() - 1; i++) {
				for (int j = 0; j < this.cajaPk.size() - i - 1; j++) {
					if (this.cajaPk.get(j).getNivel() < this.cajaPk.get(j + 1).getNivel()) {
						Pokemon cambio = this.cajaPk.get(j + 1);
						this.cajaPk.set(j + 1, this.cajaPk.get(j));
						this.cajaPk.set(j, cambio);
					}
				}
			}
		}
	}
	
	
	
	
	public ArrayList<Pokemon> getCajaPk(){
		return this.cajaPk;
	}
	public void setCajaPk(ArrayList<Pokemon> cajaPk) {
		this.cajaPk = cajaPk;
	}

}
