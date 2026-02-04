package iterativas;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce el número de filas:");
		int alt= sc.nextInt();
		
		for(int filas= 1; filas<=alt; filas++) {
			for(int colum= 1; colum<= filas; colum++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		sc.close();
		
	}

}
