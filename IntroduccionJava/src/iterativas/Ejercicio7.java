package iterativas;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número:");
		int num= sc.nextInt();
		
		for(int i = 1;i <= 10; i++) {
			System.out.println(num +" x "+ i +" = " +(num*i) );
		}
		sc.close();
	} 

}
