package com.sunbeam;

public class Stack {
	private int arr[];
	private final int SIZE;
	private int top;
	public Stack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = -1;
	}
	
	public void push(int value) {
		if(isFull())
			System.out.println("Stack is full");
		else {
			//1. reposition top (inc)
			top++;
			//2. add value at top index
			arr[top] = value;
		}
	}
	
	public int pop() {
		int temp = -1;
		if(isEmpty())
			System.out.println("Stack is empty");
		else {
			temp = arr[top];
			//1. reposition top (dec)
			top--;
		}
		return temp;
	}
	
	public int peek() {
		int temp = -1;
		if(isEmpty())
			System.out.println("Stack is empty");
		else
			// read / return value of top index
			temp = arr[top];
		return temp;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == SIZE - 1;
	}
}
















