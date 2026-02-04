package iterativas;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int numRandom = (int)Math.random() *100;
		System.out.println(numRandom);*/

		Random r = new Random();
		int numRandom = r.nextInt(0, 100);
		int numIntentos = 10;
		boolean haGanado = false;
		Scanner sc = new Scanner(System.in);
		
		while(numIntentos > 0 && !haGanado) {
			System.out.printf("Introduce tu intento (%d): ", numIntentos);
			int num= sc.nextInt();
			numIntentos--;
			if(num == numRandom) {
				haGanado = true;
				System.out.println("Felicidades, has ganado!");
			}else if(num > numRandom) {
				System.out.println("pista, es menor!");
			}else {
				System.out.println("pista, es mayor!");
			}
		
		
		}
		sc.close();
	}

}
