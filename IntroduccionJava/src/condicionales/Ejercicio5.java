package condicionales;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe la base:");
		float base = sc.nextInt();
		System.out.println("Escribe el exponente:");
		float exponente = sc.nextInt();
		float resultado;
		sc.close();
		
		if(exponente == 0) {
			resultado = 1;
		}else if (exponente > 0) {
			resultado= (float) Math.pow(base, exponente);
		} else {
			resultado = (float) (1 /  Math.pow(base, Math.abs(exponente)));
				
		}
		System.out.println(resultado);
		
	}
}


