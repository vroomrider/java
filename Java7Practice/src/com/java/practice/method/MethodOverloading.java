package com.java.practice.method;

import com.java.practice.method.model.AlternativeShop;
import com.java.practice.method.model.NewShop;
import com.java.practice.method.model.OldShop;

/**
 * @advantage.to.developers Readability of the program
 * 
 * @features Same.[Name] but Difference.in.[Parameters]
 * 
 *           By changing the *NumberOArguments
 * 
 *           By changing the *DataType
 * 
 * @author pradeep_ramesh
 *
 */
public class MethodOverloading {

	public static void main(String[] args) {

		System.out.println("-- OLD --");
		OldShop oldShop = new OldShop();
		try {
			// oldShop.nCoStairCase();
			System.out.println();
			// oldShop.noStairCase("OldShop");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		System.out.println();
		System.out.println("-- NEW --");
		NewShop newShop = new NewShop();
		try {
			// newShop.noStairCase();
			System.out.println();
			// newShop.noStairCase("NewShop");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println();
		System.out.println("-- ALTERNATIVE SHOP --");
		AlternativeShop alternativeShop = new AlternativeShop();

	}
}
