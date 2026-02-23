package HospitalFelinoModelo;

import java.time.LocalDate;

import hospitalFelino.Types.TipoGato;

public class Persa extends Gato{
	private boolean vacunado;
	private int anioVacunacion;
	
	public Persa(String nombre, String contacto, String telefono, LocalDate fechaNac, boolean vacunado,int anioVacunacion, TipoGato tipo) {
		super(nombre, contacto, telefono, fechaNac,	tipo);
		this.anioVacunacion= anioVacunacion;
		this.vacunado= vacunado;
		this.id = "Persa"+Integer.toString(contador++);
	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	public int getAnioVacunacion() {
		return anioVacunacion;
	}

	public void setAnioVacunacion(int anioVacunacion) {
		this.anioVacunacion = anioVacunacion;
	}
	
	

}
