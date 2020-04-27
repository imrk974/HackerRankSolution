package com.RandomInterview.Test;

public class ATOI {

	public static int stringTonum(String s) {
		int num = -1;
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			
		}
		
		return num;
	}
	public static void main(String[] args) {
		
		
		System.out.println(stringTonum("123"));

	}

}
