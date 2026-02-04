package string;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe la palabra: ");
		String palab = sc.nextLine();
		System.out.print("escribe el caracter: ");
		char car= sc.nextLine().charAt(0);
		int veces = 0;
		sc.close();
		for(int i= 0; i< palab.length(); i++) {
			if(car== palab.charAt(i)) {
				veces++;
			}
		}
		System.out.printf("El caracter %c aparece en la palabra %s, %d veces",car, palab, veces);
		
				

	}

}
