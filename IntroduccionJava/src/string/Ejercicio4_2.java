package string;

public class Ejercicio4_2 {

	public static void main(String[] args) {
		String texto = "Este texto es una prueba, que sustituye todas las vocales por *";
		char [] vocales = {'A','E','I','O','U','a','e','i','o','u'};
		for (char c : vocales) {
			if(texto.contains(String.valueOf(c))) {
				texto = texto.replace(c, '*');
			}
		}
		
		System.out.println(texto);

	}

}
