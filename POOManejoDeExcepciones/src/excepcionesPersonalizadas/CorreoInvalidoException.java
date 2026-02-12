package excepcionesPersonalizadas;

public class CorreoInvalidoException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public CorreoInvalidoException(String correo) {
		super("Error: El correo no es valido.");
	}
	

}
