package gestionHotelera;

import java.util.UUID;

public class Cliente {
	private UUID id;
	private String nombre;
	private String apellido;
	private int tel;
	
	public Cliente(UUID id, String nombre, String apellido, int tel) {
		this.id= id;
		this.nombre= nombre;
		this.apellido = apellido;
		this.tel= tel;
	}

	public UUID getDni() {
		return id;
	}

	public void setDni(UUID id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}
	

}
