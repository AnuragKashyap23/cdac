
class Employee{
	// fields 
	private String name; 
	private int empid; 
	private double salary; 
	//constructor 
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int empid, double salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	// getters / setters 
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
}
public class Program {
	
	public static void main(String[] args) {
		Employee emp = new Employee();  
	}
}
