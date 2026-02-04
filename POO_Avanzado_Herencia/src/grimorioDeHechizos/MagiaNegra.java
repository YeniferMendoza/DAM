package grimorioDeHechizos;


public class MagiaNegra extends HechizoElemental {
	private EfectoSecundario[] efecto;
	private int dano;
	private boolean sacrificio;

	public MagiaNegra(String nombre, Elemento elemento, int nivelP, int cEnergia, EfectoSecundario[] efecto, int dano, boolean sacrificio) {
		super(nombre, elemento, nivelP, cEnergia);
		this.efecto = efecto;
		this.dano = dano;
		this.sacrificio= sacrificio;
	}
	
	@Override
	public String toString() {
		return super.toString().concat(String.format(" %s, %s, %s", this.efecto, this.dano, this.sacrificio));
	}
	
	@Override
	public void cast() {
			System.out.println("El hechizo es :"+this.nombre);
			System.out.println("  _____");
			System.out.println(" /    \\");
			System.out.println("| () () |");
			System.out.println(" \\ ^  /");
			System.out.println("  |||||");
			System.out.println("  |||||");
	}

	public EfectoSecundario[] getEfecto() {
		return efecto;
	}

	public void setEfecto(EfectoSecundario[] efecto) {
		this.efecto = efecto;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	public boolean isSacrificio() {
		return sacrificio;
	}

	public void setSacrificio(boolean sacrificio) {
		this.sacrificio = sacrificio;
	}
	
	

}
