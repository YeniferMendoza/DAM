package estructuraDatosDinamicos;

public class Nodo<T> {
	// Dato almacenado en el nodo
	T dato;
	// Referencia al siguiente nodo
	Nodo<T> siguiente;

	public Nodo(T dato) {
		this.dato = dato;
		// Inicialmente, no apunta a ningún nodo
		this.siguiente = null;
	}

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public Nodo<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}
	
}