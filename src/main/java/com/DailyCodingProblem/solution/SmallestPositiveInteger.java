package com.DailyCodingProblem.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * This problem was asked by Amazon.

Given a sorted array, find the smallest positive integer that is not the sum of a subset of the array.

For example, for the input [1, 2, 3, 10], you should return 7.

Do this in O(N) time.
 */

public class SmallestPositiveInteger {

	public void listofSubsetSums(int[] ar) {

		int fp = 0;
		int sp = 1;
		int ri = 1;
		int sum = 0;
		List<Integer> subsetsum = new ArrayList<Integer>();
		while (fp < ar.length) {
			subsetsum.add(ar[fp]);
			sum = ar[fp];
			while (ri < ar.length) {
				sp = ri;
				while (sp < ar.length) {
					sum += ar[sp];
					subsetsum.add(sum);
					sp++;
				}
				sum = ar[fp];
				ri++;
			}

			fp++;
			sum = 0;
			ri = fp + 1;
			
		}
		Collections.sort(subsetsum);
		System.out.println(subsetsum);
	}

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 10 };
		SmallestPositiveInteger sm = new SmallestPositiveInteger();
		sm.listofSubsetSums(ar);

	}

}
