package juegoDeCartas;

import java.util.Random;

import baraja.Baraja;
import carta.Carta;
import jugadorDeCartas.JugadorDeCartas;

public class JuegoDeCartas {
	private Baraja baraja;
	private JugadorDeCartas[] jugadores;
	private Carta cartaJuego;
	private int turno;

	public JuegoDeCartas(int numJugadores) throws Exception {
		if (numJugadores >= 2 && numJugadores <= 4) {
			Random r = new Random();
			this.baraja = new Baraja();
			this.baraja.barajar();// Iniciamos la Baraja y Mezclamos
			this.jugadores = new JugadorDeCartas[numJugadores]; // Asignamos el tamaño de jugadores
			for (int i = 0; i < numJugadores; i++) {
				this.jugadores[i] = new JugadorDeCartas(this.baraja.repartir(5), this.baraja);
			}
			this.cartaJuego = this.baraja.robar();
			this.turno = r.nextInt(0, numJugadores);
		} else {
			throw new Exception("Error en el número de jugadores. Tiene que ser un número comprendido entre 2 y 4");
		}

	}

	public JugadorDeCartas turnoActual() {
		return this.jugadores[this.turno];
	}

	public void cambiarTurno() {
		this.turno = (this.turno + 1) % (this.jugadores.length);
	}

	public int jugarCarta(JugadorDeCartas jugador) {
		if (jugador.numCartas() > 0) {
			// to do.
		}
		return 0;
	}

	public void ponerEnJuegoC(JugadorDeCartas jugador, int index) {
		this.cartaJuego = jugador.jugarCarta(index);
	}

	public void robarCartaB() {
		this.jugadores[this.turno].robarCarta();
	}

	public JugadorDeCartas hayGanador() {
		for (JugadorDeCartas j : this.jugadores) {
			if (j.numCartas() == 0) {
				return j;
			}
		}
		return null;
	}

	public JugadorDeCartas[] getJugadores() {
		return jugadores;
	}

	public void setJugadores(JugadorDeCartas[] jugadores) {
		this.jugadores = jugadores;
	}

	public Carta getCartaJuego() {
		return cartaJuego;
	}

	public void setCartaJuego(Carta cartaJuego) {
		this.cartaJuego = cartaJuego;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	public JugadorDeCartas obtenerJugadorEnTurno() {
		return this.jugadores[this.turno];
	}

}