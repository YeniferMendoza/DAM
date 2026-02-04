package multidimencionales;

public class Ejercicio6 {
	public static int contarO(int [][] matriz) {
		int contador = 0;
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == 0) {
					contador++;
				}
			}
		}
		return contador;
	}

	public static void main(String[] args) {
		int[][] matriz = { { 0, 2, 0 }, { 4, 0, 0, }, { 0, 8, 9 } };
		int total = contarO(matriz);
		System.out.println(total);
	}
}
