package estructuraDatosDinamicos;

public class ListaEnlazadaSimple<T> implements Lista<T> {
	private Nodo<T> cabeza;
	private int tamaño;

	public ListaEnlazadaSimple() {
		this.cabeza = null; // Inicialmente, la lista está vacía
		this.tamaño = 0;
	}

	@Override
	public void agregarInicio(T dato) {
		Nodo<T> nuevoNodo = new Nodo<T>(dato);
		if (estaVacia()) {
			this.cabeza = nuevoNodo;
		} else {
			nuevoNodo.siguiente = this.cabeza; // El nuevo nodo apunta al nodo actual
			this.cabeza = nuevoNodo; // La cabeza ahora es el nuevo nodo
		}
		this.tamaño++;
	}

	@Override
	public void agregarFinal(T dato) {
		Nodo<T> nuevoNodo = new Nodo<T>(dato);
		if (estaVacia()) {
			this.cabeza = nuevoNodo;
		} else {
			Nodo<T> auxiliar = this.cabeza;
			while (auxiliar.siguiente != null) { // Recorre la lista hasta el último nodo
				auxiliar = auxiliar.siguiente;
			}
			auxiliar.siguiente = nuevoNodo; // El último nodo apunta al nuevo nodo
		}
		this.tamaño++;

	}

	@Override
	public void agregar(T dato, int index) throws IndexOutOfBoundsException {
		if (index < 0 || index > tamaño) {
			throw new IndexOutOfBoundsException("Índice fuera de rango");
		} else if (index == tamaño) {
			agregarFinal(dato);
		} else {
			Nodo<T> nuevoNodo = new Nodo<T>(dato);
			Nodo<T> auxiliar = this.cabeza;
			for (int i = 0; i < index-1; i++) {
				auxiliar = auxiliar.siguiente;
			}
			nuevoNodo.siguiente = auxiliar.siguiente; // El nuevo nodo apunta al siguiente nodo
			auxiliar.siguiente = nuevoNodo; // El nodo anterior apunta al nuevo nodo
			this.tamaño++;
		}

	}

	@Override
	public void eliminar(int index) throws IndexOutOfBoundsException {
		if(index< 0 || index >= this.tamaño) {
			throw new IndexOutOfBoundsException("Índice fuera de rango");
		}
		if(index == 0) {
			this.cabeza = this.cabeza.siguiente;
		}
		else {
			Nodo<T> auxiliar = this.cabeza;
			for(int i = 0; i < index - 1; i++) {
				auxiliar = auxiliar.siguiente;
			}
			auxiliar.siguiente = auxiliar.siguiente.siguiente; // El nodo anterior apunta al nodo siguiente al nodo a eliminar
		}
		this.tamaño--;

	}

	@Override
	public int contiene(T dato) {
		Nodo<T> auxiliar = this.cabeza;
		for (int i = 0; i < tamaño; i++) {
			if (auxiliar.dato.equals(dato)) {
				return i;
			}
			auxiliar = auxiliar.siguiente;
		}
		return -1;
	}

	@Override
	public int tamaño() {
		return this.tamaño;
//		int contador = 0;
//		for(int i = 0; i < this.tamaño; i++) {
//			contador++;
//		}
//		return contador;
//		
	}

	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		if (index >= tamaño) {
			throw new IndexOutOfBoundsException("Índice fuera de rango");
		} else {
			Nodo<T> auxiliar = this.cabeza;
			for (int i = 0; i < index; i++) {
				auxiliar = auxiliar.siguiente;
			}
			return auxiliar.dato;
		}
	}

	@Override
	public void imprimir() {
		Nodo<T> auxiliar = this.cabeza;
		while (auxiliar != null) {
			System.out.print(auxiliar.dato + " ");
			auxiliar = auxiliar.siguiente;
		}
		System.out.println();
	}

	@Override
	public boolean estaVacia() {
		if (this.cabeza == null) {
			return true;
		}
		return false;
	}
}
