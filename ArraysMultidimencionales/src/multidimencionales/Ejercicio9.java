package multidimencionales;

public class Ejercicio9 {
	public static int [][] matrizIdentidad(int num){
		int [][] matriz = new int [num][num];
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(i == j ){
					matriz[i][j]= 1;
				}else {
					matriz[i][j]= 0;
				}
				
			}
		}
		return matriz;
	}

	public static void main(String[] args) {
		int num = 5;
		int [][] matriz =matrizIdentidad(num);
		for(int [] posicion : matriz) {
			for(int numero : posicion) {
				System.out.print(" "+numero);
			}
			System.out.println();
		}

	}

}
