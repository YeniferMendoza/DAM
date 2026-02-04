package metodos;

public class Ejercicio1 {
	
	public static boolean esPrimo(int n) {
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

	
	
	public static void main(String[] args) {
		int numero = 7;
		if(esPrimo(numero))
			System.out.println("El número "+numero+" es primo");
		else
			System.out.println("El número "+numero+" no es primo");

	}

}
