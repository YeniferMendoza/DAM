package excepcionesPersonalizadas;

import gestionHotelera.Habitacion;

public class HabitacionDuplicadaException extends Exception{
	private static final long serialVersionUID = 1L;
	private static final String MESSAGE = "La habitación %s que intenta añadir ya existe.";
	
	public HabitacionDuplicadaException(Habitacion h) {
		super(String.format(MESSAGE, h));
	}

}
