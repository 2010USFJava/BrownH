package com.revature.sort;

import java.util.Arrays;

public class QuickSort {
	static int [] myArray = {2, 5, 8, 7, 9, 6, 10, 1, 3, 4}; 
	
	public static void quickSort(int [] myArray,int low,int high) {
		if(low<high) {
			int pivotLocation= partition(myArray,low,high);
			quickSort(myArray,low,pivotLocation);
			quickSort(myArray,pivotLocation+1,high);
		}
	}
	public static int partition(int [] myArray, int low, int high ) {
		int pivot=myArray[low];
		int left=low;
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i]<pivot) {
				swap(myArray[i],myArray[left]);
				left=left+1;
			}
			
			
		}
		return(left);
				
	}
	private static void swap(int pivot,int A) {
		int temp= A;
		A=pivot;
		pivot=temp;
		
		
	}
	public static void main(String [] args) {
		quickSort(myArray, 0, myArray.length-1);
		
		System.out.println(Arrays.toString(myArray));
	}
}
