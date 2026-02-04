package metodos;

public class Ejercicio9 {
	public static void main(String[] args) {
		boolean sonAmigos= sonAmigos(3,3);
		if (sonAmigos) {
			System.out.println("Son amigos");
		} else {
			System.out.println("No son amigos");
		}
		
	}
	
	public static boolean sonAmigos(int num1, int num2) {
		return sumaDivisores(num1) == sumaDivisores(num2);

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
