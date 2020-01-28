package com.DailyCodingProblem.solution;

import java.util.Arrays;

/*
 * This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is the product of 
all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. 
If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 */

public class ReturnArrayWithproducts {

	public static int[] productArray(int[] ar) {
		int[] prodArr = new int[ar.length];

		for (int i = 0; i < ar.length; i++) {
			int prod = 1;
			for (int j = 0; j < ar.length; j++) {

				if (i != j) {
					prod *= ar[j];
				}

				prodArr[i] = prod;
			}

		}

		return prodArr;

	}

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(productArray(ar)));

	}

}
