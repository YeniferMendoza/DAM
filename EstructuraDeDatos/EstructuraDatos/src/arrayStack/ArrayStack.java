package arrayStack;

import java.util.EmptyStackException;

import stack.Pila;

public class ArrayStack<T> implements Pila<T> {
	private T[] stack;
	private int top;
	private static final int INITIAL_CAPACITY = 10;
	private static final float INCREMENT_PERCENT = 0.80f;
	private static final float INCREMENT_RECISE = 0.50f;
	private static final float DECREMENT_PERCENT = 0.20f;

	

	public ArrayStack() {
		stack = (T[]) new Object[INITIAL_CAPACITY]; // Creación segura con un cast
		top = -1;
	}

	@Override
	public void push(T dato) {
		int capacity = (int) (INCREMENT_PERCENT * this.stack.length);
		if(this.top > capacity) {
			int newSize = (int) (this.stack.length * (1 + INCREMENT_RECISE));
			this.resize(newSize);
		}
		this.top++;
		this.stack[this.top] = dato;
	}
	
	private void resize(int size) {
		T[] newStack = (T[])new Object[size];
		for(int i = 0; i <= this.top; i++) {
			newStack[i] = this.stack[i];
		}
		this.stack = newStack;
	}

	@Override
	public T pop() throws EmptyStackException{
		if(this.isEmpty()) {
			throw new EmptyStackException();
		}
		T data = this.stack[this.top];
		top--;
		int min =(int) (DECREMENT_PERCENT * this.stack.length);
		if(this.top < min && this.stack.length > INITIAL_CAPACITY) {
			int newSize = this.top + (int)(this.top * INCREMENT_RECISE);
			resize(Math.max(newSize, INITIAL_CAPACITY));
		}
		return data;
		
	}
	//LIFO, FIFO

	@Override
	public T peek() throws EmptyStackException {
		if(this.isEmpty()) {
			throw new EmptyStackException();
		}
		return this.stack[this.top];
	}

	@Override
	public boolean isEmpty() {
		return this.top==-1;
	}
}
