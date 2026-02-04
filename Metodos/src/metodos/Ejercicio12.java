package metodos;

public class Ejercicio12 {
	//debugueador o depurador 
	public static boolean esAutomorfo(int num) {
		int numCuadrado = (int)Math.pow(num, 2);
			do {
				int c1 = num % 10;
				int c2 = numCuadrado % 10;
				
				if (c1 != c2)  {
					return false;
				}
				numCuadrado/= 10;
				num = num/10;
				
				
			} while (num!=0);
			return true;
	 
	}
	public static void main(String[] args) {
		System.out.println();
	}

}
