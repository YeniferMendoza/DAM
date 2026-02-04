package abstractasInterfacesGestionVehiculos;

public class Camion extends Vehiculo{
	private final static double  COSTE_km = 0.99;
	private final static double COSTE_TONELADA = 2.99;
	
	private double pesoCarga;

	public Camion(String matricula, String modelo, int max_cap, double pesoCarga) {
		super(matricula, modelo, max_cap);
		this.pesoCarga= pesoCarga;
	}


	@Override
	public double calcularCostoDeUso(int km) {
		return COSTE_km * + km + COSTE_TONELADA * (this.pesoCarga/1000);
	}

	public double getPesoCarga() {
		return pesoCarga;
	}
	
	public void setPesoCarga(double pesoCarga) {
		this.pesoCarga = pesoCarga;
	}
}
