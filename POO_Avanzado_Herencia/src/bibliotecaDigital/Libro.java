package bibliotecaDigital;

public class Libro extends MaterialBibliografico{
	private String genero;
	private int numPaginas;

	public Libro(String titulo, String autor, int anioP, boolean prestado, String genero, int numPaginas) {
		super(titulo, autor, anioP, prestado);
		this.genero= genero;
		this.numPaginas= numPaginas;
	}
	
	@Override
	public String toString() {
		return super.toString().concat(String.format(", genero: %s, numPaginas: %s", this.genero, this.numPaginas));
	}
	
	
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

}
