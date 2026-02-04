package arrays;

public class Ejercicio6 {
	public static long factorialRecursivo(int num) {
		if (num < 2) {
			return 1;
		} else {
			return num * factorialRecursivo(num - 1);
		}
	}

	public static long[] asignar(long[] numeros) {
		for (int i = 1; i <= numeros.length; i++) {
			numeros[i-1] = factorialRecursivo(i);
		}
		return numeros;
	}

	public static void main(String[] args) {
		long[] numeros = new long[20];
		long[] nuevo = asignar(numeros);

		for (long numero : nuevo) {
			System.out.println(numero);
		}
	}

}
