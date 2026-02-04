package absCaballeroMarronesyMasmorras;

public enum Corte {
	
	REY_ARTURO("Corte del rey Arturo"), 
	CAMELOT("Corte de camelot");
	
	private String nombreCorte;
	

	private Corte (String nombreCorte) {
		this.nombreCorte= nombreCorte;
	}


	public String getNombreCorte() {
		return nombreCorte;
	}
	
}
