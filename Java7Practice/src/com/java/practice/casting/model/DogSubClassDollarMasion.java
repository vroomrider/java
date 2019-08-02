package com.java.practice.casting.model;

public class DogSubClassDollarMasion extends DogSubClass {

	public DogSubClassDollarMasion() {
		printInConsole("DogSubClassDollarMasion Constructor");
	}

	public String name = "DollarMasion";

	public String breed = "DollarMasion";

	public void speak() {
		printInConsole("DollarMasion barks.. ");
		// printInConsole("Using StaticMethod in speak()");
	}

	public void run() {
		printInConsole("DollarMasion runs at a medium paced speed.. ");
	}

	/**
	 * @Printing.Logs.In.Console
	 * @param str
	 */
	public static void printInConsole(String str) {
		System.out.println("SubClass DogSubClassDollarMasion Object: " + str);
	}

}
