package absGestionDeVehiculosDeBatallaEnUnJuegoDeEstrategia;

public class Barco extends VehiculoJ{
	
	private float carga;

	public Barco(String identificador, String nombre, float resistencia, PoderAtaque ataque, float carga) {
		super(identificador, nombre, resistencia, ataque);
		this.carga= carga;
	}

	public float getCarga() {
		return carga;
	}

	public void setCarga(float carga) {
		this.carga = carga;
	}

}
