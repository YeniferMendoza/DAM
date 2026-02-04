package multidimencionales;

public class Ejercicio8 {
	public static boolean esIdentidad(int [][] matriz) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if((i == j && matriz[i][j]!= 1) || (i != j && matriz[i][j] != 0)) {
					return false;
				}	
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		int [][] matriz = {
				{1,0,0},{0,1,0},{0,0,1}
		};
		System.out.println(esIdentidad(matriz));

	}

}
