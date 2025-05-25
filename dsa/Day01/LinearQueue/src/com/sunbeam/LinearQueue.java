package com.sunbeam;

public class LinearQueue {
	private int arr[];
	private final int SIZE;
	private int front,rear;
	public LinearQueue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = -1;
	}
	
	public void push(int value) {
		if(isFull())
			System.out.println("Queue is full");
		else {
			//1. reposition rear(inc)
			rear++;
			//2. add value at rear index
			arr[rear] = value;
		}
	}
	
	public int pop() {
		int temp = -1;
		if(isEmpty())
			System.out.println("Queue is empty");
		else {
			temp = arr[front + 1];
			//1. reposition front (inc)
			front++;
			// if front and rear are equal means queue has become empty
			if(front == rear)
				front = rear = -1;
		}
		return temp;
	}
	
	public int peek() {
		int temp = -1;
		if(isEmpty())
			System.out.println("Queue is empty");
		else {
			// 1. read data of front + 1 index
			temp= arr[front + 1];
		}
		return temp;
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
	
	public boolean isFull() {
		return rear == SIZE - 1;
	}
}



















