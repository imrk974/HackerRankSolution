package com.revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TEST2 {

	public static void main(String[] args) {
		TEST2 test = new TEST2();
		test.replaceCandies();
	}

	public void replaceCandies() {
		Scanner s = new Scanner(System.in); // Reading input from STDIN
		// int N = s.nextInt();
		List<Integer> candiesList = new ArrayList<Integer>();

		// for (int i =0; i < N; i++) {
		// candiesList.add(s.nextInt());
		// }
		// int Q = s.nextInt();
		// int R = s.nextInt();

		List<List<Integer>> queriesList = new ArrayList<List<Integer>>();
		// for (int i =0 ;i < Q;i++) {
		// List<Integer> temp = new ArrayList<Integer>();
		// for (int j =0; j < R; j++) {
		// temp.add(s.nextInt());
		// }
		// queriesList.add(temp);
		// }

		candiesList.add(2);
		candiesList.add(5);
		candiesList.add(4);
		candiesList.add(7);
		candiesList.add(3);
		List<Integer> temp1 = new ArrayList<Integer>();
		List<Integer> temp2 = new ArrayList<Integer>();
		List<Integer> temp3 = new ArrayList<Integer>();

		temp1.add(4);
		temp1.add(8);
		temp1.add(2);

		temp2.add(3);
		temp2.add(6);
		temp2.add(3);

		temp3.add(1);
		temp3.add(4);
		temp3.add(4);

		queriesList.add(temp1);
		queriesList.add(temp2);
		queriesList.add(temp3);

		for (int i = 0; i < queriesList.size(); i++) {
			List<Integer> temp = queriesList.get(i);
			candiesList.set(temp.get(0) - 1, temp.get(1));
			System.out.print(findKthSmallest(candiesList, temp.get(2)));
			System.out.print(" ");
		}
		s.close();
	}

	int findKthSmallest(List<Integer> list, int k) {
		List<Integer> temp = new ArrayList<Integer>();
		temp = list;
		Collections.sort(temp);

		return temp.get(k - 1);
	}

}
