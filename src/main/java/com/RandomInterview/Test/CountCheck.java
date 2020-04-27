package com.RandomInterview.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountCheck {

	public static int[] solve(int[] A) {
		List<Integer> ls = new ArrayList<Integer>();

		for (int i = 0; i < A.length; i++) {
			int num = A[i];
			int count = 0;
			for (int j = 0; j < A.length; j++) {
				if(j!= i && A[j] > num) {
					count++;
				}
				

			}
			if (count > 1) {
				ls.add(num);
			}
		}

		int[] res = new int[ls.size()];
		for (int k = 0; k < ls.size(); k++) {
			res[k] = ls.get(k);
		}

		return res;
	}

	public static void main(String[] args) {
		int[] a = { 2, 5, 7, 3 };
		System.out.println(Arrays.toString(solve(a)));
	}
}
