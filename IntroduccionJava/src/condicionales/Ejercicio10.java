package condicionales;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe los minutos de tu llamada:");
		float min = sc.nextFloat();
		float precio = 0;
		sc.close();
		if(min<=5) {
			precio = min*1;
		}else if(min>5 && min<=8) {
			precio = (min-5)*0.80f+5;
		}else if(min>8 && min<=10) {
			precio = (min-8)*0.70f+5+(3*0.80f);
		}else if(min>=11) {
			precio = (min-10)*0.50f+5+(2*0.70f)+(3*0.80f);
		}
		System.out.println("El costo total de tu llemada es de: "+precio+"€.");

	}

}
