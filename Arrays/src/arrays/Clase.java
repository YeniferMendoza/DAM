package arrays;

import java.util.Random;

public class Clase {
	
	public static boolean [] aprobados(int [] notas) {
		boolean [] resultados = new boolean[notas.length];
		for(int i = 0; i < notas.length; i++) {
			if(notas[i] < 5) {
				resultados[i]=false;
			}else {
				resultados[i]=true;
			}
		}
		return resultados;
	}

	public static void main(String[] args) {
		Random r = new Random();
		int [] notas = new int [29];
		for (int i = 0; i < notas.length; i++) {
			notas [i] = r.nextInt(10);
		}
		//boolean [] aprobados = {false, true, true};
		boolean [] aprobados = aprobados(notas);
		
		for (int i=0; i<notas.length;i++) {
			if (aprobados[i]) {
				System.out.printf("La nota %d ha aprobado",notas[i]);
			} else {
				System.out.printf("La nota %d no ha aprobado",notas[i]);
			}
			System.out.println();
		}
	}
	

}
