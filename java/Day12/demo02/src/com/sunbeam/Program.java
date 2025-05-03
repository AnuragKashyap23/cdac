package com.sunbeam;

import java.util.Comparator;
import java.util.Date;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Program {
	
	// lambda expr = short-hand implementation of SAM (functional interface)
	// method ref = short-hand of lambda expr
	public static void main(String[] args) {
		//BinaryOperator<Integer> op1 = (a,b) -> Integer.sum(a, b);
		
		//static method reference 
		// static method of a class 
		//--> ClassName.method(arg1, arg2); i.e. static method called on ClassName
		BinaryOperator<Integer> op1 = Integer::sum; 
		int x = 10 , y = 20; 
		//int res = op1.apply(x, y); 
		//System.out.println("Res : "+res);
		
		// :: --> method-reference operator 
		//non-static method reference
		//Comparator<String> cmp = (a,b) -> a.compareTo(b);
		Comparator<String> cmp = String::compareTo; 
		//String s1 = "Sunbeam" , s2 = "SunBeam"; 
		//System.out.println("res : "+cmp.compare(s1, s2));
		
		//object method reference 
		//non-static method to call on obj
		//--> obj.method(arg); i.e. non-static method called on given object
		//Consumer<Double> c = d -> System.out.println(d);
		Consumer<Double> c = System.out::println; 
		
		//double d = 11.33; 
		//c.accept(d); 
		
		//constructor reference
		//Supplier<Date> dt = () -> new Date();
		Supplier<Date> dt = Date::new; //ctor will get called 
		//param-less constructor is called after creating object of given class.
		
		System.out.println("Date : "+dt.get()); 
		
		
	}

}
