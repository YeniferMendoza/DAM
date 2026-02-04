package condicionales;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una línea de texto:");
		String cadena = sc.nextLine();
		sc.close();
		if(cadena.equals(cadena.toUpperCase())) {
			System.out.println("El texto está todo en mayúsculas");
			
		} else {
			System.out.println("El texto no está todo en mayúsculas");
			
		}
				
	
	}

}
