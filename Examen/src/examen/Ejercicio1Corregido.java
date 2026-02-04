package examen;

public class Ejercicio1Corregido {

	private static boolean esImPARfecto(int numero) {
		int total = 0;
		while(numero > 0) {
			int cifra = numero%10;
			if (cifra % 2 == 0) {
				return false;
			}
			total+=cifra;
			numero/=10;
		}
		if(total%2==0) {			
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int numero = 1357;
		boolean inPARfecto = esImPARfecto(numero);
		System.out.println(inPARfecto);

	}

}
