package com.sunbeam;

public class Circle implements Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		return Math.PI * this.radius * this.radius; 
	}

	@Override
	public double calcPeri() {
		return 2 * Math.PI * this.radius; 
	} 
}
