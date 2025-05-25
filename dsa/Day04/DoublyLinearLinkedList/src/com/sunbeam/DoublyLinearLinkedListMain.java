package com.sunbeam;

public class DoublyLinearLinkedListMain {

	public static void main(String[] args) {
		
		List l1 = new List();
		
		l1.addFirst(40);
		l1.addFirst(30);
		l1.addFirst(20);
		l1.addFirst(10);
		
		//l1.addLast(50);
		//l1.addLast(60);
		
		//l1.addPosition(100, 6);
		
		//l1.deleteFirst();
		//l1.deleteLast();
		
		l1.deletePosition(3);
		
		System.out.println("List size : " + l1.size());
		
		l1.display();

	}

}








