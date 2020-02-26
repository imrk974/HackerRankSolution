package com.RandomInterview.Test;

public class CheckSumofAnyNuminArray {

	public static boolean checkSum(int[] ar, int sum) {
		boolean exist = false;
		for (int i = 0; i < ar.length - 1; i++) {
			if (ar[i] == sum) {
				exist = true;
				return exist;
			} else {
				if (i < ar.length - 1) {
					int newSum = ar[i] + ar[i + 1];
					int count = i+2;
					while (count <= ar.length && newSum <= sum) {
						if (newSum == sum) {
							exist = true;
							return exist;
						} else {
							newSum += ar[count];
						}
						count++;
					}

				}
			}

		}
		return exist;
	}

	public static void main(String[] args) {
		int[] ar = { 2, 4, 7, 9, 8, 3 };
		System.out.println(checkSum(ar, 33));

	}

}
