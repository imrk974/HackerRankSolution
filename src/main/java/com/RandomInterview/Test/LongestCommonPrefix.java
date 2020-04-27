package com.RandomInterview.Test;

public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {

		StringBuffer sb = new StringBuffer();
		int pointer = 0;
		String first = "";
		if (strs.length > 0) {
			first = strs[0];
		} else {
			return first;
		}
		boolean isExists = true;
		while (pointer < first.length()) {
			if (first.length() == 0 || strs.length == 0) {
				return "";
			}
			for (int i = 1; i < strs.length; i++) {
				if (pointer < strs[i].length()) {
					if (first.charAt(pointer) != strs[i].charAt(pointer)) {
						isExists = false;
						break;
					}
				} else {
					isExists = false;
					break;
				}
			}
			if (isExists) {
				sb.append(first.charAt(pointer));
			}
			pointer++;
		}
		return sb.toString();
	}

	public static String longestString(String[] strs) {
		String longestString = "";
		int pointer = 0;
		if (strs.length == 0) {
			return longestString;
		}

		for (char c : strs[0].toCharArray()) {

			for (int i = 1; i < strs.length; i++) {
				if (strs[i].length() <= pointer || c != strs[i].charAt(pointer)) {
					return longestString;
				}
			}
			longestString += c;
			pointer++;

		}

		return longestString;
	}

	public static void main(String[] args) {
		String[] strs = { "aa", "a" };
		System.out.println(longestString(strs));

	}

}
