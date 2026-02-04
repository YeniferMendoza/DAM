package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2{
	public static int [] crearArrayAleatorio(int tamaño, Scanner sc) {
		int arrayAleatorio [] = new int[tamaño];
		Random rd = new Random();
		for(int i = 0; i < tamaño; i++) {
			arrayAleatorio[i] = rd.nextInt(101);
		}
		return arrayAleatorio;
	} 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el tamaño:");
		int tamaño = sc.nextInt();
		int[] array = crearArrayAleatorio(tamaño, sc);
		sc.close();
//		System.out.print("Array: [ ");
//		for(int elemento: array) {
//			System.out.print(elemento+" ");
//			
//		}
//		System.out.print("]");
		System.out.println(Arrays.toString(array));
	}

}