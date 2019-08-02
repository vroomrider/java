package com.java.practice.casting;

import com.java.practice.casting.model.AnimalSuperClass;
import com.java.practice.casting.model.DogSubClass;
import com.java.practice.casting.model.DogSubClassDollarMasion;
import com.java.practice.casting.model.LionSubClass;

public class UpCastingDemo {

	public static void main(String[] args) {

		printInConsole("---- Animal ----" + "constructor()," + "name," + "category," + "speak()," + "jump(),"
				+ "printInConsole())");
		AnimalSuperClass superClassAnimal = new AnimalSuperClass();
		printInConsole(superClassAnimal.name);
		printInConsole(superClassAnimal.category);
		superClassAnimal.speak();
		superClassAnimal.jump();
		superClassAnimal.printInConsole("Static Animal SuperClass");

		/**
		 * @Upcast
		 * @Description1.When _UpCasted the subclass data_members will not be available,
		 * 
		 *                    but
		 * 
		 *                    if data is *OverRided* then info of *SubClass is available
		 * 
		 * @Description2.All the other sub class data will be hidden
		 * 
		 */
		printInConsole("\n");
		printInConsole("---- Dog ----" + "constructor()," + "name," + "breedType," + "speak()," + "run(),"
				+ "printInConsole())");
		AnimalSuperClass subClassAnimalDog = new DogSubClass();
		printInConsole(subClassAnimalDog.name);
		printInConsole(subClassAnimalDog.category);
		// printInConsole(subClassAnimalDog.breedType);
		subClassAnimalDog.speak();
		subClassAnimalDog.jump();
		// subClassAnimalDog.run();
		subClassAnimalDog.printInConsole("Static Dog Upcasted to Animal");

		printInConsole("\n");
		printInConsole("---- DollarMasion to Dog ----" + "constructor()," + "name," + "breed," + "speak()," + "run(),"
				+ "printInConsole())");
		DogSubClass subClassDollarMasion = new DogSubClassDollarMasion();
		printInConsole(subClassDollarMasion.name);
		printInConsole(subClassDollarMasion.category);
		printInConsole(subClassDollarMasion.breedType);
		// printInConsole(subClassDollarMasion.breed);
		subClassDollarMasion.speak();
		subClassDollarMasion.jump();
		subClassDollarMasion.run();
		subClassDollarMasion.printInConsole("SubClass DogDollarMasion to SuperSubClass Dog");

		printInConsole("\n");
		printInConsole("---- DollarMasion to Animal ----" + "constructor()," + "name," + "breed," + "speak(),"
				+ "run()," + "printInConsole())");
		AnimalSuperClass subClassAnimalDogDollarMasion = new DogSubClassDollarMasion();
		printInConsole(subClassAnimalDogDollarMasion.name);
		printInConsole(subClassAnimalDogDollarMasion.category);
		// printInConsole(subClassAnimalDogDollarMasion.breedType);
		subClassAnimalDogDollarMasion.speak();
		subClassAnimalDogDollarMasion.jump();
		// subClassAnimalDogDollarMasion.run();
		subClassAnimalDogDollarMasion.printInConsole("Static DogDollarMasion Upcasted to Animal");

		/**
		 * @Description3.Static Methods cannot be overridden rather they will be hidden
		 */
		printInConsole("\n");
		printInConsole("---- Lion ----" + "constructor()," + "name," + "gender," + "speak()," + "hunt(),"
				+ "printInConsole())");
		AnimalSuperClass subClassAnimalLion = new LionSubClass();
		printInConsole(subClassAnimalLion.name);
		printInConsole(subClassAnimalLion.category);
		// printInConsole(subClassAnimalLion.breed);
		subClassAnimalLion.speak();
		subClassAnimalLion.jump();
		// subClassAnimalLion.hunt();
		subClassAnimalLion.printInConsole("Static Lion Upcasted to Animal");
	}

	/**
	 * @Printing.Logs.In.Console
	 * @param str
	 */
	public static void printInConsole(String str) {
		System.out.println(str);
	}

}
