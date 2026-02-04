package examen;

public class Ejercicio1 {

	private static boolean esImPARfecto(int numero) {
		String numeros = String.valueOf(numero);
		for (int i = 0; i < numeros.length(); i++) {
			if (numero % 2 == 0) {
				return false;
			}
		}
		for (int i = 0; i < numeros.length(); i++) {
			String num = String.valueOf(i);
			int total = 0;
			int cifra = Integer.valueOf(num);
			total += cifra;

			if (total % 2 != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int numero = 1357;
		boolean inPARfecto = esImPARfecto(numero);
		System.out.println(inPARfecto);

	}

}
