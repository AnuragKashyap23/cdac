package com.sunbeam;
class Parent{
	public final void display( ) { // logically 100% complete 
		System.out.println("Parent.display()");
	}
}
class Child extends Parent{
	/* 
	 ( cannot override final method; will raise compiler error) 
	@Override
	public void display() {
		//TODO 
	}*/ 
}
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
