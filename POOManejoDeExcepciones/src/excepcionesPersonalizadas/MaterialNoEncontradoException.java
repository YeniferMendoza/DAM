package excepcionesPersonalizadas;

import ej4_RegistroDeUsuarios.Material;

public class MaterialNoEncontradoException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public MaterialNoEncontradoException(Material material) {
		super(String.format("MaterialNoEncontradoException, el Material %s no existe en la lista.", material));
	}

}

