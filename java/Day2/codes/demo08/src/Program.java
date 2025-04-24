import java.util.Scanner;

class Employee{
	//Fields 
	private String name; // Instance variable  
	private int empid; // Instance variable
	private double salary; // Instance variable
	
	public void acceptRecord( ) { // Instance method 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Name : ");
		name = sc.nextLine(); 
		System.out.print("Empid : ");
		empid = sc.nextInt(); 
		System.out.print("Salary : ");
		salary = sc.nextDouble(); 
	}
	public void printRecord( ) {  // Instance method
		System.out.println("Name : "+name);
		System.out.println("Empid : "+empid);
		System.out.println("Salary : "+salary);
	}
}
public class Program {

	public static void main(String[] args) {
		//Employee emp; 
		// Object reference 
		new Employee(); // Anonymous instance  
	}
	public static void main2(String[] args) {
		Employee emp1 = new Employee(); 
		Employee emp2 = new Employee(); 
		Employee emp3 = new Employee(); 
		// emp1 , emp2 , emp3 will get space on java stack 
		// emp1 , emp2 , emp3 -> references 
	}
	public static void main1(String[] args) {
		Employee emp = new Employee();
		// emp -> Object reference 
		// new Employee -> Instance 
		emp.acceptRecord(); //message passing 
		emp.printRecord(); // message passing 

	}

}
