package com.sunbeam;
interface A{
	/*public abstract*/void f1(); 
	/*public abstract*/void f3(); 
}
interface B{
	/*public abstract*/void f2(); 
	/*public abstract*/void f3(); 
}
class C implements A , B{

	@Override
	public void f2() {
		System.out.println("C.f2()");
	}
	@Override
	public void f1() {
		System.out.println("C.f1()");
	}
	@Override
	public void f3() {
		System.out.println("C.f3()");
	}
	
}
public class Program {

	public static void main(String[] args) {
		//A a = new C(); // upcasting 
		//a.f1();
		//a.f3();
		
		B b = new C(); 
		b.f2();
		b.f3();
	}

}
