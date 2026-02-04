package iterativas;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int veces=0,dig=0;
		double num;
		System.out.print("Escribe un número:");
		num=sc.nextInt();
		do {
			if(num%10==0) {
				veces++;
			}
			num=num/10;
			dig++;
		} while (num>=1);
			System.out.printf("El número tiene %d  dígitos, y es divisible por 10, %d veces. ", dig, veces);
			sc.close();
	}

}
