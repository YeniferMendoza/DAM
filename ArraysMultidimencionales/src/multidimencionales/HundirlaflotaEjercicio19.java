package multidimencionales;

import java.util.Random;
import java.util.Scanner;

public class HundirlaflotaEjercicio19 {

	public static boolean[][] elementosTrue(int tamaño, int elementos) {
		boolean[][] matriz = new boolean[tamaño][tamaño];
		Random rd = new Random();
		for (int i = 0; i < elementos; i++) {
			int x = rd.nextInt(0, tamaño);
			int y = rd.nextInt(0, tamaño);
			if (!matriz[x][y]) {
				matriz[x][y] = true;
			} else {
				i--;
			}
		}
		return matriz;
	}

	public static void main(String[] args) {
		int n = 4;
		int m =n;
		int intentos = (n * n) / 3;
		boolean [][] matriz = elementosTrue(n, m);
		Scanner sc = new Scanner(System.in);
		do {
			System.out.printf("Te quedan %d intentos. \n", intentos);
			System.out.println("Introduce la fila (0 - "+(n-1)+"): ");
			int y = sc.nextInt();
			System.out.println("Introduce la columna (0 - "+(n-1)+"):");
			int x = sc.nextInt();
			
			if(matriz[y][x]) {
				matriz[y][x] = false;
				System.out.println("Hundido!");
				m--;
			}else {
				System.out.println("Fallaste, sigue intentando");
			}
			intentos--;
			
		} while (intentos > 0 || m > 0);
		sc.close();

	}

}
