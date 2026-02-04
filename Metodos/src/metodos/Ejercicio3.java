package metodos;

public class Ejercicio3 {
	
	public static boolean esPrimo(int n) {
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void primo (int n, int b) {
			for(int i = n; i<b; i++) {
				if(esPrimo(i)) {
					System.out.println(i);
				}
			}
		}

	
	
	public static void main(String[] args) {
		

	}

}
