package arrays;

import java.util.Scanner;

public class Ejercicio1 {
	public static int [] crearArray(int tamaño) {
		Scanner sc = new Scanner(System.in);
		int array [] = new int[tamaño];
		for(int elemento = 0; elemento < tamaño; elemento++) {
			System.out.println("Escribe el valor del elemento "+(elemento+1));
			array[elemento] = sc.nextInt();
		}
		sc.close();
		return array;
	} 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el tamaño:");
		int tamaño = sc.nextInt();
		int[] array = crearArray(tamaño);
		sc.close();
		System.out.print("Array: [ ");
		for(int elemento: array) {
			System.out.print(elemento+" ");
			
		}
		System.out.print("]");
		
	}

}
