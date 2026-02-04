package multidimencionales;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio16 {
	
	public static boolean [][] elementosTrue (int tamaño , int elementos) {
		boolean [][] matriz = new boolean [tamaño][tamaño];
		Random rd = new Random();		
		for( int i = 0; i < elementos; i++) {
			int x = rd.nextInt(0,tamaño);
			int y = rd.nextInt(0,tamaño);
			if(!matriz[x][y]) {
				matriz[x][y]=true;
			}else {
				i--;
			}
		}
		return matriz;
		
	}
	
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño: ");
		int tamaño = sc.nextInt();
		System.out.println("Introduce el numero de elementos: ");
		int elementos = sc.nextInt();
		sc.close();
		boolean [][] matriz =elementosTrue(tamaño, elementos);
		
		for(boolean[] array: matriz) {
			for(boolean posicion: array) {
				System.out.print(" "+posicion);
			}
			System.out.println();
		}
		
	}
}
