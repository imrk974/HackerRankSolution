package com.HackerRank.Solution;

public class BirthdayCandles {

	static int birthdayCakeCandles(int[] ar) {
		int count = 0, it = 0;
		int largest = ar[0];

		for (int i = 0; i < ar.length; i++) {
			if (largest < ar[i]) {
				largest = ar[i];
			}
		}
		
		while (it < ar.length) {
			if (ar[it] == largest) {
				count = count + 1;
			}
			it++;
		}
		
		
		/*
		 * for (int i=ar.length-1; i > 0; i--) { for (int j=0; j < i; j++) {
		 * 
		 * if(ar[j] >ar[i]) { int temp = ar[j]; ar[j] = ar[i]; ar[i] = temp; } }
		 * } System.out.println(Arrays.toString(ar)); for(int i=ar.length-2; i >
		 * 0; i--) { if (ar[i]==largest) { count = count + 1; } else { break; }
		 * 
		 * }
		 */
		return count;
	}

	public static void main(String[] args) {
		int[] ar = { 3, 2, 1, 3 };
		System.out.println(birthdayCakeCandles(ar));

	}

}
