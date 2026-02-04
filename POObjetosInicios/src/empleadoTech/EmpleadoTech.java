package empleadoTech;

import java.time.LocalDate;

public class EmpleadoTech {
	private String nombre;
	private String apellidos;
	private LocalDate fechaNac;
	private Departamento departamento;
	private float sueldo;
	private float IRPF;
	private EmpleadoTech supervisor;

	public EmpleadoTech(String nombre, String apellidos, LocalDate fechaNac, Departamento departamento, float sueldo,
			float IRPF, EmpleadoTech supervisor) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNac = fechaNac;
		this.departamento = departamento;
		this.sueldo = sueldo;
		this.IRPF = IRPF;
		this.supervisor = supervisor;
	}

	public float sueldoNetoMensual() {
		return (this.sueldo / 12) * ((100 - this.IRPF) / 100);
	}

	public String toString() {
		return String.format(
				"Nombre: %s\nApellidos; %s\nFecha de nacimiento: %s\nDepartamento: %s\nSueldo: %s\nIRPF: %s\nSupervisor: %s",
				this.nombre, this.apellidos, this.fechaNac, this.departamento, this.sueldo, this.IRPF, this.supervisorToString());
//				this.nombre, this.apellidos, this.fechaNac, this.departamento, this.sueldo, this.IRPF, this.supervisor==null ? "" : this.supervisor.getNombre()+" "+this.supervisor.getApellidos());

	}

	private String supervisorToString() {
		if(this.tieneSupervisor()) {
			return this.supervisor.getNombre()+" "+this.supervisor.getApellidos();
		}
		return "No tiene";
	}

	public boolean tieneSupervisor() {
		return this.supervisor != null;
	}


	/**
	 * Método que devuelve el máximo supervisor
	 * @param EmpleadoTech del que se quiere obtener el maxSupervisor
	 * @return Objeto EmpleadoTech máximo supervisor
	 */
	public static EmpleadoTech maxSupervisor(EmpleadoTech e) {
		if (e.supervisor == null)
			return e;
		else
			return maxSupervisor(e.supervisor);
	}

	public EmpleadoTech maxSupervisor() {
		EmpleadoTech e = this;
		while (e.supervisor != null) {
			e = e.supervisor;
		}
		return e;
	}
	
	/*
	 * Método igual que maxSupervisor() pero implementando lógica recursiva.
	 */
//	public EmpleadoTech maxSupervisor2() {
//		EmpleadoTech e = this;
//		if(e.supervisor != null) 
//			return e;
//		return e.supervisor.maxSupervisor2();
//	}

	public void subirSueldo(double incremento) {
		this.sueldo += incremento;
		if (this.tieneSupervisor()) {
			this.supervisor.subirSueldo(incremento * 0.25);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public float getIRPF() {
		return IRPF;
	}

	public void setIRPF(float iRPF) {
		IRPF = iRPF;
	}

	public EmpleadoTech getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(EmpleadoTech supervisor) {
		this.supervisor = supervisor;
	}

}
