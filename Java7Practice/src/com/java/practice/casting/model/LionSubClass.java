package com.java.practice.casting.model;

public class LionSubClass extends AnimalSuperClass {

	public LionSubClass() {
		printInConsole("LionSubClass Constructor");
	}

	public String name = "Lion";

	public String gender = "Female";

	public void speak() {
		printInConsole("Lion roars.. ");
		// printInConsole("Using StaticMethod in speak()");
		// jump();
	}

	public void hunt() {
		printInConsole("Lions hunt other animals.. ");
	}

	/**
	 * @Printing.Logs.In.Console
	 * @param str
	 */
	public static void printInConsole(String str) {
		System.out.println("SubClass Lion Object: " + str);
	}
}
