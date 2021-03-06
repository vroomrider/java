package com.java.practice.casting.model;

/**
 * 
 * @author pradeep_ramesh
 *
 */
public class AnimalSuperClass {

	public AnimalSuperClass() {
		printInConsole("AnimalSuperClass Constructor");
	}

	public String name = "Animal";

	public String category = "Animal.Category";

	public void speak() {
		printInConsole("Animal speaks.. ");
	}

	public void jump() {
		printInConsole("All Animals cannot Jump");
	}

	/**
	 * @Printing.Logs.In.Console
	 * @param str
	 */
	public static void printInConsole(String str) {
		System.out.println("SuperClass Object: " + str);
	}
}
