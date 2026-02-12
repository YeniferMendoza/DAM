package excepcionesPersonalizadas;

public class EdadInvalidaException extends Exception{
	private static final long serialVersionUID = 1L;

	public EdadInvalidaException(int edad) {
		super(String.format("Edad no permitida"));

	}

}
