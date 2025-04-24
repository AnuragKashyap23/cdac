package sunbeam.geometry;

import sunbeam.geometry.dim2.Circle;
import sunbeam.geometry.dim3.*;

public class Program{
  public static void main(String[] args){
     Circle c = new Circle(3.1); 
     System.out.println("Area : "+ c.calcArea());
     Box b = new Box(1.1,2.1,3.1); 	
     System.out.println("Area : "+ b.calcVolume());
     Cylinder cy = new Cylinder(3.1,4.1); 
     System.out.println("Area : "+ cy.calcVolume());		   
  } 
}