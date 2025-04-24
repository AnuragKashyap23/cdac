import java.util.Scanner;
 
class Employee{
	//Fields 
	private String name; // Instance variable  
	private int empid; // Instance variable
	private double salary; // Instance variable
	
	//setter / mutator 
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//getter / inspector 
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
	
	// this = emp 
	public void acceptRecord( ) { // Instance method 
		 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Name : ");
		this.name = sc.nextLine(); 
		System.out.print("Empid : ");
		this.empid = sc.nextInt(); 
		System.out.print("Salary : ");
		this.salary = sc.nextDouble(); 
	}
	//this = emp 
	//facilitator 
	public void printRecord( ) {  // Instance method
		System.out.println("Name : "+name);
		System.out.println("Empid : "+empid);
		System.out.println("Salary : "+salary);
	}
	
}
public class Program {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.acceptRecord();//emp.acceptRecord(emp); 
		emp.printRecord();//emp.printRecord(emp);
		 
		
	}

}
