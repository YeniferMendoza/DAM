package examen;

import java.util.Scanner;

public class Ejercicio3Corregido {
	private static double[] precios(double[] productos, Scanner sc) {
		for (int i = 0; i < productos.length; i++) {
			System.out.printf("Ingrese el precio del producto %d: ", i + 1);
			productos[i] = sc.nextDouble();
		}
		return productos;
	}

	private static void masCaro(double[] productos) {
		double mayor=0;
		int posicion=0;
		for (int i = 0; i < productos.length; i++) {
			double producto=productos[i];
			if(producto>mayor){
				mayor=producto;
			}
		}
		System.out.printf("El producto más caro es el producto %d y vale %.2f€\n",posicion+1,mayor);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuántos productos va a comprar? ");
		double productos[] = new double[sc.nextInt()];
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
				mostrarFactura(productos);
			} else if (opcion == 2) {
				masCaro(productos);
			}

		} while (opcion != 3);
		sc.close();
		System.out.println("Hasta luego!");

	}

	public static void mostrarFactura(double[] productos) {
		double total =0;
		for (int i = 0; i < productos.length; i++) {
			double producto=productos[i];
			System.out.printf("Producto %d\t%.2f€\n",i+1,producto);
			total+=producto;
		}
		System.out.println("---------------------------------------");
		System.out.printf("TOTAL\t\t%.2f€\n",total);
		
	}

}
