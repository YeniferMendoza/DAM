package iterativas;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		String letra;
		do {
			System.out.print("Introduce una letra:");
			letra = sc.nextLine();
//			if(letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O")|| letra.equalsIgnoreCase("U")) {
//				System.out.println("Es vocal");
//			}else {
//				System.out.println("No es vocal");
//			}
			System.out.println(calculoVocal(letra));
		}while(!letra.equals(" "));
		sc.close();
	}
	
	/**
	 * Este método devuelve si un string es vocal o no
	 * 
	 * @param letra
	 * @return Vocal o no
	 **/
	
	public static String calculoVocal(String letra) {
		if(letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O")|| letra.equalsIgnoreCase("U")) {
			return "Es vocal";
		}else {
			return "No es vocal";
		}
	}

}
