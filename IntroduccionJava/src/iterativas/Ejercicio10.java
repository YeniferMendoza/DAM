package iterativas;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuántos números va a introducir?:");
		int repe= sc.nextInt();
		int total= 0;
		for(int cont= 0; cont < repe; cont++) {
			System.out.println("Introduce un número:");
			int num= sc.nextInt();
			total = total+num;
			
		}
		sc.close();
		float media= total/repe;
		System.out.printf("La media de los numeros es %.2f.",media );
	}

}
