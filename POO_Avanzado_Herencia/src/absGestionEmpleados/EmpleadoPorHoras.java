package absGestionEmpleados;

public class EmpleadoPorHoras extends Empleado{
	
	private int horasTrabajadas;
	private double tarifaPorHoras;
	

	public EmpleadoPorHoras(String nombre, String dni, double salarioB, int horasTrabajadas, double tarifaHoras) {
		super(nombre, dni, salarioB);
		this.horasTrabajadas= horasTrabajadas;
		this.tarifaPorHoras= tarifaHoras;
	}

	@Override
	public double calcularSalarioMensual() {
		return this.horasTrabajadas * this.tarifaPorHoras;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getTarifaPorHoras() {
		return tarifaPorHoras;
	}

	public void setTarifaPorHoras(double tarifaPorHoras) {
		this.tarifaPorHoras = tarifaPorHoras;
	}

}
