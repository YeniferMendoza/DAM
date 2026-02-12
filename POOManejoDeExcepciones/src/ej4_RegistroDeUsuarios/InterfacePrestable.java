package ej4_RegistroDeUsuarios;

import excepcionesPersonalizadas.MaterialNoPrestadoException;
import excepcionesPersonalizadas.MaterialYaPrestadoException;

public interface InterfacePrestable {
	
	boolean prestar() throws MaterialYaPrestadoException;
	boolean devolver() throws MaterialNoPrestadoException;

}
