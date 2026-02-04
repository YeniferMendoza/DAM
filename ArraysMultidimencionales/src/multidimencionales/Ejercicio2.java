package multidimencionales;

public class Ejercicio2 {
	public static int valorMaximo(int [][] matriz) {
		int max = matriz [0][0];
		for(int fila = 0; fila< matriz.length; fila++) {
			for(int colum = 0; colum < matriz[fila].length; colum++ ) {
				if(matriz [fila][colum] > max) {
					max = matriz [fila][colum];
				}	
			}
		}
		return max;
	}
	

	public static void main(String[] args) {
		int [][] matriz = {
				{1,2,3},{9,8,7},{4,20,6},
				};
		int maxi = valorMaximo(matriz);
		System.out.printf("El valor mas alto de la matriz es %d.",maxi);
	}


}
