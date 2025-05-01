package com.sunbeam;

import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>(); 
		Collections.addAll(set,"A","B","C","D","E","F","G","H","I","J","K"); 
		
		//System.out.println(set);
		System.out.println("First : "+set.first()); //First : A
		System.out.println("Last : "+set.last()); //Last : K
		System.out.println("HeadSet : "+set.headSet("D"));//[A, B, C]
		System.out.println("TailSet : "+set.tailSet("I"));//[I, J, K]
		System.out.println("Subset : "+set.subSet("A", "D")); //[A, B, C]
		System.out.println("Higher : "+set.higher("E")); // F
		System.out.println("Lower : "+set.lower("D"));//Lower : C
		
		Iterator<String> itr = set.descendingIterator(); 
		//traverse set in descending direction
		while(itr.hasNext()) {
			String ele = itr.next(); 
			System.out.print(ele + " ");
		}
		System.out.println();
		NavigableSet<String> descSet = set.descendingSet(); 
		System.out.println("desc set : " + descSet);
		//Returns an iterator over the elements in this set, in descending order.
	}

}
