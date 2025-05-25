package com.sunbeam;

import com.sunbeam.List.Node;

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
	private Node tail;
	private int size;
	public List() {
		head = tail = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null && tail == null;
	}
	
	public void addFirst(int value) {
		//1. create node
		Node newnode = new Node(value);
		//2. if list is empty
		if(head == null)
			//add newnode into head and tail
			head = tail = newnode;
		//3. if list is not empty
		else {
			//a. add first node into next of newnode
			newnode.next = head;
			//b. add newnode into prev of first node
			head.prev = newnode;
			//c. move head on newnode
			head = newnode;
		}
		size++;
	}
	
	public void addLast(int value) {
		//1. create node
		Node newnode = new Node(value);
		//2. if list is empty
		if(head == null)
			//add newnode into head and tail
			head = tail = newnode;
		//3. if list is not empty
		else {
			//a. add last node into prev of newnode
			newnode.prev = tail;
			//b. add newnode into next of last node
			tail.next = newnode;
			//c. move tail on newnode
			tail = newnode;
		}
		size++;
	}
	
	public void addPosition(int value, int pos) {
		// validate the position
		if(pos < 1 || pos > size + 1)
			return;
		//1. create newnode
		Node newnode = new Node(value);
		//2. if list is empty
		if(head == null)
			// add newnode into head and tail
			head = tail = newnode;
		// if pos == 1
		else if(pos == 1) {
			addFirst(value);
			return;
		}
		// if pos is last position + 1
		else if(pos == size + 1) {
			addLast(value);
			return;
		}
		//3. if list is not empty
		else {
			// traverse list till pos - 1
			Node trav = head;
			for(int i = 1 ; i < pos - 1 ; i++)
				trav = trav.next;
			//a. add pos node into next of newnode
			newnode.next = trav.next;
			//b. add pos - 1 node into prev of newnode
			newnode.prev = trav;
			//c. add newonde into prev of pos node
			trav.next.prev = newnode;
			//d. add newnode into next of pos - 1 node
			trav.next = newnode;
		}
		size++;
	}
	
	public void deleteFirst() {
		//1. if list is empty
		if(head == null)
			return;
		//2. if list has single node
		else if(size == 1) 
			head = tail = null;
		//3. if list has multiple nodes
		else {
			//a. add null into prev of second node
			head.next.prev = null;
			//b. move head on second node
			head = head.next;
		}
		size--;
	}
	
	public void deleteLast() {
		//1. if list is empty
		if(head == null)
			return;
		//2. if list has single node
		else if(size == 1)
			head = tail = null;
		//3. if list has multiple nodes
		else {
			//a. add null into next of second last node
			tail.prev.next = null;
			//b. move tail on second last node
			tail = tail.prev;
		}
		size--;
	}
	
	public void deletePosition(int pos) {
		//0. validate the position
		if(pos < 1 || pos > size)
			return;
		//1. if list is empty
		if(size == 0)
			return;
		// if pos == 1
		else if(pos == 1) {
			deleteFirst();
			return;
		}
		// if pos == size
		else if(pos == size) {
			deleteLast();
			return;
		}
		//2. if list is not empty
		else {
			//a. traverse till pos node
			Node trav = head;
			for(int i = 1 ; i < pos ; i++)
				trav = trav.next;
			// pos 			--> trav
			// pos + 1		--> trav.next
			// pos - 1		--> trav.prev
			//b. add pos + 1 node into next of pos - 1 node
			trav.prev.next = trav.next;
			//c. add pos - 1 node into prev of pos + 1 node
			trav.next.prev = trav.prev;
		}
		size--;
	}
	
	
	public void display() {
		//1. create trav and start at head
		Node trav = head;
		System.out.print("List : ");
		while(trav != null) {
			//2. visit current node
			System.out.print(" " + trav.data);
			//3. go on next node
			trav = trav.next;
		}//4. repeat above two steps till last node
		System.out.println("");
	}
	
	public void deleteAll() {
		head = tail = null;
		size = 0;
	}
}













