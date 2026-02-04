package bibliotecaDigital;

import java.util.ArrayList;

public class Main_CatalogoBiblioteca {

	public static void main(String[] args) {
		
		Libro m1= new Libro("El quijote", " MiguelD", 2000, false, "Novela", 2000);
		Libro m2= new Libro("Brida", "Paulo C", 2000, false, "Ficcion", 2000);
		Libro m3= new Libro("Orgullo y prejuicio", " NPT", 2010, false, "Novela", 5000);
		
		Revista m4= new Revista("no se", " aaa", 2000, false, 452, "marzo");
		Revista m5= new Revista("as", " ddddd", 2000, true, 00052, "enero");
		Revista m6= new Revista("periodico", " zzzz", 2000, false, 7540, "mayo");
		
		
		ArrayList<MaterialBibliografico> lista = new ArrayList<MaterialBibliografico>();
		
		lista.add(m1);
		lista.add(m2);
		lista.add(m3);
		lista.add(m4);
		lista.add(m5);
		lista.add(m6);
		
		m2.prestado();

		
		for(MaterialBibliografico m : lista) {
			System.out.println(m);
		}

		
		



	}

}
