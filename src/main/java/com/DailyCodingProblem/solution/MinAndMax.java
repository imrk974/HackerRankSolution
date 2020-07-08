package com.DailyCodingProblem.solution;

/*
 * Given an array of numbers of length N, find both the minimum and maximum using less than 2 * (N - 2) comparisons.
 * 
 */
public class MinAndMax {

	public static void findMinAndMax(int[] ar) {
		int min = ar[0];
		int max = ar[1];

		for (int i = 1; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			} else if (ar[i] < min) {
				min = ar[i];
			}
		}
		System.out.println("Min : " + min + "\nMax : " + max);
	}

	public static void kthMaxWithoutSorting(int[] ar, int k) {

		int fm = ar[0];
		int sm = ar[1];
		if (sm > fm) {
			fm = ar[1];
			sm = ar[0];
		}
		
		for (int i = 2; i < ar.length; i++) {
			if (ar[i] > sm && ar[i] < fm) {
				sm = ar[i];
			} else if( ar[i] > fm) {
				sm = fm;
				fm = ar[i];
			}
		}
		System.out.println("First max is : " +fm + "\nSecond max is : " + sm);
	}

	public static void main(String[] args) {
		int[] ar = { 2, 2, 8, 1, 89, 43, 67, -3, 98, 2 };
	//	findMinAndMax(ar);
		kthMaxWithoutSorting(ar, 2);

	}

}
