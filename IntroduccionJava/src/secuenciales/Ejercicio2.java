package secuenciales;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe la base:");
		float base = sc.nextInt();
		System.out.println("Escribe la altura:");
		float altura = sc.nextInt();
		
		float A = (base*altura)/2;
		
		System.out.println("El area del triágulo es: "+A);
		sc.close();

	}

}
