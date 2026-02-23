package excepcionesPersonalizadas;

import gestionHotelera.Habitacion;

public class HabitacionNoEncontradaException   extends Exception{

	private static final long serialVersionUID = 1L;
	private static final String MESSAGE= "La habitacion %s no existe.";
	
	public HabitacionNoEncontradaException(Habitacion h) {
		super(String.format(MESSAGE,h));
	}

}