package condicionales;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe el número de alumnos: ");
		float alum = sc.nextInt();
		float coste = 0;
		float total = 0;
		sc.close();
		if(alum>=100) {
			coste = 65f;
		}else if(alum>=50 && alum<=99) {
			coste = 70f;
		}else if(alum>=30 && alum<=49) {
			coste = 95f;
		}else if(alum<=29){
			total = 4000f;
			coste = total/alum;
		} 
		total = alum*coste;
		System.out.println("El coste por alumno es de :"+coste+"€, y debe pagar a la compañia "+Math.ceil(total)+"€.");
	}

}
