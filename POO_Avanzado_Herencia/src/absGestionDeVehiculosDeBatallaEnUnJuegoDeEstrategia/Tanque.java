package absGestionDeVehiculosDeBatallaEnUnJuegoDeEstrategia;

public class Tanque extends VehiculoJ {
	
	private boolean canionAn;

	public Tanque(String identificador, String nombre, float resistencia, PoderAtaque ataque, boolean canionAn ) {
		super(identificador, nombre, resistencia, ataque);
		this.canionAn = canionAn;
		
	}

	public boolean getCanionAn() {
		return canionAn;
	}

	public void setCanionAn(boolean canionAn) {
		this.canionAn = canionAn;
	}

}
