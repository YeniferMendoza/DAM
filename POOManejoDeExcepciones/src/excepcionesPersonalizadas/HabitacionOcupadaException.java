package excepcionesPersonalizadas;

import gestionHotelera.Habitacion;

public class HabitacionOcupadaException extends Exception{

	private static final long serialVersionUID = 1L;
	private static final String MESSAGE= "La hablitacion %s ya esta ocupada.";
	
	public HabitacionOcupadaException(Habitacion h) {
		super(String.format(MESSAGE,h));
	}

}
