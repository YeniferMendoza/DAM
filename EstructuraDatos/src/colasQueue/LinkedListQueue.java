package colasQueue;

import estructuraDatosDinamicos.Nodo; 
import exceptions.NonExistentElementException;

public class LinkedListQueue<T> implements Cola<T> {
	private Nodo<T> front;
	private Nodo<T> rear;
	private int size;

	public LinkedListQueue() {
		this.front = this.rear = null;
		size = 0;
	}

	@Override
	public void enqueue(T dato) {
		Nodo<T> newNodo = new Nodo<T>(dato);
		if (this.isEmpty()) {
			this.front = this.rear = newNodo;
			size++;
		} else {
			this.rear.setSiguiente(newNodo);
			this.rear = newNodo;
			size++;
		}
	}

	@Override
	public T dequeue() throws NonExistentElementException {
		if (this.isEmpty()) {
			throw new NonExistentElementException();
		} else {
			Nodo<T> auxiliar= this.front;
			this.front = this.front.getSiguiente();
			if(this.front== null) {
				this.rear = null;
				size--;
				return auxiliar.getDato();
			}else {
				size--;
				return auxiliar.getDato();
			}
		}
	}

	@Override
	public T peek() throws NonExistentElementException {
//		return this.front == null ? null : this.front.getDato();
		if (this.isEmpty()) {
			throw new NonExistentElementException();
		}else {
			return this.front.getDato();
		}
	}

	@Override
	public boolean isEmpty() {
		return this.front==null;
	}

	@Override
	public int size() {
		return this.size;
	}

}
