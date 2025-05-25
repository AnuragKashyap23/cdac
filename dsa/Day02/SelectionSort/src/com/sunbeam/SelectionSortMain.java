package com.sunbeam;

import java.util.Arrays;

public class SelectionSortMain {
	
	public static void selectionSort(int arr[], int N) {
		//1. select position of array one by one
		for(int i = 0 ; i < N-1 ; i++) {
			//2. find smallest element from remaining elements
			int minIndex = i;
			for(int j = i + 1 ; j < N ; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			//3. swap selected position element and smallest element
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}

	public static void main(String[] args) {
		int arr[] = {44, 11, 55, 22, 66, 33};
		
		System.out.println("Before sort : " + Arrays.toString(arr));
		
		selectionSort(arr, arr.length);
		
		System.out.println("After sort : " + Arrays.toString(arr));
	}

}
