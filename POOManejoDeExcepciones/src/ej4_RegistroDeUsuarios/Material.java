package ej4_RegistroDeUsuarios;

import java.util.UUID;

import excepcionesPersonalizadas.MaterialNoPrestadoException;
import excepcionesPersonalizadas.MaterialYaPrestadoException;

public abstract class Material implements InterfacePrestable{

	private UUID id;
	private boolean prestado;
	private String titulo;

	public Material(String titulo) {
		this.titulo= titulo;
		this.prestado= false;
		this.id= UUID.randomUUID();
	}
	
	@Override
	public boolean prestar() throws MaterialYaPrestadoException {
		if(!this.getPrestado()) {
			this.setPrestado(true);
			return true;
		}
		throw new MaterialYaPrestadoException(null);
	}

	@Override
	public boolean devolver() throws MaterialNoPrestadoException {
		if(this.getPrestado()) {
			this.setPrestado(false);
			return true;
		}
		throw new MaterialNoPrestadoException(null);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		return this.id.equals(((Material) obj).getId());
	}
	
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean getPrestado() {
		return prestado;
	}

	public void setPrestado(boolean material) {
		this.prestado = material;
	}
	public UUID getId() {
		return id;
	}

}
