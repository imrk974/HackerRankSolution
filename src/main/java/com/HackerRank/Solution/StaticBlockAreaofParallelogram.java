package com.HackerRank.Solution;

import java.util.Scanner;

public class StaticBlockAreaofParallelogram {
	static int B,H;
	static boolean flag=false;
	static {
	    Scanner sc = new Scanner(System.in);
	    B = sc.nextInt();
	    H = sc.nextInt();
	    sc.close();
	    if (B<0||H<0) {
	    	System.out.println("java.lang.Exception: Breadth and height must be positive");
	    } else {
	    	flag = true;
	    }
	}
	public static void main(String[] args){
			if(flag){
				int area=B*H;
				System.out.print(area);
			} 
		}
}
