
class Person{
	private String name; 
	private int age; 
	 
	public Person( ) {
		this("Aditya", 31);//contructor chaining   
	}
	public Person(String name , int age) {
		this.name = name; 
		this.age = age; 
	}
	public void printRecord( ) {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}
public class Program {
	
	public static void main(String[] args) {
		//Person p1 = new Person(); // parameter-less ctor will get called 
		//p1.printRecord();
		Person p2 = new Person("Mahesh", 31); 
		p2.printRecord();// on p2 parameterized ctor will get called 
	}
}
