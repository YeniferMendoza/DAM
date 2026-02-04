package absCaballeroMarronesyMasmorras;

import absMarronesyMasmorras.Personaje;

public class Caballero extends Personaje{
	private Corte corte;
	private Arma arma;

	public Caballero(String nombre, int saludmax, int attack, int defensa, Corte corte) {
		super(nombre, saludmax, attack, defensa);
		this.corte= corte;
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subirNivel() {
		// TODO Auto-generated method stub
		
	}

	public Corte getCorte() {
		return corte;
	}

	public void setCorte(Corte corte) {
		this.corte = corte;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}
	

}
