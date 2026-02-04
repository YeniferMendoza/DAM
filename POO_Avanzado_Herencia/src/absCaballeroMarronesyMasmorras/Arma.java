package absCaballeroMarronesyMasmorras;

public enum Arma {
	LANZA(10,5), ESPADA(20,10), ESCUDO(0,20);
	
	private int ataque;
	private int defensa;
	
	private Arma(int ataque, int defensa) {
		this.ataque= ataque;
		this.defensa= defensa;
	}

	public int getAtaque() {
		return ataque;
	}

	public int getDefensa() {
		return defensa;
	}
	
	

}
