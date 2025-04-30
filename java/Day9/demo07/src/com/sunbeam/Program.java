package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Program {

	public static void main1(String[] args) {
		Vector<Integer> l = new Vector<Integer>( ); 
		System.out.printf("capacity = %d size = %d\n",l.capacity(),l.size());//capacity = 10 size = 0
		for(int i = 1 ; i<=10 ;i++)
			l.add(i); 
		System.out.printf("capacity = %d size = %d\n",l.capacity(),l.size());//capacity = 10 size = 10
		l.add(11); 
		System.out.printf("capacity = %d size = %d\n",l.capacity(),l.size());//capacity = 20 size = 11
		for(int i = 12 ; i<=20 ; i++)
			l.add(i); 
		System.out.printf("capacity = %d size = %d\n",l.capacity(),l.size());//capacity = 20 size = 20
		l.add(21); 
		System.out.printf("capacity = %d size = %d\n",l.capacity(),l.size());//capacity = 40 size = 21
	}
	public static void main2(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>( ); 
		System.out.printf("size = %d\n",l.size());//capacity = 10 size = 0
		for(int i = 1 ; i<=10 ; i++)
			l.add(i); 
		System.out.printf("size = %d\n",l.size());//capacity = 10 size = 10
		l.add(11); 
		System.out.printf("size = %d\n",l.size());//capacity = 15 size = 11
		for(int i = 12 ; i<=15 ; i++)
			l.add(i); 
		System.out.printf("size = %d\n",l.size());//capacity = 15 size = 15
		l.add(16); 
		System.out.printf("size = %d\n",l.size());//capacity = 23 size = 16
	}
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>( ); 
		List<Integer> l = Collections.synchronizedList(list); 
		// Collections.synchronizedList() creates a synchronization wrapper on given list
		// "list" is synchronized.

 		
	}

}
