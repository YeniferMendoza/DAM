package bibliotecaDigital;

public class MaterialBibliografico {
	protected String titulo;
	protected String autor;
	protected int anioP;
	protected boolean prestado;
	
	public MaterialBibliografico(String titulo, String autor, int anioP, boolean prestado) {
		this.titulo= titulo;
		this.autor= autor;
		this.anioP= anioP;
		this.prestado= prestado;
		
	}
	
	public boolean prestado() {
		if(!this.prestado) {
			this.prestado= true;
			return  true;
		}
		System.err.println("El libro ya esta prestado");
		return false;
	}
	
	public boolean devolver() {
		if(this.prestado) {
			this.prestado = false;
			return true;
		}
		this.prestado = true;
		return false;
	}
	
	public String toString() {
		return String.format("Título: %s, autor: %s, año: %s, año: %s", this.titulo, this.autor, this.anioP, this.prestado);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnioP() {
		return anioP;
	}

	public void setAnioP(int anioP) {
		this.anioP = anioP;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	

}
