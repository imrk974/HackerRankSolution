package com.HackerRank.Solution;

import java.util.List;

public class BirthDayChoclates {

	static int birthday(List<Integer> s, int d, int m) {

		int i = 0;

		while (i < m) {

			for (int j = 0; j < s.size(); j++) {
				int sum = 0;
				for (int k = j + 1; k < s.size(); k++) {
					sum += s.get(k);
				}
			}

			i++;

		}

		return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
