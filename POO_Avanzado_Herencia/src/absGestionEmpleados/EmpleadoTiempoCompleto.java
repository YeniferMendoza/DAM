package absGestionEmpleados;

public class EmpleadoTiempoCompleto extends Empleado{
	
	private int antiguedad;

	public EmpleadoTiempoCompleto(String nombre, String dni, double salarioB, int antiguedad) {
		super(nombre, dni, salarioB);
		this.antiguedad = antiguedad;
	}

	@Override
	public double calcularSalarioMensual() {
		if(this.antiguedad > 5) {
			return (this.salarioB * 0.10);
		}
		return this.salarioB;
	}
	
	
	public int getAntiguedad() {
		return antiguedad;
	}
	
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

}
