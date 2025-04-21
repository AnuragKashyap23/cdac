
public class Program {

	public static void main(String[] args) {
		System.out.println("Hello world");
		Program.main();
		Program.main(10, 20);
	}
	//overloaded method with no arguments 
	public static void main() {
		System.out.println("main with no arguments");
	}
	//overloaded method with 2 arguments arguments
	public static void main(int a, int b) {
		System.out.println("main with 2 arguments ");
	}

}
