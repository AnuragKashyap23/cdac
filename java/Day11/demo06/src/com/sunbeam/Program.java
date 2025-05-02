package com.sunbeam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Program {

	public static void main1(String[] args) {
		Integer[] arr1 = {1,2,3,4,5,6,7,8,9,10}; 
		Stream<Integer> strm1 = Arrays.stream(arr1);  
		
		strm1
		.skip(2)
		.limit(4)
		.forEach(e -> System.out.println(e));
	}
	public static void main2(String[] args) {
		List<String> list = new ArrayList<String>(); 
		list.add("sunbeam infotech karad");
		list.add("sunbeam infotech hinjewadi");
		
		Stream<String> strm = list.stream(); 
		
		strm
		.map(word -> word.toUpperCase())
		.forEach(e -> System.out.println(e));
	}
	public static void main3(String[] args) {
		String[] names = {"Smita", "Rahul", "Rachana", "Amit", "Shraddha", "Nilesh", "Rohan", "Pradnya", "Rohan", "Pooja", "Lalita"};
		
		Stream<String> strm1 = Stream.of(names); 
		
		strm1
		 .filter(s -> s.endsWith("a"))
		 .forEach(e -> System.out.println(e));
	
	}
	public static void main4(String[] args) {
		String[] names = {"Smita", "Rahul", "Rachana", "Amit", "Shraddha", "Nilesh", "Rohan", "Pradnya", "Rohan", "Pooja", "Lalita"};
		
		Stream<String> strm1 = Stream.of(names);
		
		strm1
		.map(e -> e.toUpperCase())
		.forEach(e -> System.out.println(e));
		
	}
	public static void main5(String[] args) {
		String[] names = {"Smita", "Rahul", "Rachana", "Amit", "Shraddha", "Nilesh", "Rohan", "Pradnya", "Rohan", "Pooja", "Lalita"};
		
		Stream<String> strm1 = Stream.of(names);
		
		strm1
		.sorted()
		.forEach(e -> System.out.println(e));
	}
	public static void main6(String[] args) {
		String[] names = {"Smita", "Rahul", "Rachana", "Amit", "Shraddha", "Nilesh", "Rohan", "Pradnya", "Rohan", "Pooja", "Lalita"};
		
		Stream<String> strm1 = Stream.of(names);
		
		strm1
		.sorted((x,y) -> y.compareTo(x))
		.forEach(e -> System.out.println(e));
	}
	public static void main7(String[] args) {
		String[] names = {"Smita", "Smita", "Rachana", "Amit", "Shraddha", "Nilesh", "Rohan", "Pradnya", "Rohan", "Pooja", "Lalita"};
		
		Stream<String> strm1 = Stream.of(names);
		
		strm1
		.distinct()
		.forEach(e -> System.out.println(e));
	}
	public static void main(String[] args) {
	   String[] names = {"Smita", "Smita", "Rachana", "Amit", "Shraddha", "Nilesh", "Rohan", "Pradnya", "Rohan", "Pooja", "Lalita"};
		
	   Stream<String> strm1 = Stream.of(names);
	   
	   long cnt = strm1
	   .count(); 
	   
	   System.out.println(cnt);
	}

}
