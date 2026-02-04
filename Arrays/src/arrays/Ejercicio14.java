package arrays;

public class Ejercicio14 {
	public static int [] nuevoArray (int [] num1, int [] num2) {
		int [] nuevoArray = new int [ num1.length + num2.length];
		for(int i = 0; i < num1.length; i++) {
			nuevoArray[i]= num1[i];
		}for(int j = 0; j < num2.length; j++) {
			nuevoArray[num1.length+j] = num2[j];
		}
		return nuevoArray;
	}

	public static void main(String[] args) {
		int [] num1 = {1, 2, 3};
		int [] num2 = {4, 5, 6};
		int [] nArray = nuevoArray(num1, num2);
		for(int numero : nArray) {
			System.out.println(numero);
		}

	}

}
