package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		Shape[] arr  = {
			new Rectangle(10, 20), 
			new Circle(3.1),
			new Square(4.1)
		};
		//double totalArea = Shapes.calculateTotalArea(arr);
		//double totalArea = Shape.calculateTotalArea(arr);
		//System.out.println("Area : "+totalArea);
		
		double totalPeri = 0.0; 
		for(int i = 0 ; i < arr.length ; i++) {
			totalPeri = totalPeri + arr[i].calcPeri(); 
			System.out.println(totalPeri);
			
		}
	}

}
