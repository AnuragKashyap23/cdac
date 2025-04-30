package com.sunbeam;
// java 1.4 
class Fraction implements Comparable<Fraction>{
	private int n; 
	private int d;
	public Fraction(int n, int d) {
		this.n = n;
		this.d = d;
	}
	public double value( ) {
		return (double)n/d; 
	}
	@Override
	public int compareTo(Fraction other) {
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
		Fraction f2 = new Fraction(10, 2); // 5 
		//int res = f1.compareTo("10/2"); //compile time type-checking  
		//System.out.println("res : "+res);
	}

}
