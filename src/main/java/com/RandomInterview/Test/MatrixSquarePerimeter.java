package com.RandomInterview.Test;

import java.util.ArrayList;

public class MatrixSquarePerimeter {

//	static int sum(int initVal) {
//		int sum = 0;
//		sum += A.get(i).get(i);
//		sum += A.get(i).get(i - 1);
//
//		sum += A.get(i).get(i);
//		sum += A.get(i).get(i + 1);
//		initVal = i;
//
//	}

	static void perimeter(ArrayList<ArrayList<Integer>> A) {

		int m = A.size();
		int n = A.get(0).size();
		int sum = 0;
		int count = 0;
		int numofSquare = A.size();
		int initVal = 0;

		for (int i = 0; i < 2 && count < 2; i++) {
			if (i > initVal) {
				sum += A.get(i).get(i);
				sum += A.get(i).get(i - 1);
			} else {
				sum += A.get(i).get(i);
				sum += A.get(i).get(i + 1);
				initVal = i;
			}

		}

		while (numofSquare < A.size()) {
			for (int i = 0; i < 2 && count < 2; i++) {

				A.get(i).get(i);
				A.get(i).get(i + 1);

				for (int j = i; j < m && j < i + 1; j++) {
					sum += sum + A.get(i).get(j);
				}
				count++;
			}

			numofSquare++;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
