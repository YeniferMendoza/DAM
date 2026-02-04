package abstractasInterfacesGestionVehiculos;

public abstract class Vehiculo {
	private String matricula;
	private String modelo;
	private int max_cap;
	
	public Vehiculo(String matricula, String modelo, int max_cap) {
		this.matricula= matricula;
		this.modelo= modelo;
		this.max_cap = max_cap;
	}
	
	public abstract double calcularCostoDeUso(int km);

	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getMax_cap() {
		return max_cap;
	}

	public void setMax_cap(int max_cap) {
		this.max_cap = max_cap;
	}
	
}
