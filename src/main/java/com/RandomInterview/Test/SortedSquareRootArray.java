package com.RandomInterview.Test;

import java.util.Arrays;

public class SortedSquareRootArray {

	public static int[] sortedSquareRoot(int[] ar) {
		int[] sortedSquare = new int[ar.length];
		int left = 0;
		int right = ar.length - 1;

		for (int i = ar.length - 1; i >= 0; i--) {

			if (Math.abs(ar[left]) > ar[right]) {

				sortedSquare[i] = ar[left] * ar[left];
				left++;

			} else {
				sortedSquare[i] = ar[right] * ar[right];
				right--;
			}
		}

		System.out.println(Arrays.toString(sortedSquare));
		return sortedSquare;
	}

	public static void main(String[] args) {
		int[] ar = { -6, -4, -2, 3, 5 };
		sortedSquareRoot(ar);
	}

}
