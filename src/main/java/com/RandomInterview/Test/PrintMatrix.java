package com.RandomInterview.Test;

public class PrintMatrix {

	
	void printMatrixInSpiral(int[][] arr, int m, int n) {
		
		int i =0;
		while (i < m*n) {
			for (int j=0; j < m; j++) {
				System.out.println(arr[i][j]);
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 }, 
                { 5, 6, 7, 8 }, 
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }};
		
		

	}
}
