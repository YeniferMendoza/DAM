package metodosRecursivos;

public class Ejercicio2 {
	public static int sumaCifras(int num){
		if (num < 10) {
			return num;
		}else {
			return (num % 10) + sumaCifras(num/10);
		}
	}

	public static void main(String [] args) {
		int num = 1024;
		int cifras = sumaCifras(num);
		System.out.println(cifras);
	}

}
