package pokemon;

public enum TipoPokemon {
	FUEGO, AGUA, ELECTRICO;
	
	public boolean esFuerte(TipoPokemon tp){
		if ((this==AGUA && tp==FUEGO) || (this == ELECTRICO && tp == AGUA) || (this == FUEGO && tp == ELECTRICO))
			return true;
		return false;
	}
	

}
