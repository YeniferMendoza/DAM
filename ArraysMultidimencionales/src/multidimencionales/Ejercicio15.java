package multidimencionales;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño que deceas que tenga la matriz: ");
		int tamaño = sc.nextInt();
		int [][] matriz = new int [tamaño][tamaño];
		valorasMatriz(matriz, sc);
		for(int [] array: matriz) {
			for(int numero: array) {
				System.out.print(" "+numero);
			}
			System.out.println();
		}
		sc.close();
	}

	private static int [][] valorasMatriz(int[][] matriz, Scanner sc) {
		int contador = 1;
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.printf("Introduce el valor a guardar numero %d: ",contador);
				contador++;
				matriz[i][j]= sc.nextInt();
			}
		}
		return matriz;

	}

}
