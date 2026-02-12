package excepcionesPersonalizadas;

import ej4_RegistroDeUsuarios.Material;

public class MaterialNoPrestadoException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public MaterialNoPrestadoException(Material material) {
		super(String.format("MaterialNoPrestadoException, el Material %s no ha sido prestado.", material));
	}

}