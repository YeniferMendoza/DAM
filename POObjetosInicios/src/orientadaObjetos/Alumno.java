package orientadaObjetos;

public class Alumno {
	private String nia;
	private String nombre;
	private String apellido;
	private int curso;
	private boolean aprobado;
	
	public Alumno(String nia, String nombre, String apellido) {
		this.nia = nia;
		this.nombre = nombre;
		this.apellido = apellido;
		this.curso= 1;
		this.aprobado= false;
		
	}
	public String getnia() {
		return this.nia;
		
	}
	public String getnombre() {
		return this.nombre;
		
	}
	public String getapellido() {
		return this.apellido;
		
	}
	public int getcurso() {
		return this.curso;
		
	}
	public boolean getaprobado() {
		return this.aprobado;
		
	}
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setapellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setcurso(int curso) {
		this.curso = curso;
	}
	
	public void setaprobado(boolean aprobado) {
		this.aprobado= aprobado;
	}
	public String toString() {
		return this.nombre +  "" + this.apellido;
	}
	
	
	
	

}
