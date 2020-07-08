package com.RandomInterview.Test;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 7, 2, 9, 8, 8,7,19, -2 ,-19};

		/*System.out.println("Selection Sort\n===============");
		selectionSort(arr);
		System.out.println("\nInsertion Sort\n===============");
		insertionSort(arr);

		System.out.println("\nMerge Sort\n===============");
		long startime = System.nanoTime();
		int[] res = mergeSort(arr);
		long endtime = System.nanoTime();
		System.out.println((endtime - startime) / 100000000.0);
		System.out.println(Arrays.toString(res));*/
		
		quick(arr);
	}

	public static void swap(int[] arr, int fi, int si) {

		int temp = arr[fi];
		arr[fi] = arr[si];
		arr[si] = temp;
	}

	private static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int minindex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minindex]) {
					minindex = j;
				}
			}
			swap(arr, i, minindex);
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void insertionSort(int[] arr) {
		int currIndex;
		for (int pos = 0; pos < arr.length - 1; pos++) {
			currIndex = pos;
			while (currIndex > 0 && arr[currIndex] < arr[currIndex - 1]) {
				swap(arr, currIndex, currIndex - 1);
				currIndex = currIndex - 1;
			}

		}
		System.out.println(Arrays.toString(arr));
	}

	private static int[] mergeSort(int[] arr) {
		int[] res = new int[arr.length];
		if (arr.length == 1) {
			return arr;
		}
		int[] left;
		int[] right;
		int mid = arr.length / 2;
		if (arr.length % 2 == 0) {
			left = new int[mid];
			right = new int[mid];
		} else {
			left = new int[mid];
			right = new int[mid + 1];
		}

		for (int i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}
		for (int j = 0; j < right.length; j++) {
			right[j] = arr[mid++];
		}

		left = mergeSort(left);
		right = mergeSort(right);
		res = sortAndMerge(left, right);

		return res;
	}

	public static int[] sortAndMerge(int[] left, int right[]) {
		int[] res = new int[left.length + right.length];
		int lp = 0, rp = 0, resindex = 0;
		while (lp < left.length || rp < right.length) {
			while (lp < left.length && rp < right.length) {
				if (left[lp] < right[rp]) {
					res[resindex++] = left[lp++];
				} else if (left[lp] > right[rp]) {
					res[resindex++] = right[rp++];
				} else {
					res[resindex++] = left[lp++];
				}
			}

			while (lp < left.length && rp >= right.length) {
				res[resindex++] = left[lp++];
			}
			while (lp >= left.length && rp < right.length) {
				res[resindex++] = right[rp++];
			}
		}
		return res;
	}

	public static void quick(int[] arr) {
		
		if(arr.length == 0 ) {
			return;
		}
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int[] arr, int lowInd, int highInd) {
		
		int i = lowInd;
		int j = highInd;
		int pivot = arr[lowInd+(highInd-lowInd)/2];
		
		while (i <= j) {
			
			while(arr[i] < pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}
			
			if (i <= j) {
				swap(arr, i, j);
				i++;
				j--;
			}
		}
		if (lowInd < j) {
			quickSort(arr, lowInd, j);
		}
		if (i < highInd) {
			quickSort(arr, i, highInd);
		}
		
	}
}
