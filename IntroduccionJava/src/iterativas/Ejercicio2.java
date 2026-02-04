package iterativas;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		int total = 0;
		int i = 0;
		float media = 0;
		while (num != 0) {
			System.out.print("Introduce un número:");
			num = sc.nextInt();
			total = total + num;
			i++;

		}
		sc.close();
		media = (float)total / (i - 1);
		System.out.println("La suma de los números es de " + total + " y la media es " + media + ".");

	}

}
