package iterativas;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int mayor, menor;
		System.out.println("Escribe el primer número:");
		int num1 = sc.nextInt();
		System.out.println("Introduce el segundo número:");
		int num2 = sc.nextInt();
		sc.close();
		if(num1<num2) {
			mayor = num2;
			menor = num1;
		}else {
			mayor = num1;
			menor = num2;
		}
		for(int i = menor; i<=mayor; i+=2 ) {
			if(i%2 != 0) {
			 i++;
			}
			System.out.println(i);
		}
		
	}

}
