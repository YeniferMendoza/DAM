package prueba;

public class PotenciaDoWhile {
	public static void main(String[] args) {
		int base, exponente, potencia, i;
		base = 2;
		exponente = 3;
		potencia=1;
		i=0;
		do {
			if(exponente!=0) {
				
				potencia=potencia*base;
				
				
				
				}
			i++;
		}while(i<exponente);
	
		System.out.print(base+" elevado a "+exponente+" es igual a "+potencia);
	}
}
