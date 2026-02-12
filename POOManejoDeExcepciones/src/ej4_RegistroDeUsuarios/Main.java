package ej4_RegistroDeUsuarios;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
//		Material l1 = new Libro( "libro1","nom1",88);
		Material p1 = new Pelicula("Peli1","autor1",(float) 3.40);
//		Material l2 = new Libro( "Hola","Como",88);
//		Material p2 = new Pelicula("Peli2","autor2",(float) 3.40);
		
		ArrayList<Material> lista = new ArrayList<Material>();
		
		lista.add(p1);
		

	}

}
