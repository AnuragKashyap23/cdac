package com.sunbeam;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Program {
	
	/* 
	public static void main(String[] args) {
		Queue<String> q = new ArrayDeque<String>( ); //LinkedList();
		//Queue<String> q = new LinkedList<String>(); 
		q.offer("one"); 
		q.offer("two");
		q.offer("three");
		q.offer("four");
		q.offer("five"); 
		
		System.out.println("First element is " + q.peek());
		
		while(!q.isEmpty()) {
			String ele = q.poll(); 
			System.out.println(ele);
		}
		System.out.println("Popping element from empty queue : "+q.poll());
	}*/ 
	public static void main(String[] args) {
		Queue<String> q = new ArrayDeque<String>( ); 
		q.add("one");
		q.add("two");
		q.add("three");
		q.add("four");
		q.add("five");
		
		System.out.println("First element is " + q.element());
		
		while(!q.isEmpty()) {
			String ele = q.remove(); 
			System.out.println(ele);
		}
		System.out.println("Popping the element from empty queue" + q.remove());
	}

}
