package hospitalFelino.inicio;

import HospitalFelinoModelo.Chausie;
import HospitalFelinoModelo.Gato;
import HospitalFelinoModelo.Ocicat;
import HospitalFelinoModelo.Persa;

public class Test {
	public static void main(String[] args) {
		
		Gato gato1 = new Gato("Michi", "Juan", "123456789", null, null);
		Gato gato2 = new Chausie("Michi2", "Juan2", "1234567892", null, "Mexico", null);
		Gato gato3 = new Ocicat("Michi3", "Juan3", "1234567893", null, null);
		Gato gato4= new Persa("Michi4", "Juan4", "1234567894", null, false, 0, null);
		Gato gato5 = new Gato("Michi5", "Juan5", "1234567895", null, null);
		Gato gato6 = new Chausie("Michi6", "Juan6", "1234567896", null, "Mexico", null);
		Gato gato7 = new Ocicat("Michi7", "Juan7", "1234567897", null, null);
		Gato gato8= new Persa("Michi8", "Juan8", "1234567898", null, false, 0, null);
		
		
		System.out.println(gato1);
		System.out.println(gato2);
		System.out.println(gato3);
		System.out.println(gato4);
		System.out.println(gato5);
		System.out.println(gato6);
		System.out.println(gato7);
		System.out.println(gato8);
		
	}

}
