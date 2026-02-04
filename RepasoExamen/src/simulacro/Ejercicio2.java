package simulacro;

public class Ejercicio2 {
	
	private static int[][] ejercicio2(int[] array) {
		int [][] matriz = new int [array.length][array.length]; 
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				matriz[i][j] += array[i]+ array[j] ;
			}
		}
		return matriz;
		
	}

	public static void main(String[] args) {
		int [] array = {1,2,3};
		int [][] matriz = ejercicio2(array);
		for(int [] posicion : matriz) {
			System.out.println();
			for(int elemento : posicion) {
				System.out.print(" "+elemento);
			}
		}

	}


}
