package com.sunbeam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Program {

	public static void main2(String[] args) {
		Double[] arr = {1.1,2.1,3.1,4.1,5.1,6.1,7.1,8.1,9.1,10.1};
		
		Stream<Double> strm = Arrays.stream(arr); 
		
		strm
		.skip(2)
		.limit(4)
		.forEach(e -> System.out.println(e));
	}
	public static void main3(String[] args) {
		List<String> list = new ArrayList<String>( );
		list.add("A sequence of elements supporting sequential and parallel aggregate operations.");
		list.add("In addition to Stream, which is a stream of object references, there are primitive specializations for IntStream.");
		list.add("To perform a computation, stream operations are composed into a stream pipeline.");	
		
		Stream<String> strm = list.stream(); 
		
		strm
		.map(word -> word.toUpperCase())
		.flatMap(line -> Arrays.stream(line.split(" ")))
		.forEach(e -> System.out.println(e));
	}
	public static void main4(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		Collections.addAll(set, 1,2,3,4,5,6,7,8,9,10); 
		Stream<Integer> strm = set.stream();
		
		//Integer res = strm.reduce(0, (a,b) -> a + b);
		Integer res = strm.reduce(0, (a,b) -> {
			System.out.println(" a " + a + " b " + b);
			return a + b; 
		});
		System.out.println("res : "+res);
	}
	public static void main5(String[] args) {
		Stream<Integer> strm = Stream.iterate(1, i -> i + 1).limit(10); 
		int num = 5; 
		strm
		.map(i -> i * num)
		.forEach(e -> System.out.println(e));
		
		
	}
	public static void main6(String[] args) {
		Random r = new Random(); 
		
		Stream<Integer> strm = Stream.generate(() -> r.nextInt(20)).limit(20); 
		
		strm
		.distinct()
		.forEach(e -> System.out.println(e));
	}
	public static void main7(String[] args) {
		Random r = new Random( ); 
		
		Stream<Integer> strm = Stream.generate(() -> r.nextInt(20)).limit(20);
		
		List<Integer> list = strm
		.distinct()
		.collect(Collectors.toList()); 
		
		System.out.println(list);
	}
	public static void main8(String[] args) {
		Random r = new Random( ); 
		
		Stream<Integer> strm = Stream.generate(() -> r.nextInt(20)).limit(20);
		
		Set<Integer> set = strm
		.collect(Collectors.toSet()); 
		
		System.out.println(set);
	}
	public static void main(String[] args) {
		//wrapper 
		//Stream<Integer> strm = Stream.iterate(1, i -> i + 1);
		
		
		//Stream<int> strm = Stream.iterate(1, i -> i + 1);
	
		//primitive streams are more efficient -- 
		//because no boxing/unboxing done for each arithmetic	
		
		/* 
		IntStream strm1 = IntStream.iterate(1, i -> i + 1).limit(10); 
		int num = 5; 
		strm1
		.map(i -> i * num)
		.forEach(e -> System.out.println(e));
		
		*/ 
		/* 
		IntStream strm2 = IntStream.iterate(1, i -> i + 1).limit(10);
		
		int res = strm2.reduce(0, (a,i) -> a + i); 
		System.out.println("res : "+res);
		*/
		
		IntStream strm3 = IntStream.of(1,2,3,4,5,6); 
		strm3
		.forEach(e -> System.out.println(e));
	}
	

}
