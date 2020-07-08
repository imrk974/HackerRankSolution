package com.revision;

public class CheckPalindrome {

	public static boolean checkPalindrom(int num) {
		int origNum = num;
		int reversenum = 0;
		while (num != 0) {
			int rem = num % 10;
			reversenum = rem + reversenum * 10;
			num = num / 10;

		}
		System.out.println(reversenum);
		if (origNum == reversenum) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println(checkPalindrom(101101));

	}

}
