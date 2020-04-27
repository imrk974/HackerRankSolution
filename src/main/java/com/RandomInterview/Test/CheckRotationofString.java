package com.RandomInterview.Test;

import java.util.Scanner;

public class CheckRotationofString {

	public static int checkRotation(String s1, String s2) {

		String clockwise = s1.substring(s1.length() - 2, s1.length()) + s1.substring(0, s1.length() - 2);

		String anticlockwise = s1.substring(2, s1.length()) + s1.substring(0, 2);

		if (s2.equals(clockwise)) {
			return 1;
		} else if (s2.equals(anticlockwise)) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test case: ");
		int num = sc.nextInt();
		String[] ar = new String[num*2];
		System.out.println("Enter the Strings: ");
		for (int i = 0;i < num*2; i++) {
			ar[i] = sc.next();
		}
		for (int i =0; i < ar.length; i++) {
			System.out.println(checkRotation(ar[i],ar[i+1]));
			i=i+1;
		}
	}
}
