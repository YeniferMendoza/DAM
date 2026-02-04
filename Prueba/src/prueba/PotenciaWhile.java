package prueba;

public class PotenciaWhile {
	public static void main(String[] args) {
		int base, exponente, potencia, i;
		base = 2;
		exponente = 3;
		potencia=1;
		i=1;
		while(i<=exponente) {
			potencia=potencia*base;
			i++;
		}

	
		System.out.print(base+" elevado a "+exponente+" es igual a "+potencia);
	}
}
