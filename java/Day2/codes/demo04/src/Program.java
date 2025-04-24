
public class Program {

	public static void main(String[] args) {
		int a = 10; 
		String str = String.valueOf(a); //Boxing 
		System.out.println("Str : "+str);
		
		String s = "123"; 
		int b = Integer.parseInt(s); //unboxing 
		
		System.out.println("b : "+b);

	}

}
