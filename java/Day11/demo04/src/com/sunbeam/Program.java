package com.sunbeam;

import java.util.function.BinaryOperator;

//lambda expressions are referenced by functional interface reference.
//lambda arg scope is limited to lambda expression body/implementation.
public class Program {

	public static void main(String[] args) {
		//non-capturing lambda 
		BinaryOperator<Integer> op1 = (x,y) -> x + y;
		
		//capturing lambda 
		int z = 10; 
		BinaryOperator<Integer> op2 = (x,y) -> x + y + z; 
		//z++; //effectively final
		
		int a = 22 , b = 7; 
		int res = op1.apply(a, b); 
		System.out.println("res : "+res);
		
		res = op2.apply(a, b); 
		System.out.println("res : "+res);
		
		calc(20,10,(x,y) -> x + y); 
		calc(20,10,(x,y) -> x * y * z); 
	}
	public static void calc(int n1 , int n2 , BinaryOperator<Integer> op) {
		int res = op.apply(n1, n2); 
		System.out.println("res : "+res);
	}

}
