package arrays;

import java.util.Arrays;

public class Ejercicio5 {
	
	public static int posicion (int [] numeros, int num) {
//		for(int i = 0; i < numeros.length; i++) {
//			if(num == numeros[i]) {
//				return i;
//			}
//		}
//		raturn -1;
		return Arrays.binarySearch(numeros, num);
	}

	public static void main(String[] args) {
		int num = 5;
		int [] numeros = {5, 62, 21, 4, 3};
		int posicion = posicion(numeros, num);
		System.out.printf("el numero se encuentra en la posicion %d", posicion+1);

	}

}
