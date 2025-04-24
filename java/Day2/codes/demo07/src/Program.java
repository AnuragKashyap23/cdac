import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int num1 , num2 , res; 
		String op; 
		Scanner sc = new Scanner(System.in); 
		System.out.print("num1 : ");
		num1 = sc.nextInt(); 
		System.out.print("num2 : ");
		num2 = sc.nextInt();
		do {
			System.out.println(". to exit or + , - , *  or / ");
			op = sc.next(); 
			switch (op) {
			case "+":
				res = num1 + num2; 
				System.out.println("res : "+res);
				break;
			case "-":
				res = num1 - num2; 
				System.out.println("res : "+res);
				break;
			case "*":
				res = num1 * num2; 
				System.out.println("res : "+res);
				break;
			case "/":
				res = num1 / num2; 
				System.out.println("res : "+res);
				break;
			}
		} while (!op.equals(".")); // we cannot use relational opr with Strings 
	}

}
