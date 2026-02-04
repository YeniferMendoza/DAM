package iterativas;

import java.util.Scanner;

public class Ejercicio11_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Introduce un numero:");
		num =sc.nextInt();
		sc.close();
		String numero=String.valueOf(num);
		System.out.printf("El número tiene %d  dígitos", numero.length());

	}

}
