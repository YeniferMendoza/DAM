package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
	public static boolean existe(int[] numeros, int numero) {
		int copia [] = Arrays.copyOf(numeros, numeros.length);
		Arrays.sort(copia);
		if (Arrays.binarySearch(copia, numero) >= 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array [] = new int [10];
		int contador = 0;
		int ceros = 1;
		do {
			System.out.println("Introduzca un numero:");
			int numero = sc.nextInt();
			if(numero == 0 && ceros > 0) {
				ceros--;
				contador++;
			}
			else if(!existe(array, numero)){
				array[contador]= numero;
				contador++;
			}
			else {
				System.out.println("El numero ya existe, por favor introduzca otro: ");
			}
		} while (contador < 10);
		sc.close();
		
		System.out.println(Arrays.toString(array));
		}

	}
