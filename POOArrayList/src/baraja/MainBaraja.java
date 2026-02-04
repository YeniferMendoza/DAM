package baraja;

import carta.Carta;

public class MainBaraja {
	public static void main(String[] args) {
		Baraja baraja = new Baraja();
		baraja.barajar();
		//System.out.println(baraja);
		//baraja.ordenar(true);
		//baraja.inicializar();
		Carta carta = baraja.robar();
		System.out.println(carta);
		boolean resultado = baraja.buscarCarta(carta);
		System.out.println(resultado);
		System.out.println(baraja.repartir(5));
		}

}
