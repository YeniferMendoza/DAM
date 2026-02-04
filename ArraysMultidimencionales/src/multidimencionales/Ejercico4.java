package multidimencionales;

public class Ejercico4 {

	public static int[] sumaFilas(int[][] matriz) {
		int[] array = new int[matriz.length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				array[i] += matriz[i][j];
			}

		}
		return array;

	}

	public static void main(String[] args) {
		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6, }, { 7, 8, 9 } };
		int[] array = sumaFilas(matriz);
		System.out.print("{ ");
		for (int nume : array) {
			System.out.print(nume+" ");
		}
		System.out.println("}");
	}
}
