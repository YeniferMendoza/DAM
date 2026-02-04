package absGestionDeVehiculosDeBatallaEnUnJuegoDeEstrategia;


public enum PoderAtaque {
	
	ALTO(5), MEDIO(3), BAJO(1);
	
	private int pAtaque;
	
	private PoderAtaque(int pAtaque) {
		this.pAtaque= pAtaque;
	}

	public int getPAtaque() {
		return pAtaque;
	}
	
	
	
//	public int poderResta(){
//		if(this.equals(PoderAtaque.ALTO)) {
//			return 5;
//		}
//		else if(this.equals(PoderAtaque.MEDIO)) {
//			return 3;
//		}
//		return 1;
//	}

}

