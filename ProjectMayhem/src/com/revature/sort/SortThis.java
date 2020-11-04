package com.revature.sort;
 	
public class SortThis {
	public static int [] loadBadArray(int length) {
		 int [] myArray= new int [length];
		 
		 for (int i = length-1; i>=0; i--) {
			 myArray[i]=length-i;
		 }
		 return myArray;
	}
	
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+ " ");
			
		}
		System.out.println();
	}
	//BubbleSort
	public static int[] bubble(int [] a) {
		for (int i=0;i< a.length-1;i++) {
			for(int j=0; j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					//swap a[j] and a[j+1]
					int temp= a[j];
					a[j]= a[j+1];
					a[j+1]=temp;
					
					
				}
			}
		}
		return a;
	}
	public static void main(String [] args) {
		printArray(bubble(loadBadArray(10)));
	}
}
