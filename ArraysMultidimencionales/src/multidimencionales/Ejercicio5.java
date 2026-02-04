package multidimencionales;

public class Ejercicio5{

	public static float[] media(int[][] matriz) {
		float[] array = new float[matriz.length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				array[i] += matriz[i][j];
			}
			array[i] = array[i] / matriz[i].length;
		}
		return array;

	}

	public static void main(String[] args) {
		int[][] matriz = { { 1, 2, 3 }, { 4, 50, 6, }, { 7, 8, 20 } };
		float [] array = media(matriz);
		System.out.print("[ ");
		for (float numero : array) {
			System.out.printf("%.2f ",numero);
		}
		System.out.println("]");
	}
}

