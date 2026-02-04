package condicionales;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el primer número: ");
		float num1 = sc.nextFloat();
		System.out.println("Escribe el segundo número: ");
		float num2 = sc.nextFloat();
		
		if(num2!= 0 ) {
			System.out.println("El resultado es :"+num1/num2);
			
		} else {
			System.err.println("Error. La divición por 0 no es posible.");
		}
			
		sc.close();
	}

}
