package grimorioDeHechizos;

public class MagiaBlanca extends HechizoElemental {
	private Proposito proposito;
	private float duracion;
	
	public MagiaBlanca(String nombre, Elemento elemento, int nivelP, int cEnergia, Proposito proposito, float duracion) {
		super(nombre, elemento, nivelP, cEnergia);
		this.proposito= proposito;
		this.duracion= duracion;
	}
	
	@Override
	public String toString() {
		return super.toString().concat(String.format(" %s, %s", this.proposito, this.duracion));
	}
	
	@Override
	public void cast() {
		System.out.println("El hechizo es: "+this.nombre);
		System.out.println("    \\ | /");
		System.out.println("  `. \\|/ .'");
		System.out.println(" _ _\\ | /_ _");
		System.out.println("  ' . /|\\ . `");
		System.out.println("     / | \\");
	}

	public Proposito getProposito() {
		return proposito;
	}

	public void setProposito(Proposito proposito) {
		this.proposito = proposito;
	}

	public float getDuracion() {
		return duracion;
	}

	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}
	
	

}
