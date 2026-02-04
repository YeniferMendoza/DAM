package pokemon;

public class Pokemon {
	
	private String nombre;
	private int vida_max = 100;
	private int vida_act;
	private int nivel;
	private float ataque;
	private TipoPokemon tipo;
	
	public Pokemon () {}
	
	public Pokemon (String nombre, int vida_max,int vida_act, int nivel,float ataque,TipoPokemon tipo) {
		this.nombre= nombre;
		this.vida_max= vida_max;
		this.setVida_act(vida_act);
		this.setNivel(nivel);
		this.ataque= ataque;
		this.tipo= tipo;
	}
	
//	public void mostrarInformacion() {
//		System.out.println(this);
//	}
	
	public String toString() {
		return String.format( "Nombre: %s Nivel: %s\nVida maxima: %s, Vida actual: %s\nAtaque: %s, Tipo: %s", nombre, nivel, vida_max, vida_act, ataque, tipo);
	}
	
//	public String toString() {
//		return this.nombre+" " +this.nivel + " "+this.ataque;
//	}
	
//	public void subirNivel() {
//		if(this.nivel <100) {
//			this.nivel++;
//			float porcentajeVida = this.vida_act/this.vida_max;
//			this.vida_max+=this.vida_max * 0.02f;
//			this.vida_act=(int) (this.vida_max*porcentajeVida);
//			this.ataque+=this.ataque * 0.02;
//		}
//	}
	public void subirNivel() {
	if(this.nivel <100) {
		this.nivel++;
		this.vida_max*=1.02f;
		this.ataque*=1.02;
	}
}
	
	
	public void curar() {
		this.vida_act= this.vida_max;
	}
	
	public void atacar( Pokemon objetivo) {
		float daño = this.ataque;
		if(this.tipo.esFuerte(objetivo.tipo)) {
			daño*=2;
		}
		
		if(daño>objetivo.vida_act)
			objetivo.vida_act = 0;
		else
			objetivo.vida_act-=daño;
		
	}
	
	 
	public boolean estaDebilitado() {
		if(this.vida_act == 0) {
			return true;
		}
		return false;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public int getVida_max() {
		return this.vida_max;
	}
	public int getVida_act() {
		return this.vida_act;
	}
	public int getNivel() {
		return this.nivel;
	}
	public float getAtaque() {
		return this.ataque;
	}
	public TipoPokemon getTipo() {
		return this.tipo;
	}
	
	public void setNombre( String nombre) {
		this.nombre = nombre;
	}
	public void setVida_max(int vida_max) {
		this.vida_max = vida_max;
	}

	public void setVida_act(int vida_act) {
		if(vida_act > this.vida_max )
			this.vida_act = this.vida_max;
		else 
			this.vida_act= vida_act;
	}

	public void setNivel(int nivel) {
		if(nivel < 1)
			this.nivel= 1;
		else if(nivel > 100)
			this.nivel= 100;
		else
			this.nivel = nivel;
	}

	public void setAtaque(float ataque) {
		this.ataque = ataque;
	}

	public void setTipo(TipoPokemon tipo) {
		this.tipo = tipo;
	}
	
	

	
}
