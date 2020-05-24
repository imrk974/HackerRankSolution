package com.RandomInterview.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TriangleArea {

	public static long getTriangleArea(List<Integer> x, List<Integer> y) {
		Map<Integer, Integer> A = new HashMap<Integer, Integer>();
		Map<Integer, Integer> B = new HashMap<Integer, Integer>();
		Map<Integer, Integer> C = new HashMap<Integer, Integer>();
		A.put(x.get(0), y.get(0));
		B.put(x.get(1), y.get(1));
		C.put(x.get(2), y.get(2));

		Map<String, List<Integer>> points = new HashMap<String, List<Integer>>();
		for (int i = 0; i < x.size(); i++) {
			List<Integer> coordinates = new ArrayList<Integer>();
			coordinates.add(x.get(i));
			coordinates.add(y.get(i));
			points.put("point" + (i + 1), coordinates);
		}

		long Ax = points.get("point1").get(0);
		long Bx = points.get("point2").get(0);
		long Cx = points.get("point3").get(0);
		
		long Ay = points.get("point1").get(1);
		long By = points.get("point2").get(1);
		long Cy = points.get("point3").get(1);
		
		long area = Math.abs((Ax *(By -Cy) + Bx *(Cy - Ay) + Cx * (Ay - By)) /2);
		
		
//		int a = (points.get("point1").get(0) * (points.get("point2").get(1) - points.get("point3").get(1))
//				+ (points.get("point2").get(0) * (points.get("point3").get(1) - points.get("point1").get(1)))) /2;

		
		System.out.println(area);

		return (long) area;
	}

	public static void main(String[] args) {

		List<Integer> x = new ArrayList<Integer>();
		List<Integer> y = new ArrayList<Integer>();

		x.add(0);
		x.add(0);
		x.add(99999);

		y.add(0);
		y.add(99998);
		y.add(99999);

		System.out.println(getTriangleArea(x, y));
	}

}
