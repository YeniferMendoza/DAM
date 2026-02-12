package divisionManejoExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	public static double dividir() throws ArithmeticException {
//		try {
			int numero = leerNumero();
			int divisor = leerNumero();
			if(divisor == 0) {
				throw new ArithmeticException("No se puede dividir por cero.");
			}
			return (double) numero / divisor;
//		} catch (ArithmeticException e) {
//			System.err.println("Debes introducir un número");
//		}catch (Exception e) {
//			System.err.println("Error desconocido.");
//		}
//		return 0;
	}
	
	public static int leerNumero() {
		try (Scanner sc = new Scanner(System.in)){
			System.out.println("Introduce un número: ");
			return sc.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("El numero introducido no es válido.");
			return leerNumero();
		} 
	}
}
