package iterativas;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Introduce un número entero:");
		int num = sc.nextInt();
		int divisores=0;
		for(int i= 2; i<num; i++) {
			if(num%i== 0) {
				//Es divisible
				divisores++;
				break;
			}	
		}
		if(divisores> 0) {
			System.out.printf("El número %d no es primo",num);
			
		}else {
			System.out.printf("El número %d es primo",num);
		}
		sc.close();
	}

}
