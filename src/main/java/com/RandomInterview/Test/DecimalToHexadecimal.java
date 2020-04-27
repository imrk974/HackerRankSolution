package com.RandomInterview.Test;

public class DecimalToHexadecimal {

	/*
	 * How to convert from decimal to hex Conversion steps: Divide the number
	 * by16. Get the integer quotient for the next iteration. Get the remainder
	 * for the hex digit. Repeat the steps until the quotient is equal to 0.
	 */
	static StringBuffer sb = new StringBuffer();
	int number = 0;
	int NUMBER = 17;
	int Number = 1;
	static String numToAlpha(Double d) {
		if (d < 10) {
			return d.toString();
		} else if (d == 10) {
			return "A";
		} else if (d == 11) {
			return "B";
		} else if (d == 12) {
			return "C";
		} else if (d == 13) {
			return "D";
		} else if (d == 14) {
			return "E";
		} else if (d == 15) {
			return "F";
		}

		return null;
	}

	static Integer quotient;
	static Integer remainder;

	private static String convertToHexadecimal(Integer num) {

		quotient = num / 16;
		remainder = num % 16;

		if (quotient == 0) {
			sb.append(Integer.toHexString(remainder));
			return sb.toString();
		}
		sb.append(Integer.toHexString(remainder));
		convertToHexadecimal(quotient);

		return sb.toString();

	}

	public static void main(String[] args) {
		System.out.println(convertToHexadecimal(7562));

	}

}
