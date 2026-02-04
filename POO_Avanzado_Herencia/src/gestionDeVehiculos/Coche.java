package gestionDeVehiculos;

public class Coche extends Vehiculo {
	private int numPuertas;
	private boolean esElectrico;

	public Coche(String marca, String modelo, int anio, String matricula, int numPuertas, boolean esElectrico) {
		super(marca, modelo, anio, matricula);
		this.numPuertas = numPuertas;
		this.esElectrico = esElectrico;
	}

	@Override
	public String toString() {
		return super.toString().concat(
				String.format("Número de puertas: %s.\nEs eléctrico: %s.\n\n", this.numPuertas, this.esElectrico));
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public boolean isEsElectrico() {
		return esElectrico;
	}

	public void setEsElectrico(boolean esElectrico) {
		this.esElectrico = esElectrico;
	}

}
