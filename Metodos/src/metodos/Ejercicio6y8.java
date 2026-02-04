package metodos;

public class Ejercicio6y8 {
	public static int contarCifras(int num) {
		int numCifras = 0;
		do {
			num = num/10;
			numCifras++;
		} while (num != 0);
		return numCifras;
	}
	public static int invertirNumero(int numero) {
		int nCifras = contarCifras(numero);
		int numInvertido = 0;
		do {
			int ultimaCifra = numero % 10;
			numInvertido += Math.pow(10, nCifras -1)* ultimaCifra;
			nCifras--;
			numero = numero / 10;
		} while (numero != 0);
		return numInvertido;
	}
	
	public static boolean esCapicua (int num) {
		return num== invertirNumero(num);
	}

}
