package arrays;

import java.util.ArrayList;
import java.util.List;

public class Clase1_1 {

	public static void main(String[] args) {
		//int numeros [] = new int[3];
//		numeros[0] = 1;
//		numeros[1] = 2;
//		numeros[2] = 3;
		//int [] numeros = new int[3];
		int [] numeros = {1,2,3};
		
		int numeros2 [] = numeros.clone();
		
		numeros2 [0] = 5;
		
		for(int n: numeros) {
			System.out.println(n);
		}
		
		for(int n: numeros2) {
			System.out.println(n);
		}
		
		for (int i = 0; i<numeros.length; i++) {
			int n = numeros[i];
			System.out.println(n);
		}
		
		String [] personas = {"Yeni","Sebas","Patricia"};
		for (String persona: personas) {
			System.out.println(persona);	
		}
		
		List <String> personas2 = new ArrayList <String>();
		
		personas2.add("Yeni");
		
		for (String persona : personas2) {
			System.out.println(persona);
		}
		
		

	}

}
