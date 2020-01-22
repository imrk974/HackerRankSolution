package com.RandomInterview.Test;

public class CheckPalindrome {

	private static boolean isPalindrome(String s) {
		int i = 0;
		boolean palindromeStatus = false;
		while (i < s.length() / 2) {
			if (s.charAt(i) == s.charAt((s.length() - 1) - i)) {
				palindromeStatus = true;
			} else {
				palindromeStatus = false;
				break;
			}
			i++;
		}
		return palindromeStatus;

	}

	private static boolean isNumPalindrome(int num) {
		int origNum = num;
		int reverseNum = 0;
		while (num != 0) {

			int remainder = num % 10;
			reverseNum = reverseNum * 10 + remainder;
			num = num/10;
		}
		return reverseNum==origNum;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("abaaba"));
		System.out.println(isNumPalindrome(454));

	}

}
