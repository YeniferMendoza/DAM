package condicionales;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el año:");
		int ano = sc.nextInt();
		sc.close();
		if (ano%4 == 0 && ano%100 != 0) {
			System.out.println("El año "+ano+" es bisiesto.");}
			else if (ano%400 == 0) {
				System.out.println("El año "+ano+" es bisiesto.");}
				else { 
					System.out.println("El año "+ano+" no es bisiesto.");
			}
			
		}

	}


