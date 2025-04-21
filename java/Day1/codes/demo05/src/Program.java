

public class Program {
	public static void main1(String[] args) {
		int a = 65; 
		//short s = a; // NOT OK 
		short s = (short) a;// narrowing 
		System.out.println(s);
	}
	public static void main(String[] args) {
		short x = 12; 
		int b = x; //widening 
		System.out.println(b);
	}
}
