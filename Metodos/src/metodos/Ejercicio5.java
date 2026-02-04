package metodos;

public class Ejercicio5 {
	public static int maximoDivisorComun (int a, int b) {
		int oldA = a;
		 a = Math.max(a,b);
		 b = Math.min(oldA, b);
		 while (a%b !=0) {
			 int oldB= b;
			 b = a % b;
			 a = oldB;
		 }
		 return b;
	}

}
