package com.ProblemSolving.Practise;

public class BinarySearchSortedArray {

	static int searchBinary(int[] ar, int val) {
		int mid;
		int low = 0;
		int high = ar.length - 1;

		while (low <= high) {
			mid = low + (high - low) / 2;
			if (ar[mid] == val) {
				return mid;
			} else {
				if (ar[mid] < val) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] ar = {2,4,7,9,56};
		System.out.println(searchBinary(ar, 56));

	}

}
