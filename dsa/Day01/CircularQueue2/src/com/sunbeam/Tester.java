package com.sunbeam;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		CircularQueue q = new CircularQueue(4);
		
		int choice;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1. Push\n2. Pop\n3. Peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				// push
				System.out.print("Enter value to be inserted : ");
				int value = sc.nextInt();
				q.push(value);
				break;
			case 2:
				// pop
				System.out.println("Poped value : " + q.pop());
				break;
			case 3:
				System.out.println("Peeked value : " + q.peek());
				//peek
				break;
			}
		}while(choice != 0);
		
		
		sc.close();
	}

}







