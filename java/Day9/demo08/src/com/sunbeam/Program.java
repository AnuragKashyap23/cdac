package com.sunbeam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Employee implements Comparable<Employee>{
	private String name; 
	private int empid; 
	private double salary; 
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int empid, double salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
		  return false; 
		if(this == obj)
		  return true; 
		if(!(obj instanceof Employee))
		  return false; 
		Employee other = (Employee) obj;
		if(this.empid == other.empid)
			return true; 
		return false; 
	}
	@Override
	public String toString() {
		return String.format("%-15s%-20d%.2f",this.name,this.empid,this.salary); 
	}
	@Override
	public int compareTo(Employee o) {
		return this.empid - o.empid; 
	}
	
}
class SortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName()); 
	}
}
public class Program {
	private static List<Employee> empList = new ArrayList<Employee>( ); 
	private static Scanner sc = new Scanner(System.in); 
	public static Employee[] getEmployees( ) {
		Employee[] arr = new Employee[4]; 
		arr[0] = new Employee("Aditya", 3, 2000.00); 
		arr[1] = new Employee("Rohan", 2, 3000.00); 
		arr[2] = new Employee("Omkar", 1, 4000.00); 
		arr[3] = new Employee("Sagr", 4, 1000.00);
		return arr; 
	}
	public static void addEmployees(Employee[] arr) {
		for (Employee e : arr) {
			empList.add(e); 
		} 
	}
	public static void acceptRecord(int[] empid) {
		System.out.println("Enter the empid : ");
		empid[0] = sc.nextInt(); 
	}
	public static Employee findEmployee(int empid) {
		Employee key = new Employee(); 
		key.setEmpid(empid);
		int index = empList.indexOf(key); 
		if(index!=-1) {
			return empList.get(index); 
		}
		return null; 
	}
	public static void printRecord(Employee e) {
		if(e!=null) {
			System.out.println(e.toString());
		}
		System.out.println();
	}
	public static boolean removeEmployee(int empid) {
		Employee key = new Employee(); 
		key.setEmpid(empid);
		if(empList.contains(key)) {
			empList.remove(key); 
			return true; 
		}
		return false; 
	}
	public static void updateEmployee(int empid) {
		Employee key = new Employee(); 
		key.setEmpid(empid);
		int index = empList.indexOf(key); 
		if(index!=-1) {
			Employee emp = empList.get(index); 
			System.out.println(emp.toString());
			System.out.println("1.Name");
			System.out.println("2.Empid");
			System.out.println("3.Salary");
			System.out.println("Which part do want to update");
			int choice =sc.nextInt(); 
			sc.nextLine(); 
			switch (choice) {
			case 1:
				System.out.println("Enter the updated Name");
				String updatedName = sc.nextLine(); 
				emp.setName(updatedName);
				break;
			case 2: 
				System.out.println("Enter the updated ID");
				int updatedID = sc.nextInt(); 
				emp.setEmpid(updatedID);
				break; 
			case 3: 
				System.out.println("Enter the updated Salary");
				double updatedSalary = sc.nextDouble(); 
				emp.setSalary(updatedSalary);
				break; 
			default:
				System.out.println("Invalid choice");
				break;
			}
			
		}
		else 
			System.out.println("Record not found");
	}
	public static void printEmployees() {
		empList.sort(new SortByName());
		for (Employee e : empList) {
			System.out.println(e.toString());
		}
	}
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.AddEmployees");
		System.out.println("2.FindEmployees");
		System.out.println("3.RemoveEmployees");
		System.out.println("4.UpdateEmployees");
		System.out.println("5.PrintEmployees");
		System.out.print("Enter the choice : ");
		return sc.nextInt(); 
	}
	public static void main(String[] args) {
		int[] empid = new int[1];
		int choice; 
		while((choice = menuList())!=0) {
			switch (choice) {
			case 1:
				empList.clear();
				Employee[] arr = Program.getEmployees(); 
				Program.addEmployees(arr);
				break;
			case 2: 
				 Program.acceptRecord(empid);
				 Employee e = Program.findEmployee(empid[0]);
				 Program.printRecord(e);
				 break; 
			case 3: 
				 Program.acceptRecord(empid);
				 boolean removedStatus = Program.removeEmployee(empid[0]); 
				 System.out.println(removedStatus ? "Employee removed " : "Employee not found");
				 break; 
			case 4: 
				 Program.acceptRecord(empid);
				 Program.updateEmployee(empid[0]);
				 break; 
			case 5: 
				 Program.printEmployees();
				 break; 
			default:
				System.out.println("Invalid choice");
				break;
			}
		}

	}

}




