package secuenciales;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Intoduzca el número del primer cateto: ");
		 float num1 = sc.nextFloat();
		 System.out.println("Intoduzca el número del segundo cateto: ");
		 float num2 = sc.nextFloat();
		 double num3 = Math.pow(num1, 2) + Math.pow(num2, 2);
		 num3 = Math.sqrt(num3);
		 System.out.println("El resultado es: "+num3);
	 	 sc.close();

	}

}
