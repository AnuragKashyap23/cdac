package com.sunbeam;
class Person{
	private String name; 
	private int age; 
	public Person() {
		System.out.println("public Person()");
		this.name = ""; 
		this.age = 0; 
	}
	public Person(String name, int age) {
		System.out.println("public Person(String name, int age)");
		this.name = name;
		this.age = age;
	}
	public void showRecord( ) {
		System.out.printf("Name : %s\nAge : %d\n",this.name,this.age);
	}
	
}
class Employee extends Person{
	//private String name; 
	//private int age; 
	private int empid; 
	private double salary; 
	public Employee() {
		System.out.println("public Employee()");
	}
	public Employee(String name, int age, int empid, double salary) {
		super(name,age);
		System.out.println("public Employee(String name, int age, int empid, double salary)");
		this.empid = empid;
		this.salary = salary;
	}
	public void printRecord() {
		super.showRecord();
		System.out.printf("Empid : %d\nSalary : %.2f",this.empid,this.salary);
	}
	
}
public class Program {

	public static void main(String[] args) {
		//Employee e = new Employee(); 
		//e.printRecord();
		Employee e = new Employee("Aditya", 31, 1, 1000.00); 
		e.printRecord();
	}
	public static void main1(String[] args) {
		//Person p = new Person(); 
		//p.showRecord();
		Person p = new Person("Aditya", 31); 
		p.showRecord();
	}

}
