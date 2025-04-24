package com.sunbeam;

public class Chair {
	private int height;
	private int weight;
	private static int price;
	static {
		price = 100; 
		System.out.println("static block -- 1");
	}
	static {
		price = 200; 
		System.out.println("static block -- 2");
	}
	public static int getPrice() {
		return price;
	}
	public static void setPrice(int price) {
		Chair.price = price;
	}
	public Chair() {
		// TODO Auto-generated constructor stub
	}

	public Chair(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}
	
}
