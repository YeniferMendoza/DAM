package simulacro;

import java.util.Arrays;
import java.util.Scanner;

public class ListaAlumnos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Bienvenido!. Cuantos Alumnos hay en la clase?: ");
//		int alumnos = sc.nextInt();
//		String[] nombres = new String[alumnos];
//		for (int i = 0; i < nombres.length; i++) {
//			System.out.printf("Introduce el nombre del alumno nº %d", i + 1);
//			nombres[i] = sc.next();
//		}
		String [] nombres = {"Javier", "Laura", "Marcos", "Alvaro", "Maria", "Mariano", "Elena", "Irene", "Sebastian", "Yenifer"};
		int opcion = 0;
		do {
			System.out.println("""
					
					Opción1: Mostrar la lista de los alumnos de clase.
					Opción2: Ordenar la lista de alunmos por orden alfabético.
					Opción3: Salir.
					
					""");
			System.out.println("Seleccione una opción: ");
			opcion = sc.nextInt();
			sc.nextLine();
			if (opcion == 1) {
//				for (String nombre : nombres) {
//					System.out.println(nombre);
//				}
				System.out.println( Arrays.toString(nombres));
			}
			else if(opcion == 2) {
//				for(String nombre: nombres) {
//					System.out.println(nombre.toString());
//				}
				for (int i = 0; i < nombres.length -1; i++) {
					for(int j = 0; j < nombres.length -1 -i; j++) {
						if(nombres[j].compareTo(nombres[j+1]) > 0) {
							String aux = nombres[j];
							nombres[j] = nombres[j+1];
							nombres[j+1] = aux;
						}
					}				
				}
//				for (int i = 0; i < nombres.length -1; i++) {
//					String menor=nombres[i];
//					for(int j = i; j < nombres.length -1; j++) {
//						if(menor.compareTo(nombres[j]) > 0) {
//							String aux = nombres[j];
//							nombres[j] = menor;
//							menor = aux;
//						}
//					}
//					nombres[i]=menor;
//				}
				System.out.println(Arrays.toString(nombres));
			
				
			}

		} while (opcion == 1 || opcion == 2);
		
		System.out.println("Programa finalizado ¡Hasta luego ;)!");
		sc.close();

	}

}
