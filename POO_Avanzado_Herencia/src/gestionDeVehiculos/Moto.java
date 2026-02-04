package gestionDeVehiculos;

public class Moto extends Vehiculo {
	private int cilindrada;
	private String tipo;

	public Moto(String marca, String modelo, int anio, String matricula, int cilindrada, String tipo) {
		super(marca, modelo, anio, matricula);
		this.cilindrada = cilindrada;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString().concat(
				String.format("Cilindrada: %s.\nTipo: %s.\n\n", this.cilindrada, this.tipo));
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
