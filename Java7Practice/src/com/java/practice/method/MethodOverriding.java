package com.java.practice.method;

import com.java.practice.method.model.AlternativeShop;
import com.java.practice.method.model.NewShop;
import com.java.practice.method.model.OldShop;

/**
 * @Importance Runtime.Polymorphism
 * 
 * @features Method must have the *same name as in the parent class.
 * 
 *           Method must have the *same parameter as in the parent class.
 * 
 *           There must be an *IS-A relationship (inheritance).
 * 
 * @additionals Constructor of Super & Sub Class will be called.
 * 
 *              In-turn **TWO Objects will be created
 * 
 * @author pradeep_ramesh
 *
 */
public class MethodOverriding {

	public static void main(String[] args) throws Exception {

		/**
		 * @MethodOverRiding
		 * @Descritpion1.Constructor chaining will take place with the MethodOverriding
		 *                           i.e., super() will be called which when Subclass
		 *                           object is created - a total of two objects will be
		 *                           internally available
		 * @Descritpion2.Static Methods also will be available in the subclass if not
		 *                      OverRided
		 * @Descritpion3.private members cannot be OverRided
		 * @Descritpion4.Constructors are not OverRided but created[Constructor is not a
		 *                            Member of the class]
		 */
		NewShop shop = new NewShop();
		/**
		 ***********************
		 * @specifier *PRIVATE
		 * @possibility Same.CLASS
		 * @access cannot.access.Private.Members.outside.CLASS
		 */
		// *** nonStatic ***
		// shop.privateBathroom();
		// shop.privateAdditionalBathRoom();

		// *** Static ***
		// NewShop.privateStaticBathroom();

		/**
		 ***********************
		 * @specifier *DEFAULT
		 * @possibility Same.PACKAGE
		 * @access cannot.access.Default.Members.outside.PACKAGE
		 */
		// *** nonStatic ***
		// shop.defaultHall();
		// shop.defaultAdditionalHall();
		// shop.doors();
		// shop.stairCase(3);

		// *** Static ***
		// NewShop.defaultStaticHall();

		/**
		 ***********************
		 * @specifier *PROTECTED
		 * @possibility Same.PACKAGE
		 * @access cannot.access.Protected.Members.outside.PACKAGE
		 */
		// *** nonStatic ***
		// shop.protectedReception();
		// shop.protectedAdditionalReception();

		// *** Static ***
		// NewShop.protectedStaticReception();

		/**
		 ***********************
		 * @specifier *PUBLIC
		 * @possibility Outside.PACKAGE
		 * @access can.access.Public.Members.outside.PACKAGE
		 */
		// *** nonStatic ***
		shop.publicStairCase();
		shop.publicStairCase(true);

		// *** Static ***
		NewShop.publicStaticStairCase(6);
		NewShop.publicStaticStairCase(Integer.valueOf(6));

		AlternativeShop alternaterShop = new AlternativeShop();
		
	}
}
