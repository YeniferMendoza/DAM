package excepcionesPersonalizadas;

import ej4_RegistroDeUsuarios.Material;

public class MaterialYaPrestadoException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public MaterialYaPrestadoException(Material material) {
		super(String.format("MaterialYaPrestadoException, el Material %s ya ha sido prestado.", material));
	}

}
