package gestionDeVehiculos;

public class Vehiculo {
	protected String marca;
	protected String modelo;
	protected int anio;
	protected String matricula;

	public Vehiculo(String marca, String modelo, int anio, String matricula) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.matricula = matricula;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Vehiculo)) {
			return false;
		}
		Vehiculo v = (Vehiculo) obj;
		return this.matricula.equals(v.matricula);
	}

	public String toString() {
		return String.format("Marca: %s.\nModelo: %s.\nAño: %s.\nMatrícula: %s.\n", this.marca, this.modelo, this.anio,
				this.matricula);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
