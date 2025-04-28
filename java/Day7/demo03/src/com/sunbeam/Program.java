package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		try {
			Time t1 = new Time();
			t1.setHrs(1);
			t1.setMins(11);
			t1.setSecs(111);
			
			System.out.println("Time : "+t1.toString());
		}
		catch (InvalidTimeException e) {
			System.out.println("Field : "+e.getInvalidField());
			System.out.println("Value : "+e.getInvalidValue());
			System.out.println("Message : "+e.getMessage());
		}

	}

}
