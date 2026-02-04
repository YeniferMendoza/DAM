package absGestionDeVehiculosDeBatallaEnUnJuegoDeEstrategia;

public abstract class VehiculoJ {
	
	protected String identificador;
	protected String nombre;
	protected float resistencia;
	protected PoderAtaque ataque;
	
	public VehiculoJ(String identificador, String nombre, float resistencia, PoderAtaque ataque) {
		this.identificador= identificador;
		this.nombre= nombre;
		this.resistencia= resistencia;
		this.ataque= ataque;
	}
	
	@Override
	public boolean equals (Object obj) {
		if(obj == null || !(obj instanceof VehiculoJ)) {
			return false;
		} else {
			VehiculoJ v =(VehiculoJ) obj;
			//Aqui elegimos por que campos comparamos
			//return this.nombre.equals(v.nombre) && this.ataque.equals(v.ataque);
			return v.getIdentificador().equals(this.identificador);
		}
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getResistencia() {
		return resistencia;
	}

	public void setResistencia(float resistencia) {
		this.resistencia = resistencia;
	}

	public PoderAtaque getAtaque() {
		return ataque;
	}

	public void setAtaque(PoderAtaque ataque) {
		this.ataque = ataque;
	}

	
}
