
public class Program {

	public static void main1(String[] args) {
		//use of primitive as Objects
		int a = 10;
		Integer b = new Integer(a); 
		
		// type conversion 
		float f = b.floatValue();
		double d = b.doubleValue(); 
		String str = b.toString(); 
		byte bt = b.byteValue(); 
		
		System.out.println(f);
		System.out.println(d);
		System.out.println(str);
		System.out.println(bt);
	}
	public static void main(String[] args) {
		int a = 10 , b = 20; 
		int max = Integer.max(a, b);
		System.out.println("max : "+max);
		
		int min = Integer.min(a, b); 
		System.out.println("min : "+min);
	}
	

}
