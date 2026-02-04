package arrays;

public class Clase1 {
	public static boolean [] aprobados(int [] notas) {
		boolean [] esAprobado = new boolean[notas.length];
		for(int i = 0; i < notas.length; i++) {
			if(notas[i] < 5) {
				esAprobado[i] = false;
			}else {
				esAprobado[i] = true;
			}
		}
		return esAprobado;
	}
	public static void main(String [] args) {
		int [] notas = {7,4,9};
		boolean [] esAprobado = aprobados(notas);
		
//		for(int i = 0; i < esAprobado.length; i++) {
//			System.out.println( esAprobado[i]);
		for (boolean resultado: esAprobado) {
			System.out.println(resultado);
		}
		
	}

}
