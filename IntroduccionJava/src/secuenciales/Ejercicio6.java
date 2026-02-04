package secuenciales;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu nombre;");
		String name = sc.nextLine();
		System.out.println("Escribe tu primer apellido;");
		String surname = sc.nextLine();
		System.out.println("Escribe tu segundo apellido;");
		String surname2 = sc.nextLine();
		
		char uno = name.charAt(0);
		uno = Character.toUpperCase(uno);
		char dos = surname.charAt(0);
		dos = Character.toUpperCase(dos);
		char tres = surname2.charAt(0);
		tres = Character.toUpperCase(tres);
		System.out.println("La inicial de tu nombre es "+uno+", la de tu primer apellido es "+dos+", y la de tu segundo apellido es "+tres+".");
		
		sc.close();
	}

}
