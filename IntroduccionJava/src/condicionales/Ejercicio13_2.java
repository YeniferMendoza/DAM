package condicionales;

import java.util.Scanner;

public class Ejercicio13_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("""
				· Zona 1: América del Norte, 24€ por gramo.
				· Zona 2: América Central, 20€ por gramo.
				· Zona 3: Améria del Sur, 21€ por gramo.
				· Zona 4: Europa, 10€ por gramo.
				· Zona 5: Asia, 18€ por gramo.
				""");
		int zona = 0;
		while(zona<=0 || zona>=6) {
			System.out.println("Introduce la zona: ");
			zona = sc.nextInt();
			if (zona<=0 || zona>=6) {
				System.out.println("Las zonas van de la 1 a la 5.");
			}
		}
		
		System.out.println("Introduce el peso (Se debe expresar kg): ");
		float peso = sc.nextFloat();
		float total = 0;
		
		if (peso > 5f) {
			System.out.println("El peso máximo permitido es de 5kg");
		} else{
			
			switch (zona) {
			case 1:
				total = peso * 24;
				break;
			case 2:
				total = peso * 20;
				break;
			case 3:
				total = peso * 21;
				break;
			case 4:
				total = peso * 10;
				break;
			case 5:
				total = peso * 18;
				break;
			}
			
			System.out.println("El total a pagar por el paquete es de: "+total+"€.");
					
		} 
		sc.close();
		

	}
}
