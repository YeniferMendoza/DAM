package examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
	private static int[] precios(int[] productos, Scanner sc) {
		for (int i = 0; i < productos.length; i++) {
			System.out.printf("Ingrese el precio del %d º producto", i + 1);
			productos[i] = sc.nextInt();
		}
		return productos;
	}

	private static void masCaro(int[] productos) {
		Arrays.sort(productos);
		int mayor = 0;
		for (int i = productos.length; i >= productos.length; i--) {
			mayor = productos[i - 1];
		}
		System.out.println(mayor);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuántos productos va a comprar? ");
		int productos[] = new int[sc.nextInt()];
		productos = precios(productos, sc);
		int opcion = 0;
		sc.nextLine();
		do {
			System.out.println("""

					Opción 1: Mostrar la factura.

					Opción 2: Mostrar el producto más caro de la factura.

					Opción 3: Salir del programa.

					""");
			opcion = sc.nextInt();

			if (opcion < 1 || opcion > 3) {
				System.err.println("Opción no valida!");
			} else if (opcion == 1) {
				System.out.println(Arrays.toString(productos));
			} else if (opcion == 2) {
				masCaro(productos);
			}

		} while (opcion != 3);
		sc.close();
		System.out.println("Hasta luego!");

	}

}
