
public class Program {

	public static void main1(String[] args) {
		//Converting primitive to wrapper --- boxing 
		int i = 10; 
		Integer j = new Integer(i); // Boxing 
		Integer k = i; // auto-boxing ( java 5.0) 

	}
	
	public static void main(String[] args) {
		//converiting wrapper to primitive --- unboxing 
		Integer x = new Integer(10); 
		int y = x.intValue(); // unboxing 
		int z = x; // auto-unboxing (java 5.0) 
		
	}

}








