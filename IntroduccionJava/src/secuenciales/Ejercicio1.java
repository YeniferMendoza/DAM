package secuenciales;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe tu nombre");
		String nombre = sc.nextLine();
		System.out.println("Escribe tu apellido");
		String apellido = sc.nextLine();
		System.out.println("Mucho gusto "+nombre+" "+apellido);
		
		sc.close();

	}

}