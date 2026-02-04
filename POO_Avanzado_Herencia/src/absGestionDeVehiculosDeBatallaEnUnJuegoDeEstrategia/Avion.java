package absGestionDeVehiculosDeBatallaEnUnJuegoDeEstrategia;

public class Avion extends VehiculoJ{
	
	private int misiles;

	public Avion(String identificador, String nombre, float resistencia, PoderAtaque ataque, int misiles) {
		super(identificador, nombre, resistencia, ataque);
		this.misiles= misiles;
	}

	public int getMisiles() {
		return misiles;
	}

	public void setMisiles(int misiles) {
		this.misiles = misiles;
	}

}
