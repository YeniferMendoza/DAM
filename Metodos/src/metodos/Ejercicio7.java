package metodos;

public class Ejercicio7 {
	
	public static void contarCifrasParesImpares(int num){
		int par = 0, impar = 0;
		String numero = String.valueOf(num);
		for (int i=0; i<numero.length();i++) {
			int cifra = Character.getNumericValue(numero.charAt(i));
			if(cifra%2==0) {
				par++;
			} else {
				impar++;
			}
		}
		if (par > impar) {
			System.out.printf("El número %d tiene más cifras pares.",num);
			
		} else if (par == impar){
			System.out.printf("El número %d tiene las mismas cifras pares que impares.",num);
		} else {
			System.out.printf("El número %d tiene más cifras impares.",num);
		}
		
	}

	public static void main (String [] args){
		contarCifrasParesImpares(51626418);
	}

}
