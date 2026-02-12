package ej4_RegistroDeUsuarios;


public class Libro extends Material{

	private String autor;
	private int numPaginas;
	
	
	public Libro(String titulo, String autor, int numPaginas) {
		super(titulo);
		this.autor= autor;
		this.numPaginas= numPaginas;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getNumPaginas() {
		return numPaginas;
	}


	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}



	
}
