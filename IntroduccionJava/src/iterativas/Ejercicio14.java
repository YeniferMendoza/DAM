package iterativas;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce el número de filas:");
		int n= sc.nextInt();
		
		for(int filas= 1; filas<=n; filas++) {
			for(int colum= 1; colum<= filas; colum++) {
				System.out.print(colum);
				
			}
			System.out.println();
		}
		sc.close();

	}

}
