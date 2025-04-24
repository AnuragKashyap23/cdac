package com.sunbeam;
class Test{
	private int num1;  
	private int num2; 
	private static int num3;
	
	public Test(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	static {
		System.out.println("Static block --1");
		num3 = 30; 
	}
	static {
		System.out.println("Static block --2");
		num3 = 40; 
	}
	public void display( ) {
		System.out.printf("num1 : %d\nnum2 : %d\nnum3 : %d\n",this.num1,this.num2,Test.num3);
	}
}
public class Program {

	public static void main(String[] args) {
		Test t1 = new Test(10, 20); 
		Test t2 = new Test(30, 40);
		Test t3 = new Test(50, 60);
		t1.display();
		t2.display();
		t3.display();

	}

}
