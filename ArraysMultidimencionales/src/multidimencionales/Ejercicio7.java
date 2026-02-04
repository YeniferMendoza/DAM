package multidimencionales;

public class Ejercicio7 {

	public static int encontrar(int [][] matriz, int num) {
		int contador = 0;
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == num) {
					contador++;
				}
			}
		}
		return contador;
	}

	public static void main(String[] args) {
		int num = 2;
		int[][] matriz = { { 0, 2, 2 }, { 4, 0, 2, }, { 0, 2, 9 } };
		int apariciones = encontrar(matriz, num);
		System.out.println(apariciones);
	}
}


