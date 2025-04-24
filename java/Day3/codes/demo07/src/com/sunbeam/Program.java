package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		Human[] arr = new Human[4];
		
		arr[0] = new Human(31, 78, 178);
		arr[1] = new Human(32, 72, 182);
		arr[2] = new Human(33, 73, 156);
		arr[3] = new Human(34, 74, 142);
		
		
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i].display();
		}

	}

}
