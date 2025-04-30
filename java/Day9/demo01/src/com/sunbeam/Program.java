package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

class Person{
	private String name; 
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public Person(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return String.format("%-15s",this.name); 
	}
	
}
class Employee extends Person{
	private int empid; 
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name , int empid) {
		super(name);  
		this.empid = empid;
	}
	public int getEmpid() {
		return empid;
	}
	@Override
	public String toString() {
		return String.format("%-15s%-10d",super.toString(),this.empid); 
	}
}
class Student extends Person{
	private int roll; 
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getRoll() {
		return roll;
	}
	public Student(String name , int roll) {
		super(name); 
		this.roll = roll;
	}
	@Override
	public String toString() {
		return String.format("%-15s%-10d",super.toString(),this.roll); 
	}
}
class SortByName implements Comparator<Person>{
	@Override
	public int compare(Person x, Person y) {
		return x.getName().compareTo(y.getName()); 
	}
}
class SortById implements Comparator<Person>{
	@Override
	public int compare(Person p1, Person p2) {
		if(p1 instanceof Employee && p2 instanceof Employee) {
			Employee obj1 = (Employee) p1; 
			Employee obj2 = (Employee) p2;
			return obj1.getEmpid() - obj2.getEmpid(); 
		}
		else if(p1 instanceof Student && p2 instanceof Student) {
			Student obj1 = (Student) p1; 
			Student obj2 = (Student) p2;
			return obj1.getRoll() - obj2.getRoll(); 
		}
		else if(p1 instanceof Employee && p2 instanceof Student) {
			Employee obj1 = (Employee) p1; 
			Student obj2 = (Student) p2;
			return obj1.getEmpid() - obj2.getRoll(); 
		}
		else {
			Student obj1 = (Student) p1; 
			Employee obj2 = (Employee) p2;
			return obj1.getRoll() - obj2.getEmpid(); 
		}
	}
}
public class Program {
	public static Person[] getPerson( ) {
		Person[] arr = new Person[4]; 
		arr[0] = new Employee("Aditya", 3); 
		arr[1] = new Student("Amar", 2); 
		arr[2] = new Employee("Omkar", 1); 
		arr[3] = new Student("Rohan", 4); 
		return arr; 
	}
	public static void print(Person[] arr , Comparator<Person> cmp) {
		Arrays.sort(arr, cmp); 
		for(int i = 0 ; i < arr.length ; i++)
			System.out.println(arr[i]);
	}
	public static void main(String[] args) {
		Person[] arr = Program.getPerson(); 
		
		//Program.print(arr, new SortByName());
		Program.print(arr,null);
	}

}
