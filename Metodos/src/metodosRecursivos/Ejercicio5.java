package metodosRecursivos;

public class Ejercicio5 {
	public static int numDigitos(int num) {
		if (num<10) {
			return 1;
		}else{
			return numDigitos(num/10) + 1;
			//el "+ 1" va a servir para cuando deba dar la vuelta
			//y el "/" va a servir para quitar un digito 
		}
	}
	public static void main(String []args) {
		System.out.println(numDigitos(7));
	}

}
