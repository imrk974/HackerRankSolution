package com.RandomInterview.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class customComparator implements Comparator<List<List<String>>> {

	public int compare(List<List<String>> o1, List<List<String>> o2) {

		return o1.get(0).get(0).compareTo(o2.get(0).get(0));
	}

}

public class FootballSelAppDesign {

	public static List<List<String>> getSelectionStatus(List<List<String>> applications) {
		Collections.sort(applications, new Comparator<List<String>>() {
			public int compare(List<String> o1, List<String> o2) {
				return o1.get(0).compareTo(o2.get(0));
			}
		});
		List<List<String>> res = new ArrayList<List<String>>();
		
		
		List<List<String>> allstriker = new ArrayList<List<String>>();
		
		List<List<String>> alldefender = new ArrayList<List<String>>();
		
		List<List<String>> allreject = new ArrayList<List<String>>();
		
		List<List<String>> statuswithDetails = new ArrayList<List<String>>();
		
		
		for (int i = 0; i < applications.size(); i++) {
			List<String> striker = new ArrayList<String>();
			List<String> defender = new ArrayList<String>();
			List<String> reject = new ArrayList<String>();
			
			String name = applications.get(i).get(0);
			double height = Double.parseDouble(applications.get(i).get(1));
			double bmi = Double.parseDouble(applications.get(i).get(2));
			int scores = Integer.parseInt(applications.get(i).get(3));
			int defends = Integer.parseInt(applications.get(i).get(4));

			if (height >= 5.8 && bmi <= 23 && scores >= 50) {
				striker.add(name);
				striker.add("SELECT");
				striker.add("STRIKER");
				striker.add(scores+"");
				allstriker.add(striker);
				statuswithDetails.add(striker);
				statuswithDetails.add(applications.get(i));
			} else if (height >= 5.8 && bmi <= 23 && defends >= 30) {
				defender.add(name);
				defender.add("SELECT");
				defender.add("DEFENDER");
				defender.add(defends+"");
				alldefender.add(defender);
				statuswithDetails.add(defender);
				statuswithDetails.add(applications.get(i));
			} else {
				reject.add(name);
				reject.add("REJECT");
				reject.add("NA");
				allreject.add(reject);
				statuswithDetails.add(reject);
				statuswithDetails.add(applications.get(i));
			}

		}

		int defenderCount = alldefender.size();
		int strikerCount = allstriker.size();

		//Sort all striker list in ascending order
		Collections.sort(allstriker, new Comparator<List<String>>() {
			public int compare(List<String> o1, List<String> o2) {
				
				return o1.get(3).compareTo(o2.get(3));
			}
		});
		
		//Sort all defender in ascending order
		Collections.sort(alldefender, new Comparator<List<String>>() {
			public int compare(List<String> o1, List<String> o2) {
				
				return o1.get(3).compareTo(o2.get(3));
			}
		});
		
		for (int i =0; i < alldefender.size(); i++) {
			List<String> temp =alldefender.get(i);
			temp.remove(3);
			alldefender.remove(i);
			alldefender.add(i, temp);
		}
		
		for (int i =0; i < allstriker.size(); i++) {
			List<String> temp =allstriker.get(i);
			temp.remove(3);
			allstriker.remove(i);
			allstriker.add(i, temp);
		}
		int diff = Math.abs(defenderCount-strikerCount);
		
		while (strikerCount != defenderCount) {
			System.out.print(diff + " Footballers has to be removed from ");
			if (defenderCount > strikerCount) {
				System.out.println(" defender list");
				for (int i =0; i < diff; i++) {
					List<String> temp = alldefender.get(i);
					temp.set(2, "NA");
					temp.set(1, "REJECT");
					alldefender.remove(i);
					alldefender.add(i, temp);
					defenderCount--;
				}
			} else if (defenderCount < strikerCount) {
				System.out.println(" striker list");
				for (int i = 0; i < diff; i++) {
					List<String> temp = allstriker.get(i);
					temp.set(2, "NA");
					temp.set(1, "REJECT");
					allstriker.remove(i);
					allstriker.add(i, temp);
					strikerCount--;
				}
			}
		}
		
		res.addAll(allstriker);
		res.addAll(alldefender);
		res.addAll(allreject);

		Collections.sort(res, new Comparator<List<String>>() {
			public int compare(List<String> o1, List<String> o2) {
				return o1.get(0).compareTo(o2.get(0));
			}
		});

		return res;
	}

	public static int getCount(List<List<String>> list, String experience) {
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).get(2).equalsIgnoreCase(experience)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		List<List<String>> applications = new ArrayList<List<String>>();
		List<String> temp1 = new ArrayList<String>();
		temp1.add("Boateng");
		temp1.add("6.1");
		temp1.add("22");
		temp1.add("24");
		temp1.add("45");

		List<String> temp2 = new ArrayList<String>();
		temp2.add("Kaka");
		temp2.add("6");
		temp2.add("22");
		temp2.add("1");
		temp2.add("1");

		List<String> temp3 = new ArrayList<String>();
		temp3.add("Ronaldo");
		temp3.add("5.8");
		temp3.add("21");
		temp3.add("120");
		temp3.add("0");

		List<String> temp4 = new ArrayList<String>();
		temp4.add("Suarez");
		temp4.add("5.9");
		temp4.add("20");
		temp4.add("100");
		temp4.add("1");

		List<String> temp5 = new ArrayList<String>();
		temp5.add("Ramos");
		temp5.add("5.9");
		temp5.add("20");
		temp5.add("2");
		temp5.add("100");

		applications.add(temp5);
		applications.add(temp1);
		applications.add(temp2);
		applications.add(temp3);
		applications.add(temp4);
		

		System.out.println(getSelectionStatus(applications));
	}

}
