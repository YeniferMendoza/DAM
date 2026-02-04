package jugadorDeCartas;

import java.util.ArrayList;

import baraja.Baraja;
import carta.Carta;

public class JugadorDeCartas {
	private static Baraja barajaComun;
	private ArrayList<Carta> mano;
	
	
	public JugadorDeCartas(ArrayList<Carta> mano, Baraja barajaComun)  {
		this.mano= mano;
		JugadorDeCartas.barajaComun = barajaComun;
	}
	
	public void robarCarta() {
		this.mano.add(JugadorDeCartas.barajaComun.robar());
	}
	
	public int numCartas() {
		return this.mano.size();
	}
	
	public Carta jugarCarta(int index) {
		if(index > 0 && index < this.numCartas()) {
			return this.mano.remove(index);
		}
		return null;
	}
	
	public Carta jugarCarta(Carta carta) {
		return this.jugarCarta(this.mano.indexOf(carta));
	}
	
	public String toString() {
//		return this.mano.toString();
		String retorno = "";
		for(Carta carta : this.mano)
			retorno+=carta;
		return retorno;
	}
	
	public void descartarCarta(Carta carta) {
		this.mano.remove(carta);
	}
	
	
	public ArrayList<Carta> getMano(){
		return this.mano;
	}
	public void setMano(ArrayList<Carta> mano) {
		this.mano = mano;
	}
	public Baraja getBarajaComun() {
		return JugadorDeCartas.barajaComun;
	}
	public void setBarajaComun(Baraja barajaComun) {
		JugadorDeCartas.barajaComun = barajaComun;
	}
	

}
