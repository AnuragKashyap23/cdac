package com.sunbeam;

import java.util.Stack;

public class ExpressionEvaluationMain {
	
	public static int calculate(int op1, char opr, int op2) {
		switch(opr) {
		case '+':	return op1 + op2;
		case '-':	return op1 - op2;
		case '*':	return op1 * op2;
		case '/':	return op1 / op2;
		case '%':	return op1 % op2;
		case '$':	return (int)Math.pow(op1, op2);
		}
		return 0;
	}
	
	public static int postfixEvaluation(String expr) {
		//0. create stack to push operands
		Stack<Integer> st = new Stack<Integer>();
		//1. traverse for left to right
		for(int i = 0 ; i < expr.length() ; i++) {
			//2. Extract ith index character from expr
			char ele = expr.charAt(i);
			//3. if element is operand then push it on stack
			if(Character.isDigit(ele))
				st.push(ele - '0');		// to convert character into digit
			//4. if element is operator, pop two elements from stack
			else {
				int op2 = st.pop();	// first poped --> second operand
				int op1 = st.pop();	// second poped --> first operand
				//5. perform operation of op1 and op2
				int res = calculate(op1, ele, op2);
				//6. push result on stack
				st.push(res);
			}			
		}
		//7. pop result from stack and return
		return st.pop();
	}
	
	public static int prefixEvaluation(String expr) {
		//0. create stack to push operands
		Stack<Integer> st = new Stack<Integer>();
		//1. traverse for right to left
		for(int i = expr.length()-1 ; i >= 0 ; i--) {
			//2. Extract ith index character from expr
			char ele = expr.charAt(i);
			//3. if element is operand then push it on stack
			if(Character.isDigit(ele))
				st.push(ele - '0');		// to convert character into digit
			//4. if element is operator, pop two elements from stack
			else {
				int op1 = st.pop();	// first poped --> first operand
				int op2 = st.pop();	// second poped --> second operand
				//5. perform operation of op1 and op2
				int res = calculate(op1, ele, op2);
				//6. push result on stack
				st.push(res);
			}			
		}
		//7. pop result from stack and return
		return st.pop();
	}

	public static void main(String[] args) {
		String postfix = "456*3/+9+7-";
		
		System.out.println("Postfix : " + postfix);
		int result = postfixEvaluation(postfix);
		System.out.println("Result : " + result);
		
		String prefix = "-++4/*56397";
		
		System.out.println("Prefix : " + prefix);
		result = prefixEvaluation(prefix);
		System.out.println("Result : " + result);

	}

}
