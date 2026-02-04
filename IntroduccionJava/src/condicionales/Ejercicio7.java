package condicionales;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el primer lado:");
		float A = sc.nextFloat();
		System.out.println("Escribe el segundo lado:");
		float B = sc.nextFloat();
		System.out.println("Escribe el tercer lado:");
		float C = sc.nextFloat();
		sc.close();
		if (A == B && A == C) {
			System.out.println("El triángulo es equilátero");

		} else if (A == B ^ C == B) {
			System.out.println("El triángulo es isósceles");

		} else {
			System.out.println("El triángulo es escaleno");
		}
		
		float cateto1 = 1;
		float cateto2 = 1;
		float h = 1;
		//Para conocer la hipotenusa necesitamos saber que numero es el mayor
		if (A>B && A>C) {
			//A es el mayor
			h=A;
			cateto1=B;
			cateto2=C;
			System.out.println("La hipotenusa es A:"+A);
		}else if (B>A && B>C) {
			//B es el mayor
			h=B;
			cateto1=A;
			cateto2=C;
			System.out.println("La hipotenusa es B:"+B);
		}else if (C>A && C>B) {
			//C es el mayor
			h=C;
			cateto1=A;
			cateto2=B;
			System.out.println("La hipotenusa es C:"+C);
		}
		 
		
		//h^2==cateto1^2+cateto2^2
//		float h2 = (float)Math.pow(h,2);
//		float c12= (float)Math.pow(cateto1,2);
//		float c22= (float)Math.pow(cateto2, 2);
		
		if (Math.pow(h,2) == Math.pow(cateto1,2)+Math.pow(cateto2,2)) {		
			//Nuestro triangulo es rectangulo
			System.out.println("Es un triangulo rectangulo");
		} else {
			//Nuestro triangulo no es rectangulo
			System.out.println("No es un triangulo rectangulo");
		}

	}

}
