package com.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST3 {

	public static void splitStrings(String s) {
		String[] temp = s.split("\"");
		// System.out.println(Arrays.toString(temp));
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '"') {
				list.add(i);
			}
		}
		List<String> quotedString = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			String substring = s.substring(list.get(i) + 1, list.get(i + 1));
			// System.out.println(substring);
			quotedString.add(substring);
			i++;
		}
		List<String> finalString = new ArrayList<String>();
		for (int i = 0; i < temp.length; i++) {
			if (!quotedString.contains(temp[i].trim())) {
				finalString.addAll(Arrays.asList(temp[i].trim().split(" ")));
			} else {
				finalString.add("\"" + temp[i] + "\"");
			}

		}

		for (String str : finalString) {
			System.out.println(str);
		}
	}

	public static void splitString2(String s) {
		List<String> list = new ArrayList<String>();
		int lp = 0;
		int rp = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == ' ') {
				String temp = s.substring(lp, rp);
				lp = rp;
				list.add(temp);
				rp++;
			} else if (s.charAt(i) == '"') {
				lp = i;
				rp++;
				while (s.charAt(i + 1) != '"') {
					i++;
					rp++;
				}
				String temp = s.substring(lp, rp + 1);
				list.add(temp);
			} else {
				rp++;
			}
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		String s = "xyz abc mnp \"asdf dfaa asdf\" asd \"fdas asdsdafF\"";
		splitString2(s);
	}

}
