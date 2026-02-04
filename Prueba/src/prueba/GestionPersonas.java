package prueba;

import java.util.Scanner;

public class GestionPersonas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String respuesta = sc.nextLine();
//		System.out.println(respuesta);
		Persona persona = new Persona(null, null, 0, false);
		do {
			System.out.println("Introduzca el nombre");
			persona.nombre = sc.nextLine();
			if(null != persona.nombre && persona.nombre != "") {
				System.out.println("Introduzca los apellidos");
				persona.apellidos = sc.nextLine();
				System.out.println("Introduzca la edad");
				persona.edad = sc.nextInt();
				sc.nextLine();
				System.out.println(persona.nombre+" "+persona.apellidos+", de edad :"+persona.edad);
			}
		}while(null != persona.nombre && persona.nombre != "");
		
		System.out.println("Fin");
		sc.close();
		
//		String nombre = "Yenifer";
//		int edad = 24;
//		System.out.println(nombre+" "+edad);
//		Persona p1 = new Persona();
//		p1.nombre = "Sebas";
//		p1.edad = 29;
//		System.out.println(p1.nombre+" "+p1.edad);
	}

}
