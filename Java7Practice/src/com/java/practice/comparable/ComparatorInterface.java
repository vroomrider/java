package com.java.practice.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java.practice.comparable.model.Laptops;

public class ComparatorInterface {

	public static void main(String[] args) {
		// Integer, String both Implements Comparable Interface

		List<Laptops> laps = new ArrayList<>();
		laps.add(new Laptops("Dell", 16, 800));
		laps.add(new Laptops("Apple", 8, 1200));
		laps.add(new Laptops("Acer", 12, 700));
		laps.add(new Laptops("HP", 12, 600));

		/**
		 * @Laptops.Class
		 * @Not Compulsory to have Comparable Interface implemented and Require a simple
		 *      modification in the Collections.sort(..) Method
		 * @adding extra parameter which is Comparator implemented
		 */
		Comparator<Laptops> lapstopsComparator = new Comparator<Laptops>() {

			@Override
			public int compare(Laptops o1, Laptops o2) {
				if (o1.getPrice() > o2.getPrice()) {
					return 1;
				} else if (o1.getPrice() < o2.getPrice()) {
					return -1;
				} else {
					return 0;
				}
			}
		};

		Collections.sort(laps, lapstopsComparator);

		for (Laptops laptops : laps) {
			System.out.println(laptops.toString());
		}
	}
}
