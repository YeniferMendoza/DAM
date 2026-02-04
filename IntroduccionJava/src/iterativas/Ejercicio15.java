package iterativas;

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la altura:");
		int alt = sc.nextInt();
		System.out.println("Introduce el ancho:");
		int anch = sc.nextInt();

		for (int filas = 1; filas <= alt; filas++) {
			for (int colum = 1; colum <= anch; colum++) {
				System.out.print("*");

			}
			System.out.println();
		}
		sc.close();
	}
}
