import java.util.Scanner;

class Employee {
	// Fields
	private String name; // Instance variable
	private int empid; // Instance variable
	private double salary; // Instance variable

	// setter / mutator
	public void setSalary(double salary) {
		this.salary = salary;
	}

	// getter / inspector
	public double getSalary() {
		return salary;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getEmpid() {
		return empid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}

class EmployeeTest {
	Employee emp = new Employee(); 
	public void acceptRecord() { // Instance method

		Scanner sc = new Scanner(System.in);
		System.out.print("Name : ");
		emp.setName(sc.nextLine());
		
		System.out.print("Empid : ");
		emp.setEmpid(sc.nextInt());
		
		System.out.print("Salary : ");
		emp.setSalary(sc.nextDouble());
	}

	// this = emp
	// facilitator
	public void printRecord() { // Instance method
		System.out.println("Name : " + emp.getName());
		System.out.println("Empid : " + emp.getEmpid());
		System.out.println("Salary : " + emp.getSalary());
	}
}

public class Program {

	public static void main(String[] args) {
		EmployeeTest employeeTest = new EmployeeTest(); 
		employeeTest.acceptRecord();
		employeeTest.printRecord();

	}

}
