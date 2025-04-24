package com.sunbeam;
class MyClass{
	
	private int num1 = 10;// field init  
	private int num2 = 20;// field init
	public MyClass() {
		System.out.println("Constructor");
		this.num1 = 50; 
		this.num2 = 60; 
	}
	private int num3;
	private int num4; 
	{
		this.num3 = 30; // object init / instance init ( java 5.0) 
		System.out.println("initializer block --- 1");
	}
	{
		this.num4 = 40; // object init / instance init ( java 5.0) 
		System.out.println("initializer block --- 2");
	}
	
	public void display( ) {
		System.out.printf("num1 : %d\nnum2 : %d\nnum3 : %d\nnum4 : %d\n",num1,num2,num3,num4);
	}
}
public class Program {

	public static void main(String[] args) {
		MyClass obj = new MyClass(); 
		obj.display();

	}

}
