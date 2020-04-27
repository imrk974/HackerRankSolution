package com.RandomInterview.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {

	public static boolean validParenthesis(String s) {

		if (s.length() % 2 != 0) {
			return false;
		}

		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put(')','(');
		map.put('}','{');
		map.put(']','[');
				
		Stack<Character> stack = new Stack<Character>();
		String openBraces = "({[";

		for (int i = 0; i < s.length(); i++) {
			if (openBraces.contains(s.charAt(i) + "")) {
				stack.push(s.charAt(i));
			} else {
				if (!stack.isEmpty() && map.get(s.charAt(i)) == stack.peek()) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		if (stack.isEmpty()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(validParenthesis("){"));

	}

}

/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * Open brackets must be closed by the same type of brackets. Open brackets must
 * be closed in the correct order. Note that an empty string is also considered
 * valid.
 * 
 * Example 1:
 * 
 * Input: "()" Output: true Example 2:
 * 
 * Input: "()[]{}" Output: true Example 3:
 * 
 * Input: "(]" Output: false Example 4:
 * 
 * Input: "([)]" Output: false Example 5:
 * 
 * Input: "{[]}" Output: true
 */
