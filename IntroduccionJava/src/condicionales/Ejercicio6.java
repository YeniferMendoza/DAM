package condicionales;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el primer número:");
		float num1 = sc.nextFloat();
		System.out.println("Escribe el segundo número:");
		float num2 = sc.nextFloat();
		System.out.println("Escribe el tercer número:");
		float num3 = sc.nextFloat();
		sc.close();
		
		if (num1>num2) {
			if (num3>num1) {
				System.out.println("El orden es: "+num3+", "+num1+", "+num2);
				
			}else if(num2>num3) {
				System.out.println("El orden es: "+num1+", "+num2+", "+num3);
				
			}else {
				System.out.println("El orden es: "+num1+", "+num3+", "+num2);
			}
			
		}if (num2>num1) {
			if (num1>num3) {
				System.out.println("El orden es: "+num2+", "+num1+", "+num3);
			
			}else if (num3>num2){
				System.out.println("El orden es: "+num3+", "+num2+", "+num1);
				
			}else {
				System.out.println("El orden es: "+num2+", "+num3+", "+num1);
			}
		
		
		
	}

	
}
	}
