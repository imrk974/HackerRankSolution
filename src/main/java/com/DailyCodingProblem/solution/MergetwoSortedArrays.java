package com.DailyCodingProblem.solution;

import java.util.Arrays;

public class MergetwoSortedArrays {

	public static int[] mergeTwoSortedArray(int[] arrayOne, int[] arrayTwo) {
		int[] mergedArray = new int[arrayOne.length + arrayTwo.length];

		int oneIndex = 0, twoIndex = 0, mergeIndex = 0;

		while (oneIndex < arrayOne.length || twoIndex < arrayTwo.length) {

			if (oneIndex < arrayOne.length && twoIndex < arrayTwo.length) {
				if (arrayOne[oneIndex] <= arrayTwo[twoIndex]) {
					mergedArray[mergeIndex] = arrayOne[oneIndex];
					oneIndex++;
				} else {
					mergedArray[mergeIndex] = arrayTwo[twoIndex];
					twoIndex++;
				}
			} else if (oneIndex < arrayOne.length) {
				mergedArray[mergeIndex] = arrayOne[oneIndex];
				oneIndex++;
			} else if (twoIndex < arrayTwo.length) {
				mergedArray[mergeIndex] = arrayTwo[twoIndex];
				twoIndex++;
			}
			mergeIndex++;
		}
		return mergedArray;
	}

	public static void main(String[] args) {
		int[] arrayOne = { 1, 5 };
		int[] arrayTwo = { 2, 4 };

		System.out.println(Arrays.toString(mergeTwoSortedArray(arrayOne, arrayTwo)));
	}

}
