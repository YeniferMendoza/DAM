package hospitalFelino.Types;

public enum TipoGato {
	GATO(1,"Gato"), PERSA(2,"Persa"),CHAUSIE(3,"Chausie"), SIAMES, MA, OCICAT, ABISINIO, BENGALI, BOMBAY, BRITISH_SHORTHAIR, BURMESE, EXOTIC_SHORTHAIR;
	
	private int codigo;
	private String descripción;
	
	private TipoGato() {
	}
	
	private TipoGato(int codigo, String descripcion) {
		this.codigo = codigo;
		this.descripción = descripcion;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getDescripción() {
		return descripción;
	}
	
	

}
