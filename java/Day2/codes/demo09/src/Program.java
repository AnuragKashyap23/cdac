import java.util.Scanner;
 
class Employee{
	//Fields 
	private String name; // Instance variable  
	private int empid; // Instance variable
	private double salary; // Instance variable
	
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
