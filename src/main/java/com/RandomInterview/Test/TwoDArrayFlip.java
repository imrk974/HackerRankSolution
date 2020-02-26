package com.RandomInterview.Test;

public class TwoDArrayFlip {

	public static int[][] flipArray(int[][] ar, int m, int n) {

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (ar[i][j] == 0) {
					
					if (i == 0 && j == 0) {
						if (ar[i + 1][j] == 1 || ar[i][j + 1] == 1) {
							ar[i][j] = 1;
						}
					}
					if (i > 0 && j > 0) {
						if (ar[i - 1][j] == 1 || ar[i + 1][j] == 1 || ar[i][j - 1] == 1 || ar[i][j + 1] == 1) {
							ar[i][j] = 1;
						}
					}
					if (i == 0 && j > 0) {
						if (ar[i][j +1] == 1 || ar[i + 1][j] == 1) {
							ar[i][j] = 1;
						}

					}
					
					if (i > 0 && j == 0) {
						if (ar[i -1][j] == 1 || ar[i + 1][j] == 1) {
							ar[i][j] = 1;
						}
					}

				}

			}
		}
		return ar;
	}

	public static void main(String[] args) {
		
		int[][] ar = {	{1,0,0,1}, 
						{0,1,1,0},
						{1,0,0,0}};
		
		System.out.println(flipArray(ar, 4, 3));
		
		
		

	}

}
