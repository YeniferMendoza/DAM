package secuenciales;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la temperatura en ºc:");
		float temC = sc.nextFloat();
		float a = (9f / 5f);
		System.out.println(a);
		float temF = temC * (9f / 5f) + 32;

		System.out.println("En grados F esa temperatura es: " + temF);

		sc.close();
	}

}