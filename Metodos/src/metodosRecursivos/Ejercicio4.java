package metodosRecursivos;

public class Ejercicio4 {
	public static int potencia(int base, int exponente) {
		if (exponente < 1) {
			return 1;
		} else if (exponente == 1) {
			return base;
		} else {
			return base * potencia(base, exponente - 1);
		}

	}

	public static void main(String[] args) {
		int total = potencia(8, 7);
		System.out.println(total);
	}

}