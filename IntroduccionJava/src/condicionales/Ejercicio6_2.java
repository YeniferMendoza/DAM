package condicionales;

import java.util.Scanner;

public class Ejercicio6_2 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el primer número:");
		int A = sc.nextInt();
		System.out.println("Escribe el segundo número:");
		int B = sc.nextInt();
		System.out.println("Escribe el tercer número:");
		int C = sc.nextInt();
		sc.close();
		
		if (A>B && B>C) {
			System.out.println("El orden es: "+A+", "+B+", "+C+".");
		}else if (A>B && C>B && A>C) {
			System.out.println("El orden es: "+A+", "+C+", "+B+".");
		}else if (B>A && A>C) {
			System.out.println("El orden es: "+B+", "+A+", "+C+".");
		}else if (B>A && C>A && B>C) {
			System.out.println("El orden es: "+B+", "+C+", "+A+".");
		}else if (C>A && A>B) {
			System.out.println("El orden es: "+C+", "+A+", "+B+".");
		}else if (C>A && B>A) {
			System.out.println("El orden es: "+C+", "+B+", "+A+".");
		}
	}

}
