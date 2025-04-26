package com.sunbeam;

public class Program {

	public static void main1(String[] args) {
		// String class in Java -- represents immutable "sequence of characters"
		// length() returns number of chars
		// charAt() returns char at given index -- 0 to length()-1
		// "str" reference is created on "stack"
		// "Sunbeam" string literal/constant is created on String pool (in heap)
		String str = "Sunbeam";
		System.out.println("Length : " + str.length());
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.print(ch);
		}
	}
	public static void main2(String[] args) {
		//strings created using new will get space on heap section 
		String str = new String("Infotech"); 
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.print(ch);
		}
	}
	public static void main3(String[] args) {
		//indexOf() , lastIndexOf() 
		String str = "Sunbeam Infotech"; 
		char ch = 'e'; 
		int index = str.indexOf(ch); 
		System.out.println(" char " + ch + " is a index " + index);
		
		ch = 't'; 
		index = str.indexOf(ch); 
		System.out.println(" char " + ch + " is a index " + index);
		
		ch = 'e'; 
		index = str.lastIndexOf(ch); 
		System.out.println(" char " + ch + " is a index " + index);
		
		ch = 'x'; 
		index = str.indexOf(ch); 
		System.out.println(" char " + ch + " is a index " + index);
	}
	public static void main4(String[] args) {
		//toUpperCase(), toLowerCase()
		//Strings are immutable 
		// operations performed on string will create a new object with modified contents.
		String str = "Sunbeam"; 
		String s1 = str.toUpperCase(); 
		System.out.println("S1 : "+s1);
		System.out.println("Str : "+str);
		String s2 = str.toLowerCase(); 
		System.out.println("S2 : "+s2);
	}
	public static void main5(String[] args) {
		//concat 
		String s1 = "Sunbeam"; 
		String s2 = "Infotech"; 
		String str = s1.concat(s2); 
		System.out.println("Str : "+str);
	}
	public static void main6(String[] args) {
		// substring()
		String str = "Sunbeam Infotech"; 
		String s1 = str.substring(7); 
		System.out.println("s1 : "+s1);
		String s2 = str.substring(7, 12); 
		System.out.println("s2 : "+s2);
	}
	public static void main7(String[] args) {
		//split 
		String str = "this is just an example"; 
		String[] parts = str.split(" "); 
		for(int i = 0 ; i < parts.length ; i++){
			System.out.println(parts[i]);
		}
	}
	public static void main8(String[] args) {
		//trim 
		//removes leading and trailing spaces 
		String str = "                      Sunbeam Infotech                  ";
		System.out.println("length : "+str.length());
		String s1 = str.trim(); 
		System.out.println("S1 : "+s1);
		System.out.println("Length  : "+s1.length());
	}
	public static void main(String[] args) {
		//Format 
		int year = 1998; 
		String str = "Sunbeam"; 
		String s1 = String.format("%s was founded in year %d",str,year); 
		System.out.println("s1 : "+s1);
	}

}


