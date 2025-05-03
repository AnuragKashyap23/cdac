package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
//Application version 2.0 
@Deprecated
class MyClass{
	@Deprecated
	public void oldMethod( ) {
		System.out.println("MyClass.oldMethod()");
	}
	public void newMethod( ) {
		System.out.println("MyClass.newMethod()");
	}
}
public class Program {

	@SuppressWarnings("unused")
	public static void main1(String[] args) {
		@SuppressWarnings({ "rawtypes" })
		List list = new ArrayList( );  
		
		String str = "Hello"; 

	}
	public static void main(String[] args) {
		MyClass obj = new MyClass(); 
		obj.oldMethod();
		
		MyClass obj2 = new MyClass(); 
		obj2.newMethod(); 
	}

}
