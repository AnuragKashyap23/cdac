package com.sunbeam;

public class Program {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1 = new Person("Aditya", 170, 56, new Date(1, 1, 2020)); 
		Person p2 = (Person) p1.clone();  
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		p2.getBirth().setDay(26);
		p2.getBirth().setMonth(4);
		p2.getBirth().setYear(2025);
		
		System.out.println();
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}

}
