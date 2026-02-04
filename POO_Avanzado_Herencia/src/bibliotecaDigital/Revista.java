package bibliotecaDigital;

public class Revista extends MaterialBibliografico{
	private int numEdicion;
	private String mesPublicacion;

	public Revista(String titulo, String autor, int anioP, boolean prestado, int numEdicion, String mesPublicacion) {
		super(titulo, autor, anioP, prestado);
		this.numEdicion= numEdicion;
		this.mesPublicacion = mesPublicacion;
	}
	
	@Override
	public String toString() {
		return super.toString().concat(String.format(", numero de edicion: %s, mes de publicacion: %s", this.numEdicion, this.mesPublicacion));
	}

	
	public int getNumEdicion() {
		return numEdicion;
	}

	public void setNumEdicion(int numEdicion) {
		this.numEdicion = numEdicion;
	}

	public String getMesPublicacion() {
		return mesPublicacion;
	}

	public void setMesPublicacion(String mesPublicacion) {
		this.mesPublicacion = mesPublicacion;
	}
	
	

}
