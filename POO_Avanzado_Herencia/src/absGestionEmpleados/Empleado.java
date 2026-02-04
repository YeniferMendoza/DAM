package absGestionEmpleados;

public abstract class Empleado {
	protected String nombre;
	protected String dni;
	protected double salarioB;
	
	public Empleado(String nombre, String dni, double salarioB) {
		this.nombre= nombre;
		this.dni= dni;
		this.salarioB = salarioB;
	}
	
	public abstract double calcularSalarioMensual();
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getSalarioB() {
		return salarioB;
	}

	public void setSalarioB(double salarioB) {
		this.salarioB = salarioB;
	}
	
	
}
