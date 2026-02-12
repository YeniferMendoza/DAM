package excepcionesPersonalizadas;

public class NombreInvalidoException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public NombreInvalidoException(String nombre) {
		super(String.format("Error: El nombre %s no cumple con lo necesario.", nombre));

	}

}
