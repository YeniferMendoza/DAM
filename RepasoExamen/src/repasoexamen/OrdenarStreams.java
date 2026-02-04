package repasoexamen;

import java.util.Arrays;
import java.util.Comparator;

public class OrdenarStreams {

	public static void main(String[] args) {
		int[] numeros = {2,8,3,9,5,6,0};
		System.out.println(Arrays.toString(numeros));
		numeros = Arrays.stream(numeros)
					.sorted()
					.toArray();
		System.out.println(Arrays.toString(numeros));
		
		String [] nombres = {"Javier", "Laura", "Marcos", "Alvaro", "Maria", "Mariano", "Elena", "Irene", "Sebastian", "Yenifer"};
		System.out.println(Arrays.toString(nombres));
		nombres = Arrays.stream(nombres)
					.sorted()
					.toArray(String []:: new);
		System.out.println(Arrays.toString(nombres));
		
		numeros = Arrays.stream(numeros)
					.sorted()
					.toArray();
		System.out.println(Arrays.toString(numeros));
		
		nombres = Arrays.stream(nombres)
					.sorted(Comparator.reverseOrder())
					.toArray(String []:: new);
		System.out.println(Arrays.toString(nombres));
		
		
	}

}
