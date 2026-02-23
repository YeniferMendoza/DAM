package exceptions;

public class NonExistentElementException extends Exception{

	private static final long serialVersionUID = 1L;
	private static final String MESSEGE= "El elemento no existe.";
	
	public NonExistentElementException() {
		super(MESSEGE);
	}
}
