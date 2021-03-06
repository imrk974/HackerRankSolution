package com.HackerRank.Solution;

public class TimeConversion {

	static String timeConversion(String s) {
		String finalFormat = null;
		if (s.contains("AM")) {
			String temp = s.replace("AM", "");
			
			String[] sArr = temp.split(":");
			if(Integer.parseInt(sArr[0]) > 11) {
				finalFormat = "00" + ":" + sArr[1] + ":" + sArr[2];
			} else {
				finalFormat = s.replace("AM", "");
			}
			
		} else if (s.contains("PM")) {
			String temp = s.replace("PM", "");
			int hourin24 = 0;
			String[] sArr = temp.split(":");
			if (Integer.parseInt(sArr[0]) < 12) {
				hourin24 = Integer.parseInt(sArr[0]) + 12;
				finalFormat = hourin24 + ":" + sArr[1] + ":" + sArr[2];
			} else {
				finalFormat = temp;
			}
		}
		return finalFormat;

	}

	public static void main(String[] args) {
		System.out.println(timeConversion("12:45:54AM"));

	}

}
