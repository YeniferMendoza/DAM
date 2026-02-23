package stack;

import java.util.EmptyStackException;

public interface Pila<T> {
	void push(T dato); // Agrega un elemento en la cima

	T pop(); // Elimina y devuelve el elemento en la cima

	T peek(); // Devuelve el elemento en la cima sin eliminarlo

	boolean isEmpty() throws EmptyStackException; // Verifica si la pila está vacía
}
