package excepcionesPersonalizadas;

import gestionHotelera.Cliente;

public class ClienteDuplicadoException  extends Exception{

	private static final long serialVersionUID = 1L;
	private static final String MESSAGE= "El cliente con el identificador %s ya se encuentra registrado.";
	
	public ClienteDuplicadoException(Cliente c) {
		super(String.format(MESSAGE,c));
	}

}