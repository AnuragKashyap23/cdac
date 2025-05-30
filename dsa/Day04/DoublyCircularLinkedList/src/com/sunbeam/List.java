package com.sunbeam;

public class List {
	static class Node{
		private int data;
		private Node next;
		private Node prev;
		public Node(int value) {
			data = value;
			next = prev = null;
		}
	}
	
	private Node head;
	
	public List() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addFirst(int value) {
		//1. create node
		Node nn = new Node(value);
		//2. if list is empty
		if(head == null) {
			//a. add newnode into head
			head = nn;
			//b. make list circular
			head.prev = head.next = head;
		}
		//3. if list is not empty
		else {
			//a. add first node into next of newnode
			nn.next = head;
			//b. add last node into prev of newnode
			nn.prev = head.prev;
			//c. add newnode into next of last node
			head.prev.next = nn;
			//d. add newnode into prev of first node
			head.prev = nn;
			//e. move head on newnode
			head = nn;
		}
	}
	
	public void addLast(int value) {
		//1. create node
		Node nn = new Node(value);
		//2. if list is empty
		if(head == null) {
			//a. add newnode into head
			head = nn;
			//b. make list circular
			head.prev = head.next = head;
		}
		//3. if list is not empty
		else {
			//a. add first node into next of newnode
			nn.next = head;
			//b. add last node into prev of newnode
			nn.prev = head.prev;
			//c. add newnode into next of last node
			head.prev.next = nn;
			//d. add newnode into prev of first node
			head.prev = nn;
		}
	}
	
	public void deleteFirst() {
		//1. if list is empty
		if(head == null)
			return;
		//2. if list has single node
		else if(head.next == head)
			head = null;
		//3. if list has multiple nodes
		else {
			//a. add second node into next of last node
			head.prev.next = head.next;
			//b. add last node into prev of second node
			head.next.prev = head.prev;
			//c. move head on second node
			head = head.next;
		}
	}
	
	public void deleteLast() {
		//1. if list is empty
		if(head == null)
			return;
		//2. if list has single node
		else if(head.next == head)
			head = null;
		//3. if list has multiple nodes
		else {
			//a. add first node into next of second last node
			head.prev.prev.next = head;
			//b. add second last node into prev of first node
			head.prev = head.prev.prev;
		}
	}
	
	public void fDisplay() {
		//1. if list is empty
		if(head == null)
			return;
		//2. if list is not empty
		//2.1 create trav and start at head
		System.out.print("Forward List : ");
		Node trav = head;
		do {
			//2.2 visit current node
			System.out.print(" " + trav.data);
			//2.3 go on next node
			trav = trav.next;
		}while(trav != head);//2.4 repeate for every node
		System.out.println("");
	}
	
	public void bDisplay() {
		//1. if list is empty
		if(head == null)
			return;
		//2. if list is not empty
		System.out.print("Backward List : ");
		//2.1 create trav and start at last node
		Node trav = head.prev;
		do {
			//2.2 visit current node
			System.out.print(" " + trav.data);
			//2.3 go on prev node
			trav = trav.prev;
		}while(trav != head.prev);//2.4 repeate for every node
		System.out.println("");
	}
	
	public void deleteAll() {
		head = null;
	}
	
}














