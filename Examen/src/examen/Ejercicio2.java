package examen;

public class Ejercicio2 {

	private static int contarApariciones(String cadena, char car) {
		if (cadena.equals("") || cadena.equals(null)) {
			return 0;
		}
		String caracter = String.valueOf(car);
		int contador = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (caracter.equalsIgnoreCase(String.valueOf(cadena.charAt(i)))) {
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
