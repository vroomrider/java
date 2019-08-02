package com.java.practice.casting.model;

public class DogSubClass extends AnimalSuperClass {

	public DogSubClass() {
		printInConsole("DogSubClass Constructor");
	}

	public String name = "Dog";

	public String breedType = "Dog - Dollar Masion";

	public void speak()  {
		printInConsole("Dog barks.. ");
		// printInConsole("Using StaticMethod in speak()");
	}

	public void run() {
		printInConsole("Dogs run fast.. ");
	}

	/**
	 * @Printing.Logs.In.Console
	 * @param str
	 */
	public static void printInConsole(String str) {
		System.out.println("SubClass Dog Object: " + str);
	}
}
