package com.java.practice.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class MapHashMap {
	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);
		// System.out.println("Hello");
		// String stringIn = sc.nextLine();
		// System.out.println("Next Line");
		// Integer intIn = sc.nextInt();
		// System.out.println("Next Int");
		// String nextIn = sc.next();
		// System.out.println("Next");
		Integer count = 1;
		Integer count2 = 1;

		List<Integer> nl = new ArrayList<Integer>();
		nl.add(1);
		nl.add(2);
		nl.add(3);
		nl.add(2);
		nl.add(2);
		nl.add(4);
		nl.add(4);
		nl.add(0);
		nl.add(0);
		nl.add(0);
		nl.add(1);
		nl.add(1);

		Set<Integer> intSet = new TreeSet<>();
		Map<Integer, Integer> map2 = new HashMap<>();
		Long mapForCountStart = System.currentTimeMillis();
		for (int i = 0; i < nl.size(); i++) {
			intSet.add(nl.get(i));
		}

		for (Integer intVal : intSet) {
			count = 0;
			for (int j = 0; j < nl.size(); j++) {
				if (intVal == (nl.get(j))) {
					++count;
				}
			}
		}
		Long mapForCountEnd = System.currentTimeMillis();
		Long totalForCount = mapForCountEnd - mapForCountStart;
		System.out.println(
				"Start = " + mapForCountStart + ", End = " + mapForCountEnd + ", Time = " + totalForCount + " ms");
		System.err.println("------------------------------------");
		Long mapCountStart = System.currentTimeMillis();
		for (Integer integer : nl) {
			if (map2.containsKey(integer)) {
				map2.put(integer, map2.get(integer) + 1);
			} else {
				map2.put(integer, count2);
			}
		}
		Long mapCountEnd = System.currentTimeMillis();
		Long totalCount = mapCountEnd - mapCountStart;
		System.out.println(map2);
		System.out.println("Start = " + mapCountStart + ", End = " + mapCountEnd + ", Time = " + totalCount + " ms");
		StringTokenizer token = new StringTokenizer("hello World", "");

		Map<Integer, Integer> map = new HashMap<>();
		Entry<Integer, Integer> emap = (Entry<Integer, Integer>) map.entrySet();
		emap.getKey();
	}

}
