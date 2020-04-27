package com.RandomInterview.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RemoveAdjacentDuplicates {

	public static String removeDup(String s) {
		String subs = "";
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {

			if (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
				stack.pop();
			} else {

				stack.push(s.charAt(i));
			}
		}
		while (!stack.isEmpty()) {
			subs = stack.pop() + subs;
		}

		return subs;
	}

	/// aacdffge
	public static String removeAllDupChars(String s) {
		StringBuffer sb = new StringBuffer();
		int lp = 0, rp = 1;
		while (lp < s.length()) {
			int count = 0;
			while (rp < s.length()) {
				if (s.charAt(lp) != s.charAt(rp) && count == 0) {
					sb.append(s.charAt(lp));
					break;
				} else if (s.charAt(lp) != s.charAt(rp) && count > 0) {
					break;
				} else if (s.charAt(lp) == s.charAt(rp)) {
					count++;
					rp++;
				}
			}
			if (lp == s.length() - 1) {
				if (s.charAt(lp) != sb.charAt(sb.length()-1)) {
					sb.append(s.charAt(lp));
					lp++;
				} else {
					lp++;
				}

			} else {
				lp = rp;
				rp = rp + 1;
			}

		}

		return sb.toString();
	}

	public static String removeUsingMap(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		StringBuffer sb = new StringBuffer();
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				sb.append(entry.getKey());
			}
		}
		return sb.toString();
	}

	public static String removeLastAttempt(String s) {

		return null;
	}

	public static void main(String[] args) {
		System.out.println(removeDup("acaaabbbacdddd"));

	}

}
