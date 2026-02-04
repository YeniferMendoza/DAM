package multidimencionales;

public class Ejercicio13 {
	private static boolean booleanos(boolean[][] matriz) {
		boolean [] filas = new boolean[matriz.length];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j]) {
					filas[i] = true;
					break;
				}
			}
		}
		for (boolean fila: filas) {
			if(!fila) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		boolean [][] matriz = {
				{true, false, true},{false, false, false},{true, true, true}
		};
		System.out.println(booleanos(matriz));
	}


}
