package condicionales;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final String usu = "vespertino";
		final String cont = "VivaErBetis";
		

		System.out.println("Escribe tu nombre de usuario:");
		String usuario = sc.next();
		System.out.println("Escribe la contraseña:");
		String contraseña = sc.next();

		sc.close();

		if (usuario.equals(usu) && contraseña.equals(cont)) { 

			System.out.println("Has entrado al sistema");

		} else {
			System.err.println("ERROR: Datos incorrectos.");

		}

	}

}
