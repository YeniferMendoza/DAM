package HospitalFelinoModelo;

import java.time.LocalDate;

import hospitalFelino.Types.TipoGato;


public class Gato {
	protected static int contador = 0;
	protected String id;
	protected String nombre;
	protected String contacto;
	protected String telefono;
	protected LocalDate fechaNac;
	protected TipoGato tipo;
	
	
	public Gato(String nombre, String contacto, String telefono, LocalDate fechaNac, TipoGato tipo) {
		if(!(this instanceof Chausie)&& !(this instanceof Persa)&& !(this instanceof Ocicat)) {
			this.id = "Gato"+Integer.toString(contador++);
		}
		this.nombre = nombre;
		this.contacto = contacto;
		this.telefono = telefono;
		this.fechaNac = fechaNac;
		this.tipo = tipo;
	}
	
	
	@Override
	public String toString() {
		return "Gato [id=" + id + ", nombre=" + nombre + ", contacto=" + contacto + ", telefono=" + telefono
				+ ", fechaNac=" + fechaNac + ", tipo=" + tipo + "]";
	}



	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getContacto() {
		return contacto;
	}
	
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	

}
