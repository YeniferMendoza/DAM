package arrays;

import java.util.Arrays;

public class Ejercicio7 {
	
	public static boolean existe(int [] numeros, int numero) {
////		boolean esta = false;
//		for(int i = 0; i < numeros.length; i++) {
//			if(numero == numeros[i]) {
////				esta = true;
//				return true;
//			}
//		}
//		return  false;
		Arrays.sort(numeros);
		if(Arrays.binarySearch(numeros, numero) >= 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int [] array = {8, 4, 2, 9};
		int num = 2;
		
		boolean total = existe(array, num);
		
		System.out.println(total);

	}
	

}
