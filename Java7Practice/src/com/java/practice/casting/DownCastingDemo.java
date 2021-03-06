package com.java.practice.casting;

import com.java.practice.casting.model.AnimalSuperClass;
import com.java.practice.casting.model.DogSubClass;

public class DownCastingDemo {

	public static void main(String[] args) {
		printInConsole("Executing same class data");
		AnimalSuperClass animal = new AnimalSuperClass();
		animal.speak();

		DogSubClass dog = new DogSubClass();
		dog.speak();

		/**
		 * @DownCasting
		 * @Description1.You can proceed to Downcast the which is already upCasted else
		 *                   you cannot perform downcast operation
		 */
		printInConsole("\n");
		printInConsole("Initially you need to upcast the data before you downcast it.");
		AnimalSuperClass animal2dog = new DogSubClass();
		animal2dog.speak();
		animal2dog.jump();
		animal2dog.printInConsole("Upcasted Dog to Animal Object");

		printInConsole("\n");
		printInConsole("Downcast the upcasted object");
		DogSubClass dogs = (DogSubClass) animal2dog;
		dogs.speak();
		dogs.jump();
		dogs.run();
		dogs.printInConsole("Downcasted Animal to Dog Object");

	}

	/**
	 * @Printing.Logs.In.Console
	 * @param str
	 */
	public static void printInConsole(String str) {
		System.out.println(str);
	}

}
