import java.util.Scanner;

//Step1: Understand requirement and Declare the class

//Step2: Declare the fields

//Step3: Creating the instance 

//Step4: access modifiers 

//Step5: calling methods

class Date{
	private int day; 
	private int month; 
	private int year; 
	
	//this = dt1 
	public void acceptRecord( ) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Day : ");
		day = sc.nextInt(); 
		System.out.print("Month : ");
		month = sc.nextInt(); 
		System.out.print("Year : ");
		year = sc.nextInt(); 
	}
	//this = dt1
	public void printRecord( ) {
		System.out.println("Day : "+day);
		System.out.println("Month : "+month);
		System.out.println("Year : "+year);
	}
}
public class Program {

	public static void main(String[] args) {
		Date dt1 = new Date(); // Instance 
		dt1.acceptRecord( ); // dt1.acceptRecord(dt1); 
		dt1.printRecord(); // dt1.printRecord(dt1);
	}

}
