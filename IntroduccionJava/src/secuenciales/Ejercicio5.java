package secuenciales;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		float num1 = sc.nextFloat();
		System.out.println("Escribe el segundo número:");
		float num2 = sc.nextFloat();
		System.out.println("Escribe el tercer número:");
		float num3 = sc.nextFloat();
		
		float resultado = (num1+num2+num3)/3;
		
		System.out.println("El promedio es: "+resultado);
			
		sc.close();

	}

}
