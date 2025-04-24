package com.sunbeam;
class Chair{
	private int height; 
	private int weight;
	private static int price = 300; // field init 
	public Chair() {
		// TODO Auto-generated constructor stub
	}
	public Chair(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}
	public static void setPrice(int price) {
		Chair.price = price;
	}
	public static int getPrice() {
		return price;
	}
	public void display( ) {
		//System.out.printf("Height : %d\nWeight : %d\nPrice : %d\n",this.height,this.weight,this.price);//misleading / not readable
		System.out.printf("Height : %d\nWeight : %d\nPrice : %d\n",this.height,this.weight,Chair.price);//misleading / not readable
	}
}
public class Program {

	public static void main(String[] args) {
		Chair c1 = new Chair(10, 20);
		Chair c2 = new Chair(30, 40);
		c1.display();
		c2.display();
		
		//Chair.price = 1000; // price is private cannot be accessed outside the class  	
		Chair.setPrice(1000);
		
		System.out.println("Updated price : "+Chair.getPrice());
		c1.display();
		c2.display();
	}

}
