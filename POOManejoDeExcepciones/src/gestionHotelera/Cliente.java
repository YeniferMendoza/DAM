package gestionHotelera;

import java.util.UUID;

public class Cliente {
	private UUID id;
	private String dni;
	private String nombre;
	private String apellido;
	private int tel;
	
	public Cliente(String nombre, String apellido, int tel, String dni) {
		this.id= UUID.randomUUID();
		this.nombre= nombre;
		this.apellido = apellido;
		this.tel= tel;
		this.dni = dni;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Cliente))
			return false;
		Cliente other = (Cliente) obj;
		return dni.equals(other.dni);
	}




	public UUID getId() {
		return id;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	

}
