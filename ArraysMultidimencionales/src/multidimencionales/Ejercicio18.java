package multidimencionales;

public class Ejercicio18 {
	private static int[][] rotar(int[][] matriz) {
		int [][] matriz1 = new int [matriz.length][matriz.length];
		for(int i= 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz1[i][j] = matriz[matriz.length -1 -j][i];
			}
		}
		return matriz1;
		
	}

	public static void main(String[] args) {
		int [][] matriz = {
				{1,2,3},{4,5,6,},{7,8,9}
		};
		int [][] matriz1 =rotar(matriz);
		for(int []array : matriz1) {
			for(int numero : array) {
				System.out.print(" "+numero);
			}
			System.out.println();
		}
		
	}


}
