package baraja;

import java.util.ArrayList;
import java.util.Random;

import carta.Carta;
import carta.Palo;

public class Baraja {
	private ArrayList<Carta> baraja;

	// Método baraja utiliza la lógica de inicializar llamando al método.
	public Baraja() {
		this.baraja = new ArrayList<Carta>();
		inicializar();
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 12; j++) {
//				switch (i) {
//					case 0: {
//						baraja.add(new Carta(Palo.OROS, j));
//					}
//					case 1: {
//						baraja.add(new Carta(Palo.ESPADAS, j));
//					}
//					case 2: {
//						baraja.add(new Carta(Palo.BASTOS, j));
//					}
//					case 3: {
//						baraja.add(new Carta(Palo.COPAS, j));
//					}
//				}
//			}
//		}

	}

	public void barajar() {
//		Collections.shuffle(this.baraja);
		Random rd = new Random();
		for (int i = 0; i < this.baraja.size(); i++) {
			Carta carta = this.baraja.remove(rd.nextInt(0, this.baraja.size()));
			this.baraja.add(0,carta);
		}
	}

	public Carta robar() {
		Carta carta = this.baraja.get(0);
		this.baraja.remove(0);
		return carta;
	}

	public boolean insertar(Carta nuevaCarta) {
		for (Carta carta : baraja) {
			if (carta.equals(nuevaCarta)) {
				return false;
			}
		}
		return baraja.add(nuevaCarta);
	}

	public void ordenar(boolean ascendente) {
		if (ascendente) {
//			this.baraja.sort(Comparator.comparing(Carta::getNumero));
////			this.baraja.sort(Comparator.comparing(Carta::getPalo).thenComparing(Carta::getNumero));
			for (int i = 0; i < this.baraja.size() - 1; i++) {
				for (int j = 0; j < this.baraja.size() - i - 1; j++) {
					if (this.baraja.get(j).getNumero() > this.baraja.get(j + 1).getNumero()) {
						Carta cambio = this.baraja.get(j + 1);
						this.baraja.set(j + 1, this.baraja.get(j));
						this.baraja.set(j, cambio);
					}
				}
			}
		} else {
//			this.baraja.sort(Comparator.comparing(Carta::getNumero).reversed());
			for (int i = 0; i < this.baraja.size() - 1; i++) {
				for (int j = 0; j < this.baraja.size() - i - 1; j++) {
					if (this.baraja.get(j).getNumero() < this.baraja.get(j + 1).getNumero()) {
						Carta cambio = this.baraja.get(j + 1);
						this.baraja.set(j + 1, this.baraja.get(j));
						this.baraja.set(j, cambio);
					}
				}
			}
		}
	}

	public void inicializar() {
		this.baraja.clear();
		for (Palo p : Palo.values()) {
			for (int i = 1; i <= 12; i++) {
				baraja.add(new Carta(p, i));
			}
		}
	}

	public String toString() {
		String retorno = "";
		for (Carta carta : this.baraja) {
			retorno += carta + "\n";
		}
		return retorno;
	}

	public boolean buscarCarta(Carta nuevaCarta) {
		for (Carta carta : this.baraja) {
			if (carta.equals(nuevaCarta)) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Carta> repartir(int numero) {
		ArrayList<Carta> resultado;
		if (this.baraja.size() <= numero) {
			resultado = baraja;
		} else {
			resultado = new ArrayList<Carta>(this.baraja.subList(0, numero));
		} 
		for (Carta carta : resultado) {
			this.baraja.remove(carta);
		}
		return resultado;
	}

	public ArrayList<Carta> getCarta() {
		return this.baraja;
	}

	public void setCarta(ArrayList<Carta> baraja) {
		this.baraja = baraja;
	}

}
