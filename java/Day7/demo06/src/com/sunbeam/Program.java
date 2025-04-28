package com.sunbeam;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//generic programming -- Java 5.0 or above
class Box<TYPE>{
	private TYPE obj;

	public TYPE getObj() {
		return obj;
	}

	public void setObj(TYPE obj) {
		this.obj = obj;
	}
	
}
public class Program {

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>(); //TYPE : Integer 
		b1.setObj(new Integer(123));
		Integer r1 = b1.getObj(); 
		System.out.println("r1 : "+r1);
		
		Box<Double> b2 = new Box<Double>(); //TYPE : Double
		b2.setObj(new Double(11.33));
		Double r2 = b2.getObj();
		System.out.println("r2 : "+r2);
		
		Box<Date> b3 = new Box<Date>();  //TYPE : Date
		b3.setObj(new Date());
		Date r3 = b3.getObj(); 
		System.out.println("r3 : "+r3);
		
		Box<Integer> b4 = new Box<Integer>(); //TYPE : Integer
		//b4.setObj("123");//type-checking at compile time -- type-safe 
	
		//Box b5 = new Box(); // raw types 
		//b5.getObj();  // get : Object 
		
		Box<Object> b6 = new Box<Object>(); //TYPE : Object
		b6.getObj(); // get : Object  
		
		 
		
		List<Integer>list = new ArrayList<Integer>( ); 
		list.add(10); 
		list.add(20); 
		list.add(30); 
		list.add(40);
		//list.add("50"); //type-checking at compile time 
		
		for(Integer e : list) {
			System.out.println(e);
		}
	}

}



