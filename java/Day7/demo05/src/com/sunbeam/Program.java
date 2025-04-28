package com.sunbeam;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


// Bounded generic types (generic class with bounded type parameter(T)
// Number and subType is allowed 
class Box<T extends Number>{
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}
public class Program {

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>(); // OK ( Integer is a Number) 
		b1.setObj(new Integer(10));
		System.out.println("r1 : "+b1.getObj());
		
		Box<Double> b2 = new Box<>(); 
		b2.setObj(new Double(11.33));
		System.out.println("r2 : "+b2.getObj());
		
		Box<Long> b3 = new Box<>(); 
		b3.setObj(new Long(11));
		System.out.println("r3 : "+b3.getObj());
		
		//Box<String> b4 = new Box<>(); //String is not a Number 
		//Box<Object> b5 = new Box<>(); //Object is not a Number 
		//Box<Date> b6 = new Box<>(); // Date is not a Number 
		//Box<Boolean>b7 = new Box<>(); // Boolean is not a Number 
	}

}



