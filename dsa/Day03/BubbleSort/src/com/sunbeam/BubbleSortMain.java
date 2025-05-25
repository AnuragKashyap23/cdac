package com.sunbeam;

import java.util.Arrays;

public class BubbleSortMain {
	
	public static void bubbleSort(int arr[], int N) {
		int passes = 0, comps = 0;
		//1. Repeat procedure N-1 times(passes)
		for(int i = 1 ; i < N ; i++) {
			passes++;
			//2. compare all pairs of consecutive elements
			for(int j = 0 ; j < N - i ; j++) {
				// left element = j
				// right element = j + 1
				//3. if left element is greater than right element then swap both
				comps++;
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("No of passes : " + passes);
		System.out.println("No of comps : " + comps);
	}
	
	public static void improvedBubbleSort(int arr[], int N) {
		int passes = 0, comps = 0;
		int flag;
		//1. Repeat procedure N-1 times(passes)
		for(int i = 1 ; i < N ; i++) {
			flag = 0;
			passes++;
			//2. compare all pairs of consecutive elements
			for(int j = 0 ; j < N - i ; j++) {
				// left element = j
				// right element = j + 1
				//3. if left element is greater than right element then swap both
				comps++;
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = 1;
				}
			}
			if(flag == 0)
				break;
		}
		System.out.println("No of passes : " + passes);
		System.out.println("No of comps : " + comps);
	}

	public static void main(String[] args) {
		//int arr[] = {33, 22, 66, 55, 44, 11};
		int arr[] = {11, 22, 33, 44, 55, 66};
		
		System.out.println("Before sort : " + Arrays.toString(arr));
		
		//bubbleSort(arr, arr.length);
		improvedBubbleSort(arr, arr.length);
		
		System.out.println("After sort : " + Arrays.toString(arr));
	}

}
