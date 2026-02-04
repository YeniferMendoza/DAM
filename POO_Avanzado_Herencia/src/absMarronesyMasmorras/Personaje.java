package absMarronesyMasmorras;

import java.util.UUID;

public abstract class Personaje {

	private static final int INICIAL_LEVEL = 1;
	protected String nombre;
	protected int level;
	protected String id;
	protected int salud;
	protected int saludmax;
	protected int ataque;
	protected int defensa;

	public Personaje(String nombre, int saludmax, int attack, int defensa) {
		this.id = UUID.randomUUID().toString();
		this.nombre = nombre;
		this.saludmax = saludmax;
		this.defensa = defensa;
		this.level = INICIAL_LEVEL;
		this.salud = saludmax;

	}

	public abstract void atacar();

	public abstract void subirNivel();

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", level=" + level + ", id=" + id + ", salud=" + salud + ", saludmax="
				+ saludmax + ", ataque=" + ataque + ", defensa=" + defensa + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public int getSaludmax() {
		return saludmax;
	}

	public void setSaludmax(int saludmax) {
		this.saludmax = saludmax;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public static int getInicialLevel() {
		return INICIAL_LEVEL;
	}

	public String getId() {
		return id;
	}

}
