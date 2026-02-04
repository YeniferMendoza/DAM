package arrays;

public class Ejercicio4 {
	public static int media;
	
	public static int media(int [] numeros) {
		int media = 0;
		for(int numero : numeros) {
			media += numero;	
		}
		int total= media/numeros.length;
		return total;
	}

	
	public static int mayorMedia (int [] numeros) {
		int total = 0;
		media = media(numeros);
		for(int i = 0; i< numeros.length; i++) {
			if(numeros[i]>= media) {
				total++;
			}	
		}
		return total;
		
	}

	public static void main(String[] args) {
		int [] enteros = {10, 20, 30, 40, 50};
		//int media = media(enteros);
		int mayores = mayorMedia (enteros);
		System.out.printf("La media es %d y los numeros mayores son %d", media, mayores);

	}



}
