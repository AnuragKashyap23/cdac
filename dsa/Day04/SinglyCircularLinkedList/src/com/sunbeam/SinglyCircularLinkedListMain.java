package com.sunbeam;

public class SinglyCircularLinkedListMain {

	public static void main(String[] args) {
		
		List l = new List();
		
		l.addFirst('n');
		l.addFirst('u');
		l.addFirst('s');
		l.addLast('b');
		l.addLast('e');
		l.addLast('a');
		l.addLast('m');
		
		l.deleteFirst();
		l.deleteLast();
		
		l.display();

	}

}
