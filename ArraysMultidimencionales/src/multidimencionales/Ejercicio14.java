package multidimencionales;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio14 {
	public static int[][] crearMatriz(int num) {
		int[][] n = new int[num][num];
		Random rd = new Random();
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				n[i][j] = rd.nextInt(1,101);
			}
		}
		return n;
	}

	public static void main(String[] args) {
		int numero = 5;
		int[][] matriz = crearMatriz(numero);
//		for (int[] fila : matriz) {
//			System.out.print("{ ");
//			for (int elemento : fila) {
//				System.out.print(elemento + " ");
//			}
//			System.out.println("}");
//		}
		System.out.println(Arrays.deepToString(matriz));
	}

}
