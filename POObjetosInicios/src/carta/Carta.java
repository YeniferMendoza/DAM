package carta;

import java.util.List;
import java.util.Random;

public class Carta {
	private Palo palo;
	private int numero;
	
	public Carta() {}
	
	public Carta(Palo palo, int numero) {
		this.palo= palo;
		this.setNumero(numero);
	}
//	Carta carta = new Carta();
//	Carta otra = new Carta();
//	boolean resultado=carta.tieneMismoPalo(otra);
//	boolean resultado2=Carta.tieneMismoPalo(carta, otra);
//	
//	public static boolean tieneMismoPalo(Carta carta, Carta otraCarta) {
//		return false;
//	}
	
	public boolean tieneMismoPalo(Carta otraCarta) {
		return this.palo== otraCarta.palo;
	}
	
	public boolean tieneMismoNumero(Carta otraCarta) {
		return this.numero == otraCarta.numero;
	}
	
	public String toString() {
		String num;
		switch (this.numero) {
		case 1: {
			num = "AS";
			break;
		}
		case 10: {
			num = "SOTA";
			break;
		}
		case 11: {
			num = "CABALLO";
			break;
		}
		case 12: {
			num = "REY";
			break;
		}
		default:
			num = String.valueOf(this.numero);
		} 
		return String.format("%s de %s", num, this.palo);
		
	}
	
	public boolean esFigura() {
//		return this.numero == 1 || this.numero == 10 || this.numero == 11 || this.numero ==12;
//		switch (this.numero) {
//		case 1,10,11,12: return true;
//		default: return false;
//		}
		return List.of(1,10,11,12).contains(this.numero);
	}
	public boolean esSuperior(Carta otraCarta) {
		return this.numero > otraCarta.numero;
	}
	
	public Palo getPalo() {
		return this.palo;
	}
	public int getNumero() {
		return this.numero;
	}
	public void setPalo(Palo palo) {
		this.palo = palo;
	}
	public void setNumero(int numero) {
		if(numero < 13 && numero > 0) {
			this.numero =numero;
		}else {
			Random rd= new Random();
			System.out.println("Número no válido, has invocado a la suerte.");
			this.numero = rd.nextInt(1,13);
		}
	}

}
