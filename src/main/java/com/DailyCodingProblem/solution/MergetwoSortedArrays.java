package com.DailyCodingProblem.solution;

import java.util.Arrays;

public class MergetwoSortedArrays {

	
	public static int[] mergeTwoSortedArray(int[] arrayOne, int[] arrayTwo) {
		int[] mergedArray = new int[arrayOne.length+arrayTwo.length];
		
		int oneIndex=0, twoIndex=0, mergeIndex=0;
		int i=0;
		while (mergeIndex < (arrayOne.length + arrayTwo.length)-1) {
			
			if(arrayOne[oneIndex] <= arrayTwo[twoIndex]) {
				mergedArray[mergeIndex] = arrayOne[oneIndex];
				oneIndex++;
			} else {
				mergedArray[mergeIndex] = arrayTwo[twoIndex];
				twoIndex++;
			}
			
			if(oneIndex == arrayOne.length-1) {
				
			} else if(twoIndex == arrayTwo.length-1) {
				
			}
			
			mergeIndex++;	
		}		
		
		return mergedArray;
	}
	
	
	public static void main(String[] args) {
		int[] arrayOne= {1,5};
		int[] arrayTwo= {2,4};

		System.out.println(Arrays.toString(mergeTwoSortedArray(arrayOne, arrayTwo)));
	}

}
