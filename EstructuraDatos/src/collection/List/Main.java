package collection.List;

import java.util.Deque;
import java.util.LinkedList;
//import java.util.List;

public class Main {

	public static void main(String[] args) {
//		List<Integer> numeros = new LinkedList<Integer>();
//		numeros.add(1);
//		numeros.add(0,10);
//		System.out.println();
//		
		Deque<String> deque = new LinkedList<>();
		deque.add("Hola");
		deque.push("Hola");
		deque.offer("Hola");
		deque.addLast("Hola");
		deque.offerLast("Hola");
		deque.addFirst("Hola");
		deque.offerFirst("Hola");
		deque.remove();
		deque.pop();
		deque.poll();
		deque.isEmpty();
		deque.peek();
		deque.peekFirst();
		deque.peekLast();
		deque.iterator();
		deque.descendingIterator();
		deque.size();
		deque.clear();
	}

}
