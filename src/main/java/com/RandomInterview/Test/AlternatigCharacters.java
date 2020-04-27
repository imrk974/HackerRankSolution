package com.RandomInterview.Test;

public class AlternatigCharacters {

	static int alternatingCharacters(String s) {
		int count = 0;

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
				s = s.substring(0, i) + s.substring(i + 1, s.length());
				i--;
			}
		}
		return count;
	}

	static int altchars(String s) {
		int res = 0;
		int lp = 0, rp = 1;

		while (lp < s.length() && rp < s.length()) {
			if (s.charAt(lp) == s.charAt(rp)) {
				lp = rp;
				rp++;
				res++;
			} else {
				lp++;
				rp++;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		System.out.println(alternatingCharacters("AAAA"));
	}

}
