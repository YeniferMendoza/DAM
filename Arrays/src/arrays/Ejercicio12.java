package arrays;

public class Ejercicio12 {
	public static boolean esMontaña( int [] array) {
		int maxID= mayor(array);
		if(maxID == 0 || maxID == array.length -1) {
			return false;
		}
		for(int i =0; i< maxID; i++) {
			if(array[i] > array[i+1]) {
				return false;
			}
		}
		for(int i =0; i < array.length -1 ; i++) {
			if(array[i] < array[i+1])  {
				return false;
			}
		}
		return true;
		
	}
	public static int mayor(int [] array) {
		int max = 0;
		for(int i= 0; i< array.length; i++) {
			if(array[i]> array[max]) {
				max = i;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int [] array= {1, 4, 5, 3, 1};
		boolean montaña = esMontaña(array);
		System.out.println(montaña);

	}

}
