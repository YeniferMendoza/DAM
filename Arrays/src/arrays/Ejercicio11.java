package arrays;

public class Ejercicio11 {
	public static boolean esIncremental(int [] numeros) {
		for(int i = 1; i < numeros.length; i++) {
			if(numeros[i] <= numeros[i-1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int [] arrayNum = {1,3,3,50};
		boolean resultado = esIncremental(arrayNum);
		System.out.println(resultado);
	}

}
