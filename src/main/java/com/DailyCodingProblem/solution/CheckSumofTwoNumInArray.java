package com.DailyCodingProblem.solution;

/*
 * This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?

 */

public class CheckSumofTwoNumInArray {

	private static boolean checkSuminArray(int[] arr, int sum) {

		// Complexity O(n^2) Not recommended
		long startTime = System.nanoTime();
		long elapsedTime;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == sum) {
					elapsedTime = System.nanoTime() - startTime;
					System.out.println("Total time taken to execute : " + elapsedTime);
					return true;
				}
			}
		}
		elapsedTime = System.nanoTime() - startTime;
		System.out.println("Total time taken to execute : " + elapsedTime);
		return false;

	}

	private static boolean checkSuminArrayOptimal(int[] arr, int sum) {
		for (int i = 0; i < arr.length - 1; i++) {
			int reqnum = sum - arr[i];
			int j = i+1;
			while (j < arr.length) {
				if (reqnum == arr[j]) {
					return true;
				}
			}
			
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 11, 15, 3, 7, 34, 6, 2, 8, 11, 3, 32, 45, 689, 32, 7, 4, 9, 90 };

		System.out.println(checkSuminArray(arr, 97));

		System.out.println(checkSuminArrayOptimal(arr, 99));

	}

}
