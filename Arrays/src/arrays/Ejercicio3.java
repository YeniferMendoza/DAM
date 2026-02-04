package arrays;

public class Ejercicio3 {

	public static float media(int[] numeros) {
		int media = 0;
		for (int numero : numeros) {
			media += numero;
		}
		float total = (float) media / numeros.length;
		return total;
	}

	public static void main(String[] args) {
		int[] numeros = { 50, 34, 8, 3 };
		float media = media(numeros);

		System.out.println(media);

	}

}
