package com.sunbeam;
enum Elements{
	H(1,"Hydrogen"),HE(2,"Helium"),LI(3,"Lithium");
	
	private final int elementNumber; 
	private final String elementName;
	private Elements(int elementNumber, String elementName) {
		this.elementNumber = elementNumber;
		this.elementName = elementName;
	}
	public int getElementNumber() {
		return elementNumber;
	}
	public String getElementName() {
		return elementName;
	}
	
	
}
public class Program {

	public static void main(String[] args) {
		for(Elements e : Elements.values()) {
			System.out.println(e.getElementNumber() + "." + e.getElementName());
		}

	}

}
