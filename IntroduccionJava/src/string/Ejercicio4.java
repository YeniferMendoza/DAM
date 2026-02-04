package string;

public class Ejercicio4 {

	public static void main(String[] args) {
		String texto = "Este texto es una prueba, que sustituye todas las vocales por *";
		for (int posicion = 0; posicion < texto.length(); posicion++) {
			String letra = String.valueOf(texto.charAt(posicion));
			if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I")
					|| letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
				texto = texto.replace(letra, "*");
			}
		}
		System.out.println(texto);

	}

}
