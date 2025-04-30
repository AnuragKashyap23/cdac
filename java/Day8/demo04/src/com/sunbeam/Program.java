package com.sunbeam;
// java 1.4 
class Fraction implements Comparable{
	private int n; 
	private int d;
	public Fraction(int n, int d) {
		this.n = n;
		this.d = d;
	}
	public double value( ) {
		return (double)n/d; 
	}
	
	//this = f1 
	//other = f2 
	@Override
	public int compareTo(Object obj) {
		Fraction other = (Fraction) obj; 
		if(this.value() == other.value())
			return 0; 
		if(this.value() > other.value())
			return 1; 
		else 
			return -1; 
	}
	
}
public class Program {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(10, 2); // 5 
		Fraction f2 = new Fraction(20, 2); // 10 
		int res = f1.compareTo("10/2");  //class-cast Exception 
		System.out.println("res : "+res);
	}

}
