package multidimencionales;

public class Ejercicio10 {
	public static int sumaDiagonales(int [][] matriz) {
		int total = 0;
		int total2 = 0;
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(i == j) {
					total += matriz[i][j];
				}
				if(i+j==matriz[i].length-1) {
					total2 += matriz[i][j];
				}
			}
		}
		
		return total+total2;
	}

	public static void main(String[] args) {
		int [][] matriz = {
				{1,2,3},{4,5,6},{7,8,9}
				};
		for (int [] array: matriz) {
			for (int numero: array)
				System.out.print(" "+numero);
			System.out.println();
		}
		System.out.println(sumaDiagonales(matriz));

	}

}
