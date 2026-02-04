package string;

public class Ejercicio3_2 {

	public static void main(String[] args) {
		String cadena = "Java";
		String cadReves = "";
		
		for(int posicion = cadena.length()-1; posicion >= 0; posicion--) {
			cadReves+=cadena.charAt(posicion);
		}
		
		System.out.println(cadReves);

	}

}
