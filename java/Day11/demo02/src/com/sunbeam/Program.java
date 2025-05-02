package com.sunbeam;

/* 
interface Printable{
	void show(); 
}
interface Displayable{
	void show(); 
}
//multiple interface inheritance will not lead to any ambiguity error
// because interfaces doesn't contain any definitions
class MyClass implements Printable,Displayable{
	@Override
	public void show() {
		System.out.println("MyClass.show() called");
	}
}
public class Program {

	public static void main(String[] args) {
		MyClass obj1 = new MyClass(); 
		obj1.show();
		Printable obj2 = new MyClass(); 
		obj2.show(); 
		Displayable obj3 = new MyClass(); 
		obj3.show();
		

	}

}*/

/* 
interface Printable{
	default void show() {
		System.out.println("Printable.show() called");
	}
}
interface Displayable{
	default void show() {
		System.out.println("Displayable.show() called");
	}
}
//compiler error: duplicate show() method in MyClass.
//if two interfaces have default method with same signature 
//and a class is inherited from that interface,
//then it will lead to ambiguity.
class MyClass implements Printable,Displayable{
	
}
public class Program {

	public static void main(String[] args) {
		MyClass obj1 = new MyClass(); 
		obj1.show();
		Printable obj2 = new MyClass(); 
		obj2.show(); 
		Displayable obj3 = new MyClass(); 
		obj3.show();
		

	}

}*/ 
/* 
interface Printable{
	default void show() {
		System.out.println("Printable.show() called");
	}
}
interface Displayable{
	default void show() {
		System.out.println("Displayable.show() called");
	}
}
//if two interfaces have default method with same signature 
//and a class is inherited from that interface,
//	then it will lead to ambiguity.
//this problem can be resolved by overriding method in sub-class.
class MyClass implements Printable,Displayable{
	@Override
	public void show() {
		System.out.println("MyClass.show() called");
	}
}
public class Program {

	public static void main(String[] args) {
		MyClass obj1 = new MyClass(); 
		obj1.show();
		Printable obj2 = new MyClass(); 
		obj2.show(); 
		Displayable obj3 = new MyClass(); 
		obj3.show();
		

	}

}*/

/* 
//when same signature method is inherited from a super-class
//and a super-interface, the super-class method gets precedence.
//no compiler error for ambiguity
class Printable{
	public void show() {
		System.out.println("Printable.show() called");
	}
}
interface Displayable{
	default void show() {
		System.out.println("Displayable.show() called");
	}
}
class MyClass extends Printable implements Displayable{
}
public class Program {

	public static void main(String[] args) {
		MyClass obj1 = new MyClass(); 
		obj1.show();
		Printable obj2 = new MyClass(); 
		obj2.show(); 
		Displayable obj3 = new MyClass(); 
		obj3.show();
		

	}

}*/ 

/* 
class Printable{
	public void show() {
		System.out.println("Printable.show() called");
	}
}
interface Displayable{
	default void show() {
		System.out.println("Displayable.show() called");
	}
}
// method overrriding -- method is called depending on type of object.
class MyClass extends Printable implements Displayable{
	@Override
	public void show() {
		System.out.println("MyClass.show()");
	}
}
public class Program {

	public static void main(String[] args) {
		MyClass obj1 = new MyClass(); 
		obj1.show();
		Printable obj2 = new MyClass(); 
		obj2.show(); 
		Displayable obj3 = new MyClass(); 
		obj3.show();
		

	}

}*/
interface Printable{
	default void show() {
		System.out.println("Printable.show() called");
	}
}
interface Displayable{
	default void show() {
		System.out.println("Displayable.show() called");
	}
}
//default methods in super interface can be called from sub-class methods
class MyClass implements Printable , Displayable{
	@Override
	public void show() {
		System.out.println("MyClass.show()");
		Displayable.super.show();
		Printable.super.show(); 
		 
	}
}
public class Program {

	public static void main(String[] args) {
		MyClass obj1 = new MyClass(); 
		obj1.show();
		
		

	}

}
