package examen;

public class Ejercicio2Corregido {

	private static int contarApariciones(String cadena, char car) {
		if(cadena==null || cadena=="") {
			return 0;
		}
		int contador = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (car==cadena.charAt(i)) {
				contador++;
			}

		}
		return contador;
	}

	public static void main(String[] args) {
		String cadena = "abracadabra";
		char car = 'a';

		int apariciones = contarApariciones(cadena, car);
		System.out.println(apariciones);

	}

}
