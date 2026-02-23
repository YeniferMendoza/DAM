package HospitalFelinoModelo;

import java.time.LocalDate;

import hospitalFelino.Types.TipoGato;

public class Ocicat extends Gato{
	private static int conOcicat = 0;


	public Ocicat(String nombre, String contacto, String telefono, LocalDate fechaNac, TipoGato tipo) {
		super(nombre, contacto, telefono, fechaNac, tipo);
		this.id = "Ocicat"+Integer.toString(conOcicat++);
	}

}
