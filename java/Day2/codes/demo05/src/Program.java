import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main1(String[] args) {
		int a = 10; // primitive type 
		Integer b = new Integer(a); // Boxing 
		Integer c = a; // auto-boxing 
		int d = b.intValue(); // unboxing 
		int e = b; // auto-unboxing
		System.out.println(a + " " + b + " " + c + " " + d + " " + " " + e);

	}
	
	public static void main2(String[] args) {
		// Boxing and unboxing are not efficient it takes more time and memory
		Integer x = 10; // auto-boxing 
		Integer y = 20; // auto-boxing 
		Integer z = x + y; 
		/*
			x is auto-unboxed to 10 
			y is auto-unboxed to 20 
			10 + 20 => 30 
			30 is auto-boxed to z 
		*/
		System.out.println(z);
	}
	public static void main3(String[] args) {
		int a = 10; 
		Integer b = 20; 
		List list = new ArrayList();
		list.add(new Integer(a)); // Boxing 
		list.add(a); // auto-boxing 
		list.add(b); // Integer 
		
		System.out.println(list);
		
		 
	}
	public static void main(String[] args) {
		//System.out.println("Max : "+Integer.MAX_VALUE);
		//System.out.println("Min : "+Integer.MIN_VALUE);
		System.out.println("Min : "+Integer.SIZE);
	}
}







