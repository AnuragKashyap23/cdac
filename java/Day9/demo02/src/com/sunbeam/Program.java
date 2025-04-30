package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Program {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>( ); 
		//add() 
		list.add("India"); 
		list.add("USA"); 
		list.add("Russia"); 
		list.add("India"); 
		list.add("Nepal"); 
		list.add("England"); 
		list.add("Norway"); 
		
		System.out.println("size : "+list.size());
		  
		System.out.println("toString() : "+list.toString());
		//random access --- get() , set() , add() , remove()
		int index = 3; 
		list.add(index, "Iran");
		System.out.println("toString() : "+list.toString());
		
		String e5 = list.get(index); //get the element at index 
		System.out.println("ele : " + e5);
		
		e5 = e5.toUpperCase();
		list.set(index, e5); // set at index 
		System.out.println("toString() : "+list.toString());
		
		list.remove(index); //remove the element from specific index 
		System.out.println("toString() : "+list.toString());
		
		//contains() -- searching 
		String find = "USA"; 
		boolean found = list.contains(find); //Returns true if this list contains the specified element
		if(found)
			System.out.println("Ele " + find + " found ");
		else 
			System.out.println("Element not found");
		
		// indexOf() , lastIndexOf() ---(find the element and access it )
		
		int idx = list.indexOf(find); 
		if(idx!=-1) {
			System.out.println("Ele : " + find + " found at index " + idx);
		}
		else 
			System.out.println("Element not found");
		
		idx = list.lastIndexOf(find); 
		if(idx!=-1) {
			System.out.println("Ele : " + find + " found at index " + idx);
		}
		else 
			System.out.println("Element not found");
		
		System.out.print("FWD traversing : ");
		//ListIterator -- Bi-directional traversal
		ListIterator<String> trav = list.listIterator(); 
		while(trav.hasNext()) {
			String ele = trav.next(); 
			System.out.print(ele + " ");
		}
		System.out.println();
		System.out.print("REV traversing : ");
		trav = list.listIterator(list.size()); 
		while(trav.hasPrevious()) {
			String ele = trav.previous(); 
			System.out.print(ele + " ");
		}
		System.out.println();
		list.clear(); 
		
		Collections.addAll(list,"Akshay","Sagar","Omkar","Rohan","Prashant"); 
		Collections.sort(list);//natural ordering 
		System.out.println("toString() : "+list.toString());
		Collections.shuffle(list);
		System.out.println("Shuffle ---  : "+list.toString());
		class StringComparator implements Comparator<String>{

			@Override
			public int compare(String x, String y) {
				int diff = -x.compareTo(y); 
				return diff; 
			}
			
		}
		Collections.sort(list,new StringComparator());
		
		System.out.println("toString() : "+list.toString());
	}
}





