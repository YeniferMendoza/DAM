package HospitalFelinoModelo;

import java.time.LocalDate;

import hospitalFelino.Types.TipoGato;

public class Chausie extends Gato{
	private String pais;
	private static int conChausie = 0;
	
	public Chausie(String nombre, String contacto, String telefono, LocalDate fechaNac, String pais, TipoGato tipo) {
		super(nombre, contacto, telefono, fechaNac, tipo);
		this.pais= pais;
		this.id = "Chausie"+Integer.toString(conChausie++);
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	
	

}
