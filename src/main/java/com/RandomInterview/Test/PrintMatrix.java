package com.RandomInterview.Test;

public class PrintMatrix {

	static void printMatrixInSpiral(int[][] arr, int m, int n) {
		int i = 0;
		int rowIndex = 0, colIndex = 0;
		int rowLength = m;
		int colLength = n;

		while (rowIndex < m || colIndex < n) {
			for (colIndex = 0; colIndex < colLength; colIndex++) {
				System.out.println(arr[rowIndex][colIndex]);
			}
			rowIndex++;
			colIndex--;
			for (int k = rowIndex; k < rowLength; k++) {
				System.out.println(arr[k][colIndex]);
				rowIndex = k;
			}
			colIndex--;
			for (int l = colIndex; l >= 0; l--) {
				System.out.println(arr[rowIndex][l]);
				colIndex = l;
			}

		}

	}
/*
 * 1  2  3  4
 * 5  6  7  8
 * 9  10 11 12
 * 13 14 15 16
 */
	
	
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		printMatrixInSpiral(arr, 4, 4);

	}
}
