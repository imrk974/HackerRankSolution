package com.RandomInterview.Test;

public class ReverseNum {

	static int reverse(int num) {
		if (num == 0) {
			return 0;
		}
		long reverse = 0;
		while (num != 0) {
			int rem = num % 10;
			reverse = reverse * 10 + rem;
			num /= 10;
			if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
				return 0;
			}
			
		}
		return (int)reverse;
	}

	public static void main(String[] args) {
		System.out.println(reverse(-2147483648));
	}

}
