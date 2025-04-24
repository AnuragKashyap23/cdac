package com.sunbeam;
class Person{
	String name; 
	int age; 
	public Person() {
		System.out.println("public Person()");
		this.name = ""; 
		this.age = 0; 
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void showRecord( ) {
		System.out.printf("Name : %s\nAge : %d\n",this.name,this.age);
	}
	
}
class Employee extends Person{
	int empid; 
	double salary; 
	public Employee() {
		System.out.println("public Employee()");
	}
	public Employee(String name, int age, int empid, double salary) {
		super(name,age);
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
		Person p = new Person("Aditya", 31);// java.lang.ClassCastException
		Employee e = (Employee) p; // downcasting 
	}
	public static void main6(String[] args) {
		Person p = new Employee("Aditya", 31, 1, 1000.00); 
		//System.out.println("Name : "+p.name);
		//System.out.println("Age : "+p.age);
		Employee e = (Employee) p; // downcasting  
		System.out.println("Name : "+e.name); // OK 
		System.out.println("Age : "+e.age);// OK 
		System.out.println("Empid : "+e.empid);// OK 
		System.out.println("Salary : "+e.salary);//OK 
	}
	public static void main5(String[] args) {
		Employee e = new Employee("Aditya", 31, 1, 1000.00); 
		Person p = e; 
		//System.out.println("Name : "+p.name);
		//System.out.println("Age : "+p.age);
		e = (Employee) p; //downcasting 
		System.out.println("Name : "+e.name); // OK 
		System.out.println("Age : "+e.age);// OK 
		System.out.println("Empid : "+e.empid);// OK 
		System.out.println("Salary : "+e.salary);//OK 

	}
	public static void main4(String[] args) {
		Employee e = new Employee("Aditya", 31, 1, 1000.00);
//		System.out.println("Name : "+e.name);
//		System.out.println("Age : "+e.age);
//		System.out.println("Empid : "+e.empid);
//		System.out.println("Salary : "+e.salary);
		Person p = (Person)e; // upcasting 
		System.out.println("Name : "+p.name);
		System.out.println("Age : "+p.age);
		//System.out.println("Empid : "+p.empid); // NOT OK
		//System.out.println("Salary : "+p.salary); // NOT OK
	}
	public static void main3(String[] args) {
		Employee e = new Employee("Aditya", 31, 1, 1000.00); 
		System.out.println("Name : "+e.name);
		System.out.println("Age : "+e.age);
		System.out.println("Empid : "+e.empid);
		System.out.println("Salary : "+e.salary);
	}
	public static void main2(String[] args) {
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
