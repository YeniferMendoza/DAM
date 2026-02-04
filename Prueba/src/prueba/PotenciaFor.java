package prueba;

public class PotenciaFor {
	public static void main(String[] args) {
		int base, exponente, potencia, i;
		base = 2;
		exponente = 6;
		potencia=1;
		for (i=1;i<=exponente;i++) {
			potencia=potencia*base;
			
		
		}
	
		System.out.print(base+" elevado a "+exponente+" es igual a "+potencia);
	}
}
