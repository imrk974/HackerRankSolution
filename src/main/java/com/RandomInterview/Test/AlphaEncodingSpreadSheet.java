package com.RandomInterview.Test;

public class AlphaEncodingSpreadSheet {

	public static char changetoNumtoChar(int num) {
		char c = (char) (num);

		return c;
	}

	static StringBuffer sb = new StringBuffer();
	public static String getfinalString(int num) {
		
		do {
			int a = num / 26;
			num = num % 26;
			
			while (a != 0) {
				sb.append('A');
				a--;
			} 
			
			if (num != 0) {
				char c= changetoNumtoChar(num + 64);
				sb.append(c);
			} else if (num == 0) {
				sb.append('Z');
			}
			
		} while (num > 26);

		
		return sb.toString();
	
	}

	
	
	public static void main(String[] args) {
		System.out.println(getfinalString(80));
	}

}
