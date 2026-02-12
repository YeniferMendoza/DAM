package registroDeUsuarios;

import excepcionesPersonalizadas.CorreoInvalidoException;
import excepcionesPersonalizadas.EdadInvalidaException;
import excepcionesPersonalizadas.NombreInvalidoException;

public class Usuario {
	private String nombre;
	private int edad;
	private String correo;
	
	public Usuario(String nombre, int edad, String correo)
			throws NombreInvalidoException, EdadInvalidaException, CorreoInvalidoException {
		if(!comNombre(nombre)) {
			throw new NombreInvalidoException(nombre);	
		}
		if(!comEdad(edad)) {
			throw new EdadInvalidaException(edad);	
		}
		if(!comCorreo(correo)) {
			throw new CorreoInvalidoException(correo);	
		}
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;

	}
	
	private static boolean comNombre(String nombre) {
		return !nombre.isBlank()|| nombre.matches("[a-zA-Z]*");
	}
	
	private static boolean comEdad(int edad) {
		return edad > 18;
	}
	
	private static boolean comCorreo(String correo) {
		return correo.matches("[a-zA-Z0-9]*");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	

}
