package com.revision;

import java.util.HashMap;
import java.util.Map;

public class ElimToMakePalindrome {

	public static void palindormeSubstring(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		String sbt = "";
		int oddcount = 0;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() % 2 == 0) {
				for (int i = 0; i < entry.getValue(); i++) {
					sbt = entry.getKey() + sbt + entry.getKey();
					i += 2;
				}

			} else if (entry.getValue() % 2 != 0 && oddcount < 1) {
				oddcount++;
				for (int i = 0; i < entry.getValue(); i++) {
					sbt = sbt.substring(0, sbt.length()/2 ) + entry.getKey() + sbt.substring(sbt.length()/2, sbt.length());
				}
			} else if (entry.getValue() % 2 != 0 && oddcount >= 1) {
				for (int i = 0; i < entry.getValue() - 1; i++) {
					sbt = entry.getKey() + sbt + entry.getKey();
					i += 2;
				}
			}

		}
		System.out.println(sbt);
		System.out.println(isPalindrome(sbt));
	}

	public static boolean isPalindrome(String s) {
		int lp =0; int rp = s.length()-1;
		while (lp <= rp) {
			if (s.charAt(lp) != s.charAt(rp)) {
				return false;
			}
			lp++;
			rp--;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String s = "aaadddasdddghasfdq23r312r4dwq314313";
		palindormeSubstring(s);

	}

}
