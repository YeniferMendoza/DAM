package abstractasInterfacesGestionVehiculos;

public class Autobus extends Vehiculo {
	private final static double COSTE_km = 1.19;
	private final static double  COSTE_PASAJERO = 20;
	
	private int numPasajero;

	public Autobus(String matricula, String modelo, int max_cap, int numPasajero) {
		super(matricula, modelo, max_cap);
		this.numPasajero= numPasajero;
	
	}

	@Override
	public double calcularCostoDeUso(int km) {
		return COSTE_km * km + COSTE_PASAJERO * this.numPasajero;
	}

	public int getNumPasajero() {
		return numPasajero;
	}
	
	public void setNumPasajero(int numPasajero) {
		this.numPasajero = numPasajero;
	}
}
