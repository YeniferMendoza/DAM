package gestionCantantesyCanciones;

import java.time.LocalDate;

public class MainMenu {

	public static void main(String[] args) {
		Cantante c1 = new Cantante("Camila", LocalDate.of(2000, 10, 10), GeneroMusical.POP);
		System.out.println(c1);

	}

}
