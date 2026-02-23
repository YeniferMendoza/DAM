package colasQueue;

import exceptions.NonExistentElementException;

public interface Cola<T> {
	
	void enqueue(T dato); // Inserta un elemento al final de la cola

	T dequeue() throws NonExistentElementException; // Elimina y devuelve el primer elemento de la cola

	T peek() throws NonExistentElementException; // Devuelve el primer elemento sin eliminarlo

	boolean isEmpty(); // Verifica si la cola está vacía

	int size(); // Retorna el número de elementos en la cola
}
