package com.java.practice.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.java.practice.comparable.model.Laptops;

public class ComparableInterface {

	public static void main(String[] args) {

		// Integer, String both Implements Comparable Interface

		List<Laptops> laps = new ArrayList<>();
		laps.add(new Laptops("Dell", 16, 800));
		laps.add(new Laptops("Apple", 8, 1200));
		laps.add(new Laptops("Acer", 12, 700));
		laps.add(new Laptops("HP", 12, 600));

		/**
		 * @Need Model Class to implement an object item and compareTo(..) used to
		 *       compare the data
		 */
		Collections.sort(laps);
		for (Laptops laptops : laps) {
			System.out.println(laptops.toString());
		}
	}
}
