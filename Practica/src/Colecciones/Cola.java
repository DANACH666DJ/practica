package Colecciones;

import java.util.PriorityQueue;

public class Cola {
	public static void main(String[] args) {
		PriorityQueue <Integer> cola = new PriorityQueue <Integer> ();
		cola.add(1);
		cola.add(2);
		cola.add(3);
		
		System.out.println(cola.peek());
		System.out.println(cola.peek());
		
		System.out.println(cola.poll());
		System.out.println(cola.poll());
		System.out.println(cola.peek());
		
		
		

		}

}
