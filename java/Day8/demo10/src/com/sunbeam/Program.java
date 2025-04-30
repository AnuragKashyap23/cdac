package com.sunbeam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Program {

	public static void main(String[] args) {
		//Collection<String> c = new ArrayList<String>( );
		Collection<String> c = new LinkedList<String>( );
		c.add("India"); 
		c.add("Nepal");
		c.add("India");
		c.add("USA");
		c.add("Russia");
		c.add("China");
		c.add("England");
		
		System.out.println("Size : "+c.size());
		System.out.print("Ele : ");
		for(String ele : c) {
			System.out.print(ele + " ");
		}
		System.out.println();
		System.out.print("List  : "+c.toString());
		c.remove("India"); 
		System.out.println();
		System.out.print("List  : "+c.toString());
		System.out.println();
		System.out.print("FWD : ");
		Iterator<String> trav = c.iterator(); 
		while(trav.hasNext()) {
			String ele = trav.next(); 
			System.out.print(ele + " ");
		}
		System.out.println();
		c.clear();
		System.out.println("Size : "+c.size());
	}

}


