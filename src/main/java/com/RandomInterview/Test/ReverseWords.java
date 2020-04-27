/*
 * 
 * Input:
The first line contains T denoting the number of testcases. T testcases follow. Each case contains a string S containing characters.

Output:
For each test case, in a new line, output a single line containing the reversed String.

Constraints:
1 <= T <= 100
1 <= |S| <= 2000

Example:
Input:
2
i.like.this.program.very.much
pqr.mno

Output:
much.very.program.this.like.i
mno.pqr

 */

package com.RandomInterview.Test;

import java.util.Scanner;

public class ReverseWords {

	public static String reversewords(String s) {
		String reverse = "";

		String[] sArr = s.split("\\.");
		for (int i = sArr.length-1; i >= 0; i--) {
			if (reverse.length() < 1) {
				reverse = reverse + sArr[i];
			} else {
				reverse = reverse + "." + sArr[i];
			}
		}

		return reverse;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] ar = new String[num];
		for (int i =0;i < num; i++) {
			ar[i] = sc.next();
		}
		for (int i =0; i < ar.length; i++) {
			System.out.println(reversewords(ar[i]));
		}
	}

}
