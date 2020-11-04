package com.revature.sort;
//merge sort method 
public class SortChallenge {
	
	public static void merge(int[] leftArray, int[] rightArray, int[] myArray, int leftSize, int rightSize) {
		int i = 0, l = 0, r = 0;
		while (l < leftSize && r < rightSize) {
			if (leftArray[l] < rightArray[r]) {
				myArray[i++] = leftArray[l++];

			} else {
				myArray[i++] = rightArray[r++];
			}
		}
		while (l < leftSize) {
			myArray[i++] = leftArray[l++];

		}
		while (r < rightSize) {
			myArray[i++] = rightArray[r++];
		}

	}

	private static void mergeChallenge(int[] myArray, int length) {
		if (length < 2) {
			return;
		}
		int middle = length / 2;
		int[] leftArray = new int[middle];
		int[] rightArray = new int[length - middle];

		int h = 0;
		for (int i = 0; i < length; i++) {
		if(i<middle) {
			leftArray[i] = myArray[i];

	} else	{
		rightArray[h] = myArray[i];
		h = h + 1;
	}
}mergeChallenge(leftArray,middle);mergeChallenge(rightArray,length-middle);merge(leftArray,rightArray,myArray,middle,length-middle);}

	public static void main(String[] args) {
		int[] myArray = { 9, 1, 10, 8, 5, 4, 7, 6, 2, 3 };
		mergeChallenge(myArray, myArray.length);
		for (int i = 0; i < myArray.length; i++) {
System.out.println(myArray[i]+" ");
		}
	}
}