package multidimencionales;

public class Ejercicio1 {
	public static void pintarMatriz(int [][] matriz) {
		for(int fila = 0; fila< matriz.length; fila++) {
			System.out.print("[ ");
			for(int colum = 0; colum < matriz[fila].length; colum++ ) {
				System.out.print(matriz[fila][colum]+" ");
			}
			System.out.println("]");
		}
	}

	public static void main(String[] args) {
		int [][] matriz = {
				{1,2,3},{4,5,6,},{7,8,9,},
				};
		pintarMatriz(matriz);
	}

}
