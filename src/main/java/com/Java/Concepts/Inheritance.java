package com.Java.Concepts;

import java.util.Arrays;

class Student extends Inheritance {
	private int id;

	public Student(String n, int id) {
		super(n);
		this.id = id;
	}

	public String toString() {
		return super.toString() + ", " + id;
	}
}

public class Inheritance {

	private String name;

	public Inheritance(String n) {
		this.name = n;
	}

	public String toString() {
		return name;
	}

	public static int hasLetter(String word, char letter) {
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == letter) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
//		Inheritance p = new Student("Clarissa", 1234);
//		System.out.println(p);
		
		String s = "abcdg2eabcd1aba44bgh";
		char[] c= s.toCharArray();
		System.out.println(Arrays.toString(s.split("[1,2,4]")));
		
		
		System.out.println(hasLetter("word", 'd'));
		
	}
}
