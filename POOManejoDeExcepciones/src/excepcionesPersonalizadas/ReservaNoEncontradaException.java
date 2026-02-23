package excepcionesPersonalizadas;

import gestionHotelera.Reserva;

public class ReservaNoEncontradaException extends Exception{

	private static final long serialVersionUID = 1L;
	private static final String MESSAGE= "La reserva %s no existe.";
	
	public ReservaNoEncontradaException(Reserva r) {
		super(String.format(MESSAGE,r));
	}

}
