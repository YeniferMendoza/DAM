package iterativas;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,sup,inf,total=0;
		int fueraInt = 0;
		do {
			System.out.println("Escribe el intervalo inferior:");
			inf = sc.nextInt();
			System.out.println("Escribre el intervalo superior:");
			sup = sc.nextInt();
		}while(inf >= sup);
		
		do {
			System.out.println("Introduce un número: ");
			num = sc.nextInt();
			if(num>inf && num<sup) {
				total = total+num;
			}else {
				fueraInt++;
			}
		} while (num!=0);
		sc.close();;
		System.out.printf("La suma de los números es %d y los números fuera del intervalo son %d",total,fueraInt-1);
		
	}

}
