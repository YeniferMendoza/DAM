package grimorioDeHechizos;

public class HechizoElemental {
	protected String nombre;
	protected Elemento elemento;
	protected int nivelP;
	protected int cEnergia;
	
	public HechizoElemental(String nombre, Elemento elemento, int nivelP, int cEnergia) {
		this.nombre= nombre;
		this.elemento= elemento;
		this.setNivelP(nivelP);
		this.cEnergia= cEnergia;
	}
	
	public String toString() {
		return String.format("%s, %s, %s, %s.", this.nombre, this.elemento, this.nivelP, this.cEnergia);
	}
	
	public boolean equals(Object object) {
		if(object == null) {
			return false;
		}
		if(object instanceof MagiaNegra) {
			
		}
		return false;
	}
	
	public void cast() {
		System.out.println("  .--.");
		System.out.println(" |o_o |");
		System.out.println(" |:_/ |");
		System.out.println(" // \\ \\");
		System.out.println(" (| |    )");
		System.out.println(" /'\\_ _/`\\");
		System.out.println(" \\___)=(___/");

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Elemento getElemento() {
		return elemento;
	}

	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}

	public int getNivelP() {
		return nivelP;
	}

	public void setNivelP(int nivelP) {
		int nivel_max=100;
		int nivel_min=1;
		if(nivelP <=nivel_max && nivelP >= nivel_min) {
			this.nivelP = nivelP;
		}
		else if(nivelP >nivel_max) {
			this.nivelP = nivel_max;
		}
		else {
			this.nivelP= nivel_min;
		}
	}

	public int getcEnergia() {
		return cEnergia;
	}

	public void setcEnergia(int cEnergia) {
		this.cEnergia = cEnergia;
	}
}
