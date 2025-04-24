package com.sunbeam;
class Employee{
	private int empid; 
	private String name; 
	private double salary; 
	public Employee() {
		this.empid = 0; 
		this.name = ""; 
		this.salary = 0.0; 
	}
	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public void printRecord( ) {
		System.out.printf("Empid : %d\nName : %s\nSalary : %.2f\n",empid,name,salary);
	}
	
}
public class Program {
	public static Employee[] getIntances( ) {
		Employee[] arr = new Employee[3];
		arr[0] = new Employee(1, "Aditya", 1000.00);
		arr[1] = new Employee(2, "Rahul", 2000.00);
		arr[2] = new Employee(3, "Akshay", 3000.00);
		return arr; 
	}
	public static void printEmployees(Employee[] arr) {
		for(int i = 0 ; i < arr.length ; i ++) {
			arr[i].printRecord();
		}
	}
	public static void main(String[] args) {
		Employee[] arr = Program.getIntances(); 
		Program.printEmployees(arr);
	}
	public static void main3(String[] args) {
		Employee[] arr = new Employee[3];
		arr[0] = new Employee(1, "Aditya", 1000.00);
		arr[1] = new Employee(2, "Rahul", 2000.00);
		arr[2] = new Employee(3, "Akshay", 3000.00);
		
		for(Employee e : arr) {
			e.printRecord(); 
		}
	}
	public static void main2(String[] args) {
		Employee[] arr = new Employee[] {new Employee() , new Employee(), new Employee()}; 
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i].printRecord(); 
		}
	}
	public static void main1(String[] args) {
		Employee[] arr; // reference 
		arr = new Employee[3]; // instance 
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		
	}

}


