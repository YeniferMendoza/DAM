package arrays;

import java.util.Scanner;

public class GestionHotelera {
	
	public static int contarLibres(boolean [] habitaciones) {
		int contador = 0;
		for (boolean hab: habitaciones) {
			if (!hab) {
				contador++;
			}
		}
		return contador;
	}
	
	public static int contarOcupadas(boolean [] habitaciones) {
		return habitaciones.length - contarLibres(habitaciones);
	}
	
	/**
	 * 
	 * @param habitaciones un array de booleanos que representa las habitaciones de mi hotel
	 * @param numHabitacion entero que representa la habitacion a hacer checkIn
	 * @return un booleano que  determina si se ha podido realizar el checkIn
	 */
	
	public static boolean checkIn(boolean [] habitaciones, int numHabitacion) {
		if (habitaciones[numHabitacion]) {
			return false;
		} else {
			habitaciones[numHabitacion] = true;
			return true;
		}	
	}
	
	public static boolean checkOut(boolean [] habitaciones, int numHabitacion) {
		if (!habitaciones[numHabitacion]) {
			return false;
		} else {
			habitaciones[numHabitacion] = false;
			return true;
		}
	}
	
	public static void showMenu() {
		String menu  = """
				1. Hacer el check-in de una habitación por número.
				2. Hacer el check-out de una habitación por número.
				3. Mostrar el número de habitaciones disponibles.
				4. Mostrar el número de habitaciones ocupadas.
				5. Salir.
				""";
		System.out.println(menu);
	}
	
	public static int askOption(Scanner sc) {
		System.out.print("Elige una opción (1-5): ");
		return sc.nextInt();
	}
	
	public static int askNumHabitacion(Scanner sc) {
		System.out.print("Elige un nº de Habitacion: ");
		return sc.nextInt();
	}
	
	public static void main(String [] args) {
		if (args.length > 0) {
			int numHabitaciones = Integer.valueOf(args[0]);
			boolean [] habitaciones = new boolean[numHabitaciones];
			Scanner sc = new Scanner(System.in);
			int option;
			do {
				showMenu();
				option = askOption(sc);
				switch(option) {
				case 1: 
					int habitacion = askNumHabitacion(sc);
					checkIn(habitaciones, habitacion);
					break;
				case 2: 
					checkOut(habitaciones, askNumHabitacion(sc));
					break;
				case 3:
					System.out.printf("Nº de habitaciones disponibles: %d%n", contarLibres(habitaciones));
					break;
				case 4: 
					System.out.printf("Nº de habitaciones ocupadas: %d%n", contarOcupadas(habitaciones));
					break;
				case 5:
					break;
				default:
					System.out.println("Opcion no disponible");
				}
			} while(option != 5);
			
		} else {
			System.err.println("Es necesario recibir como argumento el número de habitaciones.");
		}
		
	
	}

}
