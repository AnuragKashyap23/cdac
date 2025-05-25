package com.sunbeam;

import java.util.Scanner;

public class SearchingMain {
	
	public static int linearSearch(int[] arr, int key) {
		//1. traverse array from 0 to N-1 index
		for(int i = 0 ; i < arr.length ; i++) {
			//2. compare key with array element
			if(key == arr[i])
				//3. if matching return index
				return i;
		}
		//4. if not matching return -1
		return -1;
	}
	
	public static int binarySearch(int arr[], int key) {
		int left = 0, right = arr.length - 1, mid;
		
		while(left <= right) {
			//1. divide array in two parts (find middle element)
			mid = (left + right) / 2;
			//2. compare key with middle element
			if(key == arr[mid])
				//2.1 if matching return index of middle element
				return mid;
			//2.2 if key is less than middle element, search key into left partition
			if(key < arr[mid])
				right = mid - 1;
			//2.3 if key is greater than middle element, search key into right partition
			else
				left = mid + 1;
		}//3. repeat above two steps till key is not found or valid partition
		//4. if key is not found
		return -1;
	}

	public static int binarySearch(int arr[], int key, int left, int right) {
		//0. stop if partition is invalid
		if(left > right)
			return -1;
		//1. divide array in two parts (find middle element)
		int mid = (left + right) / 2;
		//2. compare key with middle element
		if(key == arr[mid])
			//2.1 if matching return index of middle element
			return mid;
		//2.2 if key is less than middle element, search key into left partition
		if(key < arr[mid])
			return binarySearch(arr, key, left, mid - 1);
		//2.3 if key is greater than middle element, search key into right partition
		else
			return binarySearch(arr, key, mid + 1, right);
		//3. repeat above two steps till key is not found or valid partition
	}
	
	public static void main(String[] args) {
		//int arr[] = {88, 33, 66, 99, 11, 77, 22, 55, 14};
		int arr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter key : ");
		int key = sc.nextInt();
		
		//int index = linearSearch(arr, key);
		//int index = binarySearch(arr, key);
		int index = binarySearch(arr, key, 0, arr.length - 1);
		if(index == -1)
			System.out.println("key is not found");
		else
			System.out.println("Key is found at index : " + index);
		
		sc.close();
	}

}
