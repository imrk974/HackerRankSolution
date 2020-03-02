package com.DailyCodingProblem.solution;

/*
 * This problem was asked by Google.

Given a string of words delimited by spaces, reverse the words in string. For example, given "hello world here", return "here world hello"

Follow-up: given a mutable string representation, can you perform this operation in-place?
 */

public class ReverseWords {

	static String reverse(String str) {
		String reverse = "";
		String[] sar = str.split(" ");
		for (int i=sar.length-1; i>= 0; i--) {
			reverse += sar[i] + " "; 
		}
		
		return reverse.trim(); 
	}
	
	
	public static void main(String[] args) {
		System.out.println(reverse("hello world here"));

	}

}
