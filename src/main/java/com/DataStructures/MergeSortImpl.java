package com.DataStructures;

import java.util.Arrays;

public class MergeSortImpl {

	private static int[] mergeSort(int[] ar) {
		if (ar.length <= 1) {
			return ar;
		}

		int res[] = new int[ar.length];
		int midpoint = ar.length / 2;
		int[] left = new int[midpoint];
		int[] right;
		if (ar.length % 2 == 0) {
			right = new int[midpoint];
		} else {
			right = new int[midpoint + 1];
		}

		for (int i = 0; i < left.length; i++) {
			left[i] = ar[i];
		}

		for (int j = 0; j < right.length; j++) {
			right[j] = ar[midpoint + j];
		}

		left = mergeSort(left);
		right = mergeSort(right);

		return merge(left, right);

	}

	private static int[] merge(int[] left, int[] right) {
		int res[] = new int[left.length + right.length];
		int leftPointer, rightPointer, resPointer;
		leftPointer = rightPointer = resPointer = 0;

		while (leftPointer < left.length || rightPointer < right.length) {

			if (leftPointer < left.length && rightPointer < right.length) {

				if (left[leftPointer] > right[rightPointer]) {
					res[resPointer++] = right[rightPointer++];
				} else if (left[leftPointer] < right[rightPointer]) {
					res[resPointer++] = left[leftPointer++];
				}

			} else if (leftPointer < left.length) {
				res[resPointer++] = left[leftPointer++];
			} else if (rightPointer < right.length) {
				res[resPointer++] = right[rightPointer++];
			}
		}

		return res;
	}

	public static void main(String[] args) {
		int[] ar = { 24, 6, -3, 55, 4, 35, -22 };
		System.out.println("Before Merge Sort : \n" + Arrays.toString(ar) + "\n\nAfter Merge Sort : \n");
		System.out.println(Arrays.toString(mergeSort(ar)));

	}

}
