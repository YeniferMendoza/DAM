package excepcionesPersonalizadas;

import ej4_RegistroDeUsuarios.Material;

public class MaterialDuplicadoException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private static final String MENSAJE_ERROR = "MaterialDuplicadoException, el Material %s ya existe en la biblioteca.";

	public MaterialDuplicadoException(Material material) {
		super(String.format(MENSAJE_ERROR, material));
	}

}
