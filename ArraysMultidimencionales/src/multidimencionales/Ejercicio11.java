package multidimencionales;

public class Ejercicio11 {
	public static int [][] transposicion(int [][] matriz){
		int [][] nueva = new int [matriz[0].length][matriz.length];
		for(int i = 0; i < nueva.length; i++) {
			for(int j = 0; j < nueva[i].length; j++) {
				try {
					nueva [i][j] = matriz [j][i];
				}catch (Exception e ) {
					nueva[i][j]=0;
				}
			}
		}
//		for(int i = 0; i < matriz.length; i++) {
//			for(int j = 0; j < matriz[i].length; j++) {
//				nueva [j][i] = matriz [i][j];
//			}
//		}
		return nueva;
	}

	public static void main(String[] args) {
		int [][] matriz = {
				{1,2,3,},{4,5,6},{8,2,3},{7,5,6}
		};
		matriz = transposicion(matriz);
		for(int [] array: matriz) {
			for(int numero: array) {
				System.out.print(" "+numero);
			}
			System.out.println();
		}

	}

}
