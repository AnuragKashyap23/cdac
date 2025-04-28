package com.sunbeam;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


// Bounded generic types (generic class with bounded type parameter(T)
// Number and subType is allowed 
class Box<T>{
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}
public class Program {

	public static void main1(String[] args) {
		Box<?>b1; //? wild-card (Unbounded generic type references) 
		//( ? is wildcard -- any type is okay while creating object)
		 b1 = new Box<Integer>(); // OK
		//b1 = new Box<Double>( ); // OK
		//b1 = new Box<Boolean>( ); // OK
		//b1 = new Box<Object>( ); // OK
		 b1.getObj(); //get : Object 
	}
	public static void main2(String[] args) {
		Box<? extends Number>b1; 
	    //(upper-bounded generic type references)
		//(any type is okay that is Number or inherited from Number)
		 b1 = new Box<Integer>(); // Integer is a Number  
		//b1 = new Box<Double>(); // Double is a Number 
		//b1 = new Box<Boolean>();// ERROR ( Boolean is not a Number) 
		//b1 = new Box<Object>(); // ERROR(Object is not a Number) 
		 b1.getObj(); // get : Number 
	}
	public static void main3(String[] args) {
		Box<? super Number> b1; 
		//( lower-bounded generic type references) 
		//( any type is okay that is Number or its super-class) 
		//b1 = new Box<Integer>();// NOT OK ( Integer is not a super-class of Number) 
		 //b1 = new Box<Object>();// OK ( Object is a super-class of Number) 
		b1 = new Box<Number>(); // OK 
		//b1 = new Box<Boolean>(); // NOT OK 
		//b1 = new Box<Double>(); // NOT OK 
		b1.getObj(); //get : Object 
	}
	
	// static methods 
	public static void printAnyBox(Box<?> b) {
		Object obj = b.getObj(); 
		System.out.println("printBox() -- In Box---" + obj);
	}
	public static void printNumberBox(Box<? extends Number> b) {
		Number obj = b.getObj(); 
		System.out.println("printBox() -- In Box---" + obj);
	}
	public static void printSuperNumberBox(Box<? super Number> b) {
		Object obj = b.getObj(); 
		System.out.println("printBox() -- In Box---" + obj);
	}
	
	public static void main(String[] args) {
		//create 4 boxes --- String , Integer , Number(double) , Object
		
		Box<String> b1 = new Box<String>(); 
		b1.setObj("hello");
		
		Box<Integer> b2 = new Box<Integer>(); 
		b2.setObj(new Integer(10));
		
		Box<Number> b3 = new Box<Number>(); 
		b3.setObj(new Long(11));
		
		
		Box<Object> b4 = new Box<Object>(); 
		b4.setObj(new Object());

		//printAnyBox(b1);
		//printAnyBox(b2);
		//printAnyBox(b3);
		//printAnyBox(b4);
		
		//printNumberBox(b1);//String is not a Number 
		//printNumberBox(b2); // OK 
		//printNumberBox(b3); // OK 
		//printNumberBox(b4); // NOT OK (Object is a super-class of Number) 
		
		//printSuperNumberBox(b1);// String is not a super-class of Number 
		//printSuperNumberBox(b2);// Integer is not a super-class of Number 
		printSuperNumberBox(b3);// OK 
		printSuperNumberBox(b4);// OK 
	}

}



