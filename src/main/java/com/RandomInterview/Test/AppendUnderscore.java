package com.RandomInterview.Test;


public class AppendUnderscore {

	private static String append_(String str, int pos) {

		String newStr = str.substring(0, pos) + "_" + str.substring(pos, str.length());
		System.out.println(newStr);
		if (pos == str.length() - 1) {
			return newStr;
		}
		pos++;
		
		append_(newStr, pos + 1);

		return newStr;

	}

	public static void main(String[] args) {
		String str = "INFORMATICA";
		for (int i = 1; i < str.length(); i++) {
			append_(str, i);
		}

	}

}
