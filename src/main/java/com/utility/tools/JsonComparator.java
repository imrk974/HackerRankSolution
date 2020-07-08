package com.utility.tools;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.json.JSONObject;

public class JsonComparator {

	public static void comparator(JSONObject res1, JSONObject res2) {
		Map<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>();

		Set<String> res1Keys = res1.keySet();
		Set<String> res2Keys = res2.keySet();
		Iterator<String> it1 = res1Keys.iterator();
		Iterator<String> it2 = res2Keys.iterator();
		
		for (int i = 0; i < res1Keys.size(); i++) {
			String key = it1.next();
			map1.put(key, res1.get(key).toString());
		}

		for (int i = 0; i < res2Keys.size(); i++) {
			String key = it2.next();
			map2.put(key, res2.get(key).toString());
		}
		
		Map<String, String> tempmap1 = map1;
		Map<String, String> tempmap2 = map2;
		
		for (Map.Entry<String, String> entry : tempmap1.entrySet()) {
			if (tempmap2.containsKey(entry.getKey()) && entry.getValue().equals(tempmap2.get(entry.getKey()))) {
				tempmap2.remove(entry.getKey());
			}

		}
		System.out.println("Map2 doesnt contains these values from map1 "+ tempmap2);
		tempmap1 = map1;
		tempmap2 = map2;
		for (Map.Entry<String, String> entry : tempmap2.entrySet()) {
			if (tempmap1.containsKey(entry.getKey()) && entry.getValue().equals(tempmap1.get(entry.getKey()))) {
				tempmap1.remove(entry.getKey());
			}

		}
		System.out.println("Map1 doesnt contains these values from map1 "+ tempmap1);
	}

	public static void main(String[] args) {
		JSONObject js1 = new JSONObject();
		js1.put("param1", "abcd");
		js1.put("param2", "abcd");
		js1.put("param3", "abcdw");
		
		JSONObject js2 = new JSONObject();
		js2.put("param3", "abcd");
		js2.put("param4", "abcd");
		js2.put("param5", "abcd");
		
		comparator(js1, js2);
		
	}

}
