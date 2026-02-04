package repasoexamen;

public class Ejercicio1 {

	public static void drawDiamond(int nivel) {
		for (int i = 0; i < nivel; i++) {
			for(int j = 0; j < i + nivel; j++) {
				if(j  > nivel -1 - i && j < nivel - 1 + i) {
					System.out.print("*");
				}else {
					System.out.println(" ");
				}
			}
		}

	}
	public static void main(String [] args) {
		int nivel = 5; 
		drawDiamond(nivel);
	}

}
