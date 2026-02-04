package iterativas;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número:");
		int num = sc.nextInt();
		int total = 1;
		sc.close();
		for (int i = num; i > 1; i--) {
			total *= i;
		}
		System.out.println("El factorial de " + num + " es: " + total + ".");

	}

}
