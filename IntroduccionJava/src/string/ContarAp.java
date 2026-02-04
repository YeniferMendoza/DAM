package string;

public class ContarAp {

	public static void main(String[] args) {
		String palabra= "La luna se ve muy poco";
		char letra = 'a';
		String letra2 = "a";
		int contador = 0, contador1 = 0, contador2= 0;
		for(int i = 0; i < palabra.length(); i++) {
			
			if (letra == palabra.charAt(i)) {
				contador++;
			}
			if (letra2.equals(String.valueOf(palabra.charAt(i))) ) {
				contador1++;
			}
			if (letra2.equals(palabra.substring(i, i+1)) ) {
				contador2++;
			}
				
		}
		System.out.println(contador);
		System.out.println(contador1);
		System.out.println(contador2);

		
	}

}
