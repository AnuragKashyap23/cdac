package com.sunbeam;
/* final field can be initialized using field initializer, obj initializer, or constructor.
 * Once initialized, it cannot be modified again.
 * However, final fields must be initialized (in any of the above options). If not, 
 * compiler raise error.
 */ 
class Circle{
	private double radius; 
	private final double PI = 3.14; //field init 
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Circle() {
		//PI = 3.14; // NOT OK ( already init in field init)  
	}
	{
		//PI = 3.14; // NOT OK ( already init in field init)  
	}
	
	public double calcArea( ) {
		return PI * this.radius * this.radius; 
	}
	public double calcPeri( ) {
		return 2 * PI * this.radius; 
	}
}
public class Program {

	public static void main(String[] args) {
		final double x; // final variable declaration 
		x = 10.00; // OK ( assignment) 
		//x = 11.33; // NOT OK  ( once assigned we cannot modify it) 
		//Circle c1 = new Circle(3.1); 
		//System.out.println("Area : "+c1.calcArea());
		//System.out.println("Peri : "+c1.calcPeri());
		double rad = 5.1; // final variable declaration 
		final Circle c2 = new Circle(rad);
		c2.setRadius(8.1);
		//c2 = null; //reference is final once initialzed cannot be modified again 
		
		//int final b = 10;// NOT OK  
		 
	}

}
