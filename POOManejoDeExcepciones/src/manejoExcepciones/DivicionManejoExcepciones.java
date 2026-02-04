package manejoExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivicionManejoExcepciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean salir = false;

		while (!salir) {

			try {
				System.out.println("Introduce el primer numero.");
				int num1 = sc.nextInt();
				System.out.println("Introduce el segundo numero.");
				int num2 = sc.nextInt();
				System.out.println(num1 / num2);
				salir = true;
			} catch (InputMismatchException e) {
				System.err.println("El valor está fuera de rango.");

			} catch (ArithmeticException e) {
				System.err.println("No se puede dividir por 0.");

			} catch (Exception e) {
				System.err.println("Error desconocido.");

			} finally {
				sc.nextLine();
			}
		}
		sc.close();

	}

}
