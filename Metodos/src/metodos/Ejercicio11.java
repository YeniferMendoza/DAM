package metodos;

public class Ejercicio11 {
	public static void main(String[] args) {
		
		boolean esPerfecto = esPerfecto(6);
		System.out.println(esPerfecto);
		
	}
	
	public static boolean esPerfecto (int num) {
		return num == sumaDivisores(num);
	}

	public static int sumaDivisores(int num) {
		int total = 0;
		for (int i = num - 1; i > 0; i--) {
			if (i % 2 == 0) {
				total = total + i;
			}
		}
		return total;
	}
	

}
