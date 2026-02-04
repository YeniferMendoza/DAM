package simulacro;

public class Ejercicio1 {
	
	private static void ejercicio1(int n) {
		for(int i = 0; i<n; i++) {
			System.out.println("*");
			for(int j = 0; j<=i; j++) {
				System.out.print(" ");
			}
		}
		
	}

	public static void main(String[] args) {
		int n = 20; 
		ejercicio1(n);

	}


}
