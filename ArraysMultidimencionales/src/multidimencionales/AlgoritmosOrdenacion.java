package multidimencionales;

import java.util.Arrays;
import java.util.Comparator;

public class AlgoritmosOrdenacion {
	public static void burbbleSort(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length -i -1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] =array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int [] array = {6,7,5,4,3,8,7,9,1};
		array =Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
		//array = Arrays.stream(array).sorted().toArray();
		//burbbleSort(array);
		for(int numero: array) {
			System.out.print(" "+numero);
		}
	}
	

}
