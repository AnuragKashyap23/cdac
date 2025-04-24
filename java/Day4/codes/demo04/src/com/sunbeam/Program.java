package com.sunbeam;

class Math{
	//					2             3 	
	public static int pow(int base , int index) {
		int result = 1; 
		for(int i = 1 ; i<=index ; i++) {
			result = result * base; 
		}
		return result; 
	}
	//Why static method do not get this reference?
}
public class Program {

	public static void main(String[] args) {
		int res = Math.pow(2, 3); 
		System.out.println("Res : "+res);
	}

}
