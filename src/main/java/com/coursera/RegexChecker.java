package com.coursera;

import java.util.Arrays;

public class RegexChecker {

	
	
	public static void main(String[] args) {
	
		//String s = "%one%%%%%two%%%%%%three";
		String s = "abc amazon    defg bike  car vendor spelling";
		
		String[] temp = s.split(" +");
		System.out.println(Arrays.toString(temp));
	}
}
