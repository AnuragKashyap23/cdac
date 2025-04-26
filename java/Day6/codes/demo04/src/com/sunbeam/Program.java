package com.sunbeam;
class MYClass{
	public MYClass() {
		System.out.println("MyResource");
	}
	//GC will finalize method before destroying the object 
	@Override
	public void finalize() throws Throwable {
		System.out.println("Resource closed");
	}
}
public class Program {

	public static void main(String[] args) {
		MYClass obj = new MYClass(); 
		obj = null; //elgible for gc 
		System.gc();  //request gc 
		System.out.println("Bye");
		

	}

}
