package iterativas;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();//este scanner esta para que no se active el warnnig ya que me estaba dando un error.
		
		System.out.println("¿Cuántos números vas a introducir?");
		int rep = sc.nextInt();
		int positivos=0;
		int negativos=0;
		int ceros=0;
		int contador;
		for(contador = 0; contador < rep; contador++) {
			System.out.println("Introduce el primer número: ");
			int numero = sc.nextInt();	
			if (numero > 0) {
				positivos++;
			}else if(numero == 0) {
				ceros++;
			}else if(numero < 0) {
				negativos++;
			}
		}
		System.out.println("tienes, "+positivos+" número/s positivo/s, "+ceros+" número/s 0, y "+negativos+" negativo/s número/s negativo/s.");
		sc.close();
	}

}
