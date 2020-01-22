package com.RandomInterview.Test;

public class FibonacciNum {

	private static int printFibonacciNum(int num ) {
		
		if (num==1 || num==2) {
			return 1;
		}
		return printFibonacciNum(num-1) + printFibonacciNum(num-2);
	}
	
	
	public static void main(String[] args) {
		for(int i =1; i < 6; i++) {
			System.out.println(printFibonacciNum(i));
		}
		

	}

}
